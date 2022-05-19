package ar.com.educacionit.daos;

import java.util.List;
import java.util.Scanner;

import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.ArticuloDaoMysqlImpl;
import ar.com.educacionit.daos.impl.CategoriaDaoMysqlImpl;
import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.domain.Categoria;

public class CategoriasDaosMySqlImplTest {



		public static void main(String[] args) throws GenericException {

			
			CategoriaDao dao = new CategoriaDaoMysqlImpl();
			
			List<Categoria> categorias = dao.findAll();
			
			System.out.println(categorias.size()>0);
			
		}

}
