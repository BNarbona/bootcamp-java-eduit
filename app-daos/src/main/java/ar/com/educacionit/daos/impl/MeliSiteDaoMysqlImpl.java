package ar.com.educacionit.daos.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ar.com.educacionit.daos.ArticuloDao;
import ar.com.educacionit.daos.MeliSiteDao;
import ar.com.educacionit.daos.db.AdministradorDeConexiones;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.domain.Site;

public class MeliSiteDaoMysqlImpl extends JDBCBaseDaoImpl <Site> implements MeliSiteDao {

	public MeliSiteDaoMysqlImpl() {
		super("MELI_SITE");
	}


	public Site fromResultSetToEntity(ResultSet rs) throws SQLException {	
		Long id = rs.getLong("id");
		String code = rs.getString("code");
		String name = rs.getString("name");
		return new Site(id,code, name);
	}

	@Override
	public String getUpdateSQL(Site entity) {
		StringBuffer sql = new StringBuffer();
		if(entity.getName()!=null) {
			sql.append("name=?").append(",");
		}
		sql = new StringBuffer(sql.substring(0,sql.length()-1));

		return sql.toString();
	}

	@Override
	public void setUpdate(Site entity, PreparedStatement st) throws SQLException {

		int idx=1;
		if(entity.getName()!=null) {
		st.setString(idx++, entity.getName());
		}

	}


	@Override
	public void setSave(Site entity, PreparedStatement st) throws SQLException {
		st.setString(1, entity.getCode());
		st.setString(2, entity.getName());
	}


}