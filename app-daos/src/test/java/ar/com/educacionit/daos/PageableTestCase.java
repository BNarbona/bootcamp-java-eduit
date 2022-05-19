package ar.com.educacionit.daos;

import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.ArticuloDaoMysqlImpl;
import ar.com.educacionit.domain.Articulo;

public class PageableTestCase {

	public static void main(String[] args) throws GenericException {
		
		ArticuloDao dao = new ArticuloDaoMysqlImpl();
		
		List<Articulo> articulos = dao.findPageable(1, 2);
		
		System.out.println(articulos.size()>0);
		
		System.out.println(articulos);
		

	}

}
