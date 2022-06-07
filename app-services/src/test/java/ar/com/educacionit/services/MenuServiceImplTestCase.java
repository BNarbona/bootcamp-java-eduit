package ar.com.educacionit.services;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.com.educacionit.domain.Menu;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.MenuServiceImpl;

public class MenuServiceImplTestCase {

	/*@Test
	public void when_find_then_show_menu_list() throws ServiceException {
		MenuService service = new MenuServiceImpl();
		List<Menu> menuList = service.findAll();
		assertTrue(menuList.isEmpty());
	}*/
	
	@Test
	public void when_find_1_then_show_it() throws ServiceException {
		MenuService service = new MenuServiceImpl();
		List<Menu> menuList = service.findAll();
		System.out.println(menuList);
		assertEquals(1,menuList.size());
		
	}
}
