package ar.com.educacionit.daos;

import java.util.List;

import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.CategoriaDaoMysqlImpl;
import ar.com.educacionit.domain.Categoria;

public class CategoriasDaosMySqlImplTest {

	public static void main(String[] args) throws GenericException {
		
		//test when_findAll_then_showlist
		//probamos algo muy acotado
		
		CategoriaDao dao = new CategoriaDaoMysqlImpl();
		
		List<Categoria> list = dao.findAll();
		
		System.out.println(list.size()>0);

	}

}
