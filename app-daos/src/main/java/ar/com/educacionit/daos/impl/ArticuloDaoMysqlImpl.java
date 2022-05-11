package ar.com.educacionit.daos.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.com.educacionit.daos.ArticuloDao;
import ar.com.educacionit.daos.db.AdministradorDeConexiones;
import ar.com.educacionit.daos.db.exceptions.DuplicatedException;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Articulo;

public class ArticuloDaoMysqlImpl implements ArticuloDao {

	//private Connection con; vamos a crear la conexion en cada metodo
	
	public ArticuloDaoMysqlImpl() {
		/*try {
			this.con = AdministradorDeConexiones.obtenerConexion();
		} catch (GenericException e) {
			throw new IllegalArgumentException(e.getMessage(), e);
		}*/
	}
	
	@Override
	public void save(Articulo articulo) throws GenericException, DuplicatedException {// ctrl+f
		StringBuffer sql = new StringBuffer("INSERT INTO ARTICULOS (TITULO,CODIGO,PRECIO,CATEGORIAS_ID,MARCAS_ID,FECHA_CREACION,STOCK)VALUES(");
		sql.append("?,?,?,?,?,?,?)");
		
		try(Connection con = AdministradorDeConexiones.obtenerConexion()){
			try(PreparedStatement st = con.prepareStatement(sql.toString(),PreparedStatement.RETURN_GENERATED_KEYS)){
				st.setString(1, articulo.getTitulo());
				st.setString(2, articulo.getCodigo());
				st.setDouble(3, articulo.getPrecio());
				st.setLong(4, articulo.getCategoriasId());
				st.setLong(5, articulo.getMarcasId());
				st.setDate(6,new java.sql.Date(System.currentTimeMillis())); //lo tengo que convertir a sql, esta como java por defecto
				st.setLong(7,articulo.getStock());
				st.execute();
				
				try(ResultSet rs = st.getGeneratedKeys()){
					if(rs.next()) {
						Long id= rs.getLong(1);
						articulo.setId(id);
					}
					
				}
				
			}
			
		} catch (SQLException se) {
			if(se instanceof SQLIntegrityConstraintViolationException) {
				throw new DuplicatedException("No se ha podido insertar el articulo, integridad de datos violada",se);
			}
			throw new GenericException(se.getMessage(),se);
			
		} catch (GenericException ge) {
			throw new GenericException(ge.getMessage(),ge);
		}
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
						articulo = fromResultSetToEntity(rs);
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
	public Articulo getByCode(String code) throws GenericException {
	
		try(Connection con2 = AdministradorDeConexiones.obtenerConexion()) {
			try (Statement st = con2.createStatement()) {
				System.out.println("SELECT * FROM ARTICULOS WHERE CODIGO = " + code);
				try(ResultSet rs = st.executeQuery("SELECT * FROM ARTICULOS WHERE CODIGO = " + code)) { 
					Articulo articulo = null;
					if(rs.next()) {
						articulo = fromResultSetToEntity(rs);
					}
					return articulo;
				}
			} catch (SQLException e) {
				throw new GenericException("No se pudo obtener el articulo codigo: "+code, e);
			}
		} catch (SQLException e) {
			throw new GenericException("No se pudo obtener el articulo id: "+code, e);
		}
	}
	
	@Override
	public void update(Articulo articulo) throws GenericException {
		
		
		StringBuffer sql = new StringBuffer("UPDATE ARTICULOS SET ");
		if(articulo.getTitulo()!=null) {
			sql.append("titulo=?").append(",");
		}
		
		if(articulo.getCodigo()!=null) {
			sql.append("codigo=?").append(",");
			
		}
		
		if(articulo.getPrecio()!=null) {
			sql.append("precio=?").append(",");
		}
		
		if(articulo.getStock()!=null) {
			sql.append("stock=?").append(",");
		}
		if(articulo.getCategoriasId()!=null) {
			sql.append("categorias_id=?").append(",");
		}
		if(articulo.getMarcasId()!=null) {
			sql.append("marcas_id=?").append(",");
		}
		
		sql = new StringBuffer(sql.substring(0,sql.length()-1));
		sql.append(" WHERE ID=?");
	
		try (Connection con = AdministradorDeConexiones.obtenerConexion();) {
				try (PreparedStatement st = con.prepareStatement(sql.toString());){
					if(articulo.getTitulo()!=null) {
						st.setString(1, articulo.getTitulo());
					}
					
					if(articulo.getCodigo()!=null) {
						st.setString(2, articulo.getCodigo());
					}
					
					if(articulo.getPrecio()!=null) {
						st.setDouble(3, articulo.getPrecio());
					}
					
					if(articulo.getStock()!=null) {
						st.setLong(4, articulo.getStock());
					}
					if(articulo.getCategoriasId()!=null) {
						st.setLong(5, articulo.getCategoriasId());
					}
					if(articulo.getMarcasId()!=null) {
						st.setLong(6, articulo.getMarcasId());
					}
					
					st.setLong(7, articulo.getId());
					
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
		String sql = "DELETE FROM ARTICULOS WHERE ID = " + id;
		Connection con2 = null;
		try {
			con2 = AdministradorDeConexiones.obtenerConexion();		
			
			//auto commit en false
			con2.setAutoCommit(false);
			
			try(Statement st = con2.createStatement()) {
				
				st.executeUpdate(sql);//alt+shift+m
			}			
			con2.commit(); //AHORA ME IMPACTA LA DB
		}catch(GenericException ge) {
			rollback(sql, con2);
			throw new GenericException(sql, ge);
		}catch(SQLException se) {
			rollback(sql, con2);
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
	public List<Articulo> findAll() throws GenericException {
		
	String sql = "SELECT * FROM ARTICULOS";
	List<Articulo> listado = new ArrayList<>();
	
	try(Connection con = AdministradorDeConexiones.obtenerConexion();) {
		try(Statement st = con.createStatement()){
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
			Articulo articulo;
			articulo = fromResultSetToEntity(rs);
			listado.add(articulo);
			}
			return listado;
	} catch (SQLException se) {
		throw new GenericException("No se pudieron obtener los registros", se);
		}
	} catch (SQLException se) {
		throw new GenericException("Error realizando la consulta: "+sql, se);
	} 
	
}

	private Articulo fromResultSetToEntity(ResultSet rs) throws SQLException {	
		Long idArticulo = rs.getLong("id");
		String titulo = rs.getString("titulo");
		String codigo = rs.getString("codigo");
		Date fechaCreacion = rs.getDate("fecha_creacion");
		Double precio = rs.getDouble("precio");
		Long stock = rs.getLong("stock");
		Long marcasId = rs.getLong("marcas_id");
		Long categoriasId = rs.getLong("categorias_id");
		return new Articulo(idArticulo, titulo, codigo, fechaCreacion, precio, stock, marcasId, categoriasId);

	}


}
