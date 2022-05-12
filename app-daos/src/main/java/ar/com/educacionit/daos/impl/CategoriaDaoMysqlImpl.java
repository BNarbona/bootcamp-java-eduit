package ar.com.educacionit.daos.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.educacionit.daos.CategoriaDao;
import ar.com.educacionit.daos.db.AdministradorDeConexiones;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Categoria;


public class CategoriaDaoMysqlImpl extends JDBCBaseDaoImpl <Categoria>implements CategoriaDao {
	
	public CategoriaDaoMysqlImpl() {
		super("CATEGORIAS");
	}
	
	@Override
	public void save (Categoria categoria) throws GenericException {
		StringBuffer sql = new StringBuffer("INSERT INTO CATEGORIAS (DESCRIPCION,HABILITADA)VALUES(");
		sql.append("?,?)");
		
		try(Connection con = AdministradorDeConexiones.obtenerConexion()){
			try(PreparedStatement st = con.prepareStatement(sql.toString(),PreparedStatement.RETURN_GENERATED_KEYS)){
				st.setString(1, categoria.getDescripcion());
				st.setLong(2, categoria.getHabilitada());
				
				st.execute();
				
				try(ResultSet rs = st.getGeneratedKeys()){
					if(rs.next()) {
						Long id= rs.getLong(1);
						categoria.setId(id);
					}
				}
			}
		} catch (SQLException se) {
			throw new GenericException(se.getMessage(),se);
		} catch (GenericException ge) {
			throw new GenericException(ge.getMessage(),ge);
		}
	}

	@Override
	public void update(Categoria categoria) throws GenericException {
		StringBuffer sql = new StringBuffer("UPDATE CATEGORIAS SET ");
		if(categoria.getDescripcion()!=null) {
			sql.append("descripcion=?").append(",");
		}
		
		if(categoria.getHabilitada()!=null) {
			sql.append("habilitada=?").append(",");		
		}
		
		sql = new StringBuffer(sql.substring(0,sql.length()-1));
		sql.append(" WHERE ID=?");
	
		try (Connection con = AdministradorDeConexiones.obtenerConexion();) {
				try (PreparedStatement st = con.prepareStatement(sql.toString());){
					if(categoria.getDescripcion()!=null) {
						st.setString(1, categoria.getDescripcion());
					}
					
					if(categoria.getHabilitada()!=null) {
						st.setLong(2, categoria.getHabilitada());
					}
					
					st.setLong(3, categoria.getId());
					st.execute();	
				}
	
		} catch(GenericException ge) {
			throw new GenericException(ge.getMessage(), ge);
		} catch(SQLException se) {
		throw new GenericException(se.getMessage(), se);
		}
	}

	public Categoria fromResultSetToEntity(ResultSet rs) throws SQLException {	
		Long idCategoria = rs.getLong("id");
		String descripcion = rs.getString("descripcion");
		Long habilitada = rs.getLong("habilitada");
		return new Categoria(idCategoria,descripcion,habilitada);
	}


}
