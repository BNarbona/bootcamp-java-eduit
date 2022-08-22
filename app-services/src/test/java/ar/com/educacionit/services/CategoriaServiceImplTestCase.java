package ar.com.educacionit.services;

import java.util.List;

import ar.com.educacionit.domain.Categoria;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.CategoriaServiceImpl;

public class CategoriaServiceImplTestCase {

	public static void main(String[] args) throws ServiceException {
		
		CategoriaService service = new CategoriaServiceImpl();
		List<Categoria> list = service.findAll();
		
		System.out.println(list.size()>0);
		

	}

}
