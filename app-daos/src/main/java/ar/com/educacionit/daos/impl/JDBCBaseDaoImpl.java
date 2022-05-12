package ar.com.educacionit.daos.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.daos.GenericDao;
import ar.com.educacionit.daos.db.AdministradorDeConexiones;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Articulo;

public abstract class JDBCBaseDaoImpl<T> implements GenericDao<T>{

	protected String tabla;
	
	public JDBCBaseDaoImpl(String tabla) {
		if(tabla == null) {
			throw new IllegalArgumentException("Debe indicar la tabla del DAO");
		}
		this.tabla = tabla;
	}

	@Override
	public T getByPK(Long id) throws GenericException {
		String sql = "SELECT * FROM " +this.tabla+ " WHERE ID = " + id;
		
		try(Connection con = AdministradorDeConexiones.obtenerConexion();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);){ 
					T entity = null;
					if(rs.next()) {
						entity = fromResultSetToEntity(rs);
					}
					return entity;
		} catch (SQLException e) {
			throw new GenericException("No se pudo obtener el entity " +this.tabla+ " id:"+id, e);
		}
	}

	@Override
	public List<T> findAll() throws GenericException {
	String sql = "SELECT * FROM " +this.tabla;
	
	try(Connection con = AdministradorDeConexiones.obtenerConexion();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		){
		List<T> listado = new ArrayList<>();
			while(rs.next()) {
			T entity;
			entity = fromResultSetToEntity(rs);
			listado.add(entity);
		}
		return listado;
		} catch (SQLException se) {
			throw new GenericException("Error realizando la consulta: "+sql, se);
		}	 
	}

	public void delete(Long id) throws GenericException {
		String sql = "DELETE FROM "+this.tabla+ " WHERE ID = " + id;
		try (
			Connection con = AdministradorDeConexiones.obtenerConexion();		
			Statement st = con.createStatement();){
				st.executeUpdate(sql);//alt+shift+m		
		}catch(GenericException ge) {
			throw new GenericException(sql, ge);
		}catch(SQLException se) {
			throw new GenericException(sql, se);
		}
	}
		
	public abstract T fromResultSetToEntity(ResultSet rs) throws SQLException;

}
