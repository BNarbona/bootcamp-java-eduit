package ar.com.educacionit.web.controllers.console;


import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;

public class ArticuloController {

	public static void main(String[] args) throws ServiceException {
		
		//necesito el service
		ArticulosService service = new ArticulosServiceImpl();
		
		Articulo art;
		art = service.getByCode("1414");
		art.setPrecio(100000d);
		service.update(art);
		System.out.println(art);
		

		/*try {
			List<Articulo> listado = new ArrayList<>();
			
			listado = service.findAll();
			System.out.println(listado);
			
			Articulo articulo =  service.getById(4l);
			
			System.out.println(articulo);

			//service.deleteArticulo(8l);//ctrl+t
			
			/*
			articulo.setPrecio(500d);
			articulo.setStock(4l);
			service.updateArticulo(articulo);
		System.out.println(articulo);
		
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}*/
		
		/* dao > CRUD ok 
		 * daoimpl > 
		 * service
		 * controller
		 * */
	}

}
