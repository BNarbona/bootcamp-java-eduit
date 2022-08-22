package ar.com.educacionit.daos.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.educacionit.daos.CategoriaDao;
import ar.com.educacionit.daos.SocioDao;
import ar.com.educacionit.daos.db.AdministradorDeConexiones;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Socio;



public class SocioDaoMysqlImpl extends JDBCBaseDaoImpl <Socio> implements SocioDao {
	
	public SocioDaoMysqlImpl() {
		super("SOCIOS");
	}

	public Socio fromResultSetToEntity(ResultSet rs) throws SQLException {	
		Long idSocio = rs.getLong("id");
		String apellido = rs.getString("apellido");
		String nombre = rs.getString("nombre");
		String codigo = rs.getString("codigo");
		return new Socio(idSocio,apellido,nombre,codigo);
	}

	@Override
	public void setSave(Socio entity, PreparedStatement st) throws SQLException {
			st.setString(1, entity.getApellido());
			st.setString(2, entity.getNombre());
			st.setString(3, entity.getCodigo());
		}

	/*@Override
	public String getUpdateSQL(Categoria entity) {
		StringBuffer sql = new StringBuffer();	
		if(entity.getDescripcion()!=null) {
			sql.append("descripcion=?").append(",");
		}	
		if(entity.getHabilitada()!=null) {
			sql.append("habilitada=?").append(",");		
		}	
		sql = new StringBuffer(sql.substring(0,sql.length()-1));
		return sql.toString();	
	}*/

	/*@Override
	public void setUpdate(Categoria entity, PreparedStatement st) throws SQLException {
		if(entity.getDescripcion()!=null) {
			st.setString(1, entity.getDescripcion());
		}
		
		if(entity.getHabilitada()!=null) {
			st.setLong(2, entity.getHabilitada());
		}
	}*/

}
