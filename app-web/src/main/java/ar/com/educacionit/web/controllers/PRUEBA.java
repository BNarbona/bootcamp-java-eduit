package ar.com.educacionit.web.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension;

import ar.com.educacionit.domain.Menu;
import ar.com.educacionit.services.MenuService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.MenuServiceImpl;

public class PRUEBA {

public static void main(String[] args) throws ServiceException {
	
	
	MenuService ms = new MenuServiceImpl();
	
	List<Menu> menus = ms.findAll();
	
	List<Menu> menusOrden = buildMenu(menus);
	mostrarMenu(menusOrden);
	
	
}
	/*private static void mostrarMenu(List<Menu> menus) {
	
		for(Menu m: menus) {
			System.out.println(m.getTexto());
			if(m.isRoot()){
				System.out.println("---------");
			} 
			mostrarMenu(m.getSubMenu());
		}
	}*/

	private static void mostrarMenu(List<Menu> menus) {

		for(Menu m: menus) {
			System.out.println(m.getTexto());
			if(m.isRoot()){
				System.out.println("---------");
			} 
			mostrarMenu(m.getSubMenu());
		}
		}

	
	private static List<Menu> buildMenu(List<Menu> listMenu){
		
		Map<Long, Menu> mapRoot = new HashMap();
		List<Menu> menuFiltrado = new ArrayList();
		
		for(Menu m: listMenu) {
			if(m.isRoot()) {
				mapRoot.put(m.getId(), m);
			}
		}
		
		for(Menu m : listMenu) {
			if(!m.isRoot()) {
				if(m.getIdMenuPadre()!=null && m.getId() !=0){
					Menu menuRoot = mapRoot.get(m.getIdMenuPadre());
					if(menuRoot != null) {
						menuRoot.getSubMenu().add(m);
					} else {
						addToParent(listMenu, m);
					}
				}
			}
		}
		
		List<Menu> menuFiltrados = new ArrayList<Menu>();
		menuFiltrados.addAll(mapRoot.values());
		return menuFiltrados;
		
	}
	
	private static void addToParent(List<Menu> listMenu, Menu m) {
		boolean exists = false;
		for(Menu aux: listMenu) {
			if(m.getIdMenuPadre().equals(aux.getId())){
				aux.getSubMenu().add(m);
			}
		}
	}


	/*private static List<Menu> guardarSubMenu(List<Menu> menus){
		List<Menu> sm = new ArrayList<>();
		List<Menu> root = new ArrayList<>();
		List<Menu> menu2 = new ArrayList<>();
		for(Menu m : menus) {
			if(m.isRoot()) {
				root.add(m);
			} else {
				menu2.add(m);
			}
		}	
		
		for(int i=0; i<root.size();i++) {
			Menu m = root.get(i);
			for(int j=0; j<menu2.size();j++) {
				Menu x = root.get(j);
				if ( x.getIdMenuPadre().equals(m.getId()) ){
					sm.add(x);
				}
			}
			root.get(i).setSubMenu(sm);
			sm.clear();
		}
		return root;
	}
	
	
	private static List<Menu> buildMenu1(List<Menu> listMenu){
		
		List<Menu> resto = new ArrayList();
		List<Menu> subMenu = new ArrayList();
		List<Menu> menuFiltrado = new ArrayList();
		
		
		for(Menu m: listMenu) {
			if(m.isRoot()) {
				menuFiltrado.add(m);
			}
			else {
				resto.add(m);
			}
		}
		
		Iterator <Menu> itMenu = listMenu.iterator(); 
		
		while (itMenu.hasNext () ){		
															// uso el hasNext() para preguntar si hay otro elemento
			Menu menuActual = itMenu.next();
			
			
			if(!menuActual.isRoot()) {
				if(m.getIdMenuPadre()!=null && m.getId() !=0){
					Menu menuRoot = mapRoot.get(m.getIdMenuPadre());
					if(menuRoot != null) {
						menuRoot.getSubMenu().add(m);
					} else {
						addToParent(listMenu, m);
					}
				}
			}
			
			
			
			
			if(m.getIdMenuPadre().equals(n.getId())){
				subMenu.add(m);
				
			} else {
		
			}
			itMenu.remove ();
			
			
			
		
		
		}

		
		
		
		for(Menu m: resto) {
			for(Menu n: menuFiltrado) {
				if(m.getIdMenuPadre().equals(n.getId())){
					subMenu.add(m);
				} else {
					
				//ver el subsub	
				}
			}
			
		}	
	}
	
	private static void addToParent1(List<Menu> menureducido, Menu m) {
		boolean exists = false;
		for(Menu aux: listMenu) {
			if(m.getIdMenuPadre().equals(aux.getId())){
				aux.getSubMenu().add(m);
				exists = true;
			}
		}
	}*/
	
}
	
	
