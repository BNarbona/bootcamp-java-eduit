package ar.com.educacionit.daos.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.daos.MarcaDao;
import ar.com.educacionit.daos.db.AdministradorDeConexiones;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Marca;


public class MarcaDaoMysqlImpl implements MarcaDao {
	

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
	public Marca getByPK(Long id) throws GenericException {
		try(Connection con = AdministradorDeConexiones.obtenerConexion()) {
			try (Statement st = con.createStatement()) {
				try(ResultSet rs = st.executeQuery("SELECT * FROM MARCAS WHERE ID = " + id)) { 
					Marca marca = null;
					if(rs.next()) {
						marca = fromResultSetToEntity(rs);
					}
					return marca;
				}
			} catch (SQLException e) {
				throw new GenericException("No se pudo obtener la marca id:"+id, e);
			}
		} catch (SQLException e) {
			throw new GenericException("No se pudo obtener la marca id:"+id, e);
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

	@Override
	public void delete(Long id) throws GenericException {
		String sql = "DELETE FROM MARCAS WHERE ID = " + id;
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
	public List<Marca> findAll() throws GenericException {
		
	String sql = "SELECT * FROM MARCAS";
	List<Marca> listado = new ArrayList<>();
	
	try(Connection con = AdministradorDeConexiones.obtenerConexion();) {
		try(Statement st = con.createStatement()){
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				Marca marca;
				marca = fromResultSetToEntity(rs);
				listado.add(marca);
			}
			return listado;
	} catch (SQLException se) {
		throw new GenericException("No se pudieron obtener los registros", se);
		}
	} catch (SQLException se) {
		throw new GenericException("Error realizando la consulta: "+sql, se);
	} 
	
}

	private Marca fromResultSetToEntity(ResultSet rs) throws SQLException {	
		Long idMarca = rs.getLong("id");
		String descripcion = rs.getString("descripcion");
		Long habilitada = rs.getLong("habilitada");
		return new Marca(idMarca,descripcion,habilitada);
	}


}
