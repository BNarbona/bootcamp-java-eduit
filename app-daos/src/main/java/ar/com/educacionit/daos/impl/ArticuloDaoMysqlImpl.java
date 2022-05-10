package ar.com.educacionit.daos.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import ar.com.educacionit.daos.ArticuloDao;
import ar.com.educacionit.daos.db.AdministradorDeConexiones;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Articulo;

public class ArticuloDaoMysqlImpl implements ArticuloDao {

	//private Connection con;
	
	
	
	public ArticuloDaoMysqlImpl() {
		/*try {
			this.con = AdministradorDeConexiones.obtenerConexion();
		} catch (GenericException e) {
			throw new IllegalArgumentException(e.getMessage(), e);
		}*/
	}
	
	@Override
	public Articulo save(Articulo Articulo) {// ctrl+f
		
		return Articulo;
	}

	@Override
	public Articulo getByPK(Long id) throws GenericException {
		//Connection
		try(Connection con2 = AdministradorDeConexiones.obtenerConexion()) {
			//Statement
			try (Statement st = con2.createStatement()) {
				
				//execute del sql
				//ResultSet
				System.out.println("SELECT * FROM ARTICULOS WHERE ID = " + id);
				try(ResultSet rs = st.executeQuery("SELECT * FROM ARTICULOS WHERE ID = " + id)) { 
					Articulo articulo = null;
					if(rs.next()) {
						//convertir el ResultSet a Articulo
						//extraer los datos que vienen en el rs
						Long idArticulo = rs.getLong("id");
						String titulo = rs.getString("titulo");
						String codigo = rs.getString("codigo");
						Date fechaCreacion = rs.getDate("fecha_creacion");
						Double precio = rs.getDouble("precio");
						Long stock = rs.getLong("stock");
						Long marcasId = rs.getLong("marcas_id");
						Long categoriasId = rs.getLong("categorias_id");
						
						articulo = new Articulo(idArticulo, titulo, codigo, fechaCreacion, precio, stock, marcasId, categoriasId);
					}
					return articulo;
				}
			} catch (SQLException e) {
				throw new GenericException("No se pudo obtener el articulo id:"+id, e);
			}
		} catch (SQLException e) {
			throw new GenericException("No se pudo obtener el articulo id:"+id, e);
		}
	}

	@Override
	public Articulo update(Articulo ArticuloToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws GenericException {
		String sql = "DELETE FROM ARTICULOS WHERE ID = " + id;
		Connection con2 = null;
		try {
			con2 = AdministradorDeConexiones.obtenerConexion();		
			
			//auto commit en false
			con2.setAutoCommit(false);
			
			try(Statement st = con2.createStatement()) {
				
				st.executeUpdate(sql);//alt+shift+m
			}			
			con2.commit();
		}catch(GenericException ge) {
			rollback(sql, con2);
			throw new GenericException(sql, ge);
		}catch(SQLException se) {
			rollback(sql, con2);
			throw new GenericException(sql, se);
		}
	}

	private void rollback(String sql, Connection con2) throws GenericException {
		try {
			con2.rollback();
		} catch (SQLException e) {
			throw new GenericException(sql, e); 
		}
	}

}
