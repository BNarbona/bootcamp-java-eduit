package ar.com.educacionit.ewb.controllers;


import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;

public class ArticuloController {

	public static void main(String[] args) {
		
		//necesito el service
		ArticulosService service = new ArticulosServiceImpl();
		
		
		try {
			List<Articulo> listado = new ArrayList<>();
			
			listado = service.findAll();
			System.out.println(listado);
			
			/*Articulo articulo =  service.getById(4l);
			
			System.out.println(articulo);
			
			
			
			//QUIERO ELIMINAR 
			/*service.deleteArticulo(articulo.getId());//ctrl+t
			
			System.out.println("se ha eliminado el articulo " + articulo.getId());
			
			articulo.setPrecio(500d);
			articulo.setStock(4l);
			service.updateArticulo(articulo);
			System.out.println(articulo);*/
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		/* dao > CRUD ok 
		 * daoimpl > 
		 * service
		 * controller
		 * */
	}

}
