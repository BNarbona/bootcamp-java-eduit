package ar.com.educacionit.daos.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.educacionit.daos.MarcaDao;
import ar.com.educacionit.daos.db.AdministradorDeConexiones;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Marca;


public class MarcaDaoMysqlImpl extends JDBCBaseDaoImpl<Marca> implements MarcaDao {
	
	public MarcaDaoMysqlImpl() {
		super("MARCAS");
	}

	@Override
	public void save (Marca marca) throws GenericException {
		StringBuffer sql = new StringBuffer("INSERT INTO MARCAS (DESCRIPCION,HABILITADA)VALUES(");
		sql.append("?,?)");
		
		try(Connection con = AdministradorDeConexiones.obtenerConexion()){
			try(PreparedStatement st = con.prepareStatement(sql.toString(),PreparedStatement.RETURN_GENERATED_KEYS)){
				st.setString(1, marca.getDescripcion());
				st.setLong(2, marca.getHabilitada());
				
				st.execute();
				
				try(ResultSet rs = st.getGeneratedKeys()){
					if(rs.next()) {
						Long id= rs.getLong(1);
						marca.setId(id);
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
	public void update(Marca marca) throws GenericException {
		StringBuffer sql = new StringBuffer("UPDATE MARCAS SET ");
		if(marca.getDescripcion()!=null) {
			sql.append("descripcion=?").append(",");
		}
		
		if(marca.getHabilitada()!=null) {
			sql.append("habilitada=?").append(",");		
		}
		
		sql = new StringBuffer(sql.substring(0,sql.length()-1));
		sql.append(" WHERE ID=?");
	
		try (Connection con = AdministradorDeConexiones.obtenerConexion();) {
				try (PreparedStatement st = con.prepareStatement(sql.toString());){
					if(marca.getDescripcion()!=null) {
						st.setString(1, marca.getDescripcion());
					}
					
					if(marca.getHabilitada()!=null) {
						st.setLong(2, marca.getHabilitada());
					}
					
					st.setLong(3, marca.getId());
					st.execute();	
				}
	
		} catch(GenericException ge) {
			throw new GenericException(ge.getMessage(), ge);
		} catch(SQLException se) {
		throw new GenericException(se.getMessage(), se);
		}
	}

	public Marca fromResultSetToEntity(ResultSet rs) throws SQLException {	
		Long idMarca = rs.getLong("id");
		String descripcion = rs.getString("descripcion");
		Long habilitada = rs.getLong("habilitada");
		return new Marca(idMarca,descripcion,habilitada);
	}
}
