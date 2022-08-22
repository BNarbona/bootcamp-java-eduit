package ar.com.educacionit.services;

import java.util.List;

import ar.com.educacionit.domain.Marca;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.MarcaServiceImpl;

public class ArticuloServiceImplTestCase {

	public static void main(String[] args) throws ServiceException {
		
		MarcaService service = new MarcaServiceImpl();
		List<Marca> list = service.findAll();
		
		System.out.println(list.size()>0);
		

	}

}
