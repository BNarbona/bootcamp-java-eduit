package ar.com.educacionit.daos.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.com.educacionit.daos.MenuDao;
import ar.com.educacionit.daos.db.exceptions.DuplicatedException;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Menu;

public class MenuDaoMySqlImpl extends JDBCBaseDaoImpl<Menu> implements MenuDao{

	public MenuDaoMySqlImpl() {
		super("menu");
	}

	@Override
	public Menu fromResultSetToEntity(ResultSet rs) throws SQLException {
		Long id = rs.getLong("id");
		String descripcion = rs.getString("menu");
		Long root = rs.getLong("root");
		Long idMenuPadre = rs.getLong("id_menu_padre");
		String link = rs.getString("link");
		//si root es 1 entonces es true, si no es false
		return new Menu(id, descripcion, root.equals(1L), idMenuPadre, link);
	}

	
}
