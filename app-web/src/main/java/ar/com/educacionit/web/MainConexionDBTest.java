package ar.com.educacionit.web;

import ar.com.educacionit.daos.ArticuloDao;
import ar.com.educacionit.daos.OrdenDao;
import ar.com.educacionit.daos.impl.ArticuloDaoImpl;
import ar.com.educacionit.daos.impl.OrdenDaoImpl;
import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.domain.Orden;

public class MainConexionDBTest {

	public MainConexionDBTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		ArticuloDao dao = new ArticuloDaoImpl();
		
		Articulo unArticulo = new Articulo(6d,"Algo",10f);
		
		dao.create(unArticulo);
		
		
		/*OrdenDao dao = new OrdenDaoImpl();
		
		//crear la orden para usar en la prueba
		Orden neworden = new Orden (1L,"Test",150f);
		
		dao.create(neworden);*/
		
	}

}
