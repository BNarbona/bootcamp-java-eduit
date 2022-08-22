package ar.com.educacionit.services.files;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MenuRecursivo {

	public static void main(String[] args) {
		
		List<Menu> menus = getMenuFromDB();
		
		mostrarMenu(menus);
		
	}

	private static void mostrarMenu(List<Menu> menus) {
		//caso base: array vacio
		
		for(Menu m: menus) {
			System.out.println(m.getTexto());
			if(m.isRoot()){
				System.out.println("---------");
			} 
			mostrarMenu(m.getSubMenu());
		}
	}
	
	

	

	private static List<Menu> getMenuFromDB() {
		List<Menu> submenu = new ArrayList<>();
		Menu html = new Menu("HTML", new ArrayList<>(), false);
		submenu.add(html);
		
		Menu references = new Menu("References",submenu,true);

		Menu hijosGuides = new Menu("Hijo1",new ArrayList<>(),false);
		List<Menu> subMenuHijosGuides = new ArrayList<>();
		subMenuHijosGuides.add(hijosGuides);
		
		submenu = new ArrayList<>();
		Menu mdn = new Menu("MDN", subMenuHijosGuides, false);
		submenu.add(mdn);
		
		Menu guides = new Menu("Guides",submenu,true);
		
		List<Menu> menus = new ArrayList<>();
		menus.add(references);
		menus.add(guides);
		
		return menus;
	}

}
