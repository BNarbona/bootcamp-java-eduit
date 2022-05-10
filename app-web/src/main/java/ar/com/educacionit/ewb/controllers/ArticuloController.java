package ar.com.educacionit.ewb.controllers;


import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;

public class ArticuloController {

	public static void main(String[] args) {
		
		//necesito el service
		ArticulosService service = new ArticulosServiceImpl();
		
		//TODO implementar un menu de acciones
		try {
			Articulo articulo =  service.getById(1l);
			
			System.out.println(articulo);
			
			//QUIERO ELIMINAR 
			service.deleteArticulo(articulo.getId());//ctrl+t
			
			System.out.println("se ha eliminado el articulo " + articulo.getId());
			
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
