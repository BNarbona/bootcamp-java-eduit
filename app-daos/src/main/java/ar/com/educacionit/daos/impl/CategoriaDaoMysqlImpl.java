package ar.com.educacionit.daos.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.daos.CategoriaDao;
import ar.com.educacionit.daos.db.AdministradorDeConexiones;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Categoria;


public class CategoriaDaoMysqlImpl implements CategoriaDao {
	

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
	public Categoria getByPK(Long id) throws GenericException {
		try(Connection con = AdministradorDeConexiones.obtenerConexion()) {
			try (Statement st = con.createStatement()) {
				try(ResultSet rs = st.executeQuery("SELECT * FROM CATEGORIAS WHERE ID = " + id)) { 
					Categoria categoria = null;
					if(rs.next()) {
						categoria = fromResultSetToEntity(rs);
					}
					return categoria;
				}
			} catch (SQLException e) {
				throw new GenericException("No se pudo obtener la Categoria id:"+id, e);
			}
		} catch (SQLException e) {
			throw new GenericException("No se pudo obtener la Categoria id:"+id, e);
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

	@Override
	public void delete(Long id) throws GenericException {
		String sql = "DELETE FROM CATEGORIAS WHERE ID = " + id;
		Connection con = null;
		try {
			con = AdministradorDeConexiones.obtenerConexion();		
		
			con.setAutoCommit(false);
			
			try(Statement st = con.createStatement()) {
				st.executeUpdate(sql);
			}			
			con.commit();
		}catch(GenericException ge) {
			rollback(sql, con);
			throw new GenericException(sql, ge);
		}catch(SQLException se) {
			rollback(sql, con);
			throw new GenericException(sql, se);
		}
	}

	private void rollback(String sql, Connection con) throws GenericException {
		try {
			con.rollback();
		} catch (SQLException e) {
			throw new GenericException(sql, e); 
		}
	}

	@Override
	public List<Categoria> findAll() throws GenericException {
		
	String sql = "SELECT * FROM CATEGORIAS";
	List<Categoria> listado = new ArrayList<>();
	
	try(Connection con = AdministradorDeConexiones.obtenerConexion();) {
		try(Statement st = con.createStatement()){
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				Categoria categoria;
				categoria = fromResultSetToEntity(rs);
				listado.add(categoria);
			}
			return listado;
	} catch (SQLException se) {
		throw new GenericException("No se pudieron obtener los registros", se);
		}
	} catch (SQLException se) {
		throw new GenericException("Error realizando la consulta: "+sql, se);
	} 
	
}

	private Categoria fromResultSetToEntity(ResultSet rs) throws SQLException {	
		Long idCategoria = rs.getLong("id");
		String descripcion = rs.getString("descripcion");
		Long habilitada = rs.getLong("habilitada");
		return new Categoria(idCategoria,descripcion,habilitada);
	}


}
