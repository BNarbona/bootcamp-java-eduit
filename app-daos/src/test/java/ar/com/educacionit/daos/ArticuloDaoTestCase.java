package ar.com.educacionit.daos;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import ar.com.educacionit.daos.db.exceptions.DuplicatedException;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.ArticuloDaoMysqlImpl;
import ar.com.educacionit.domain.Articulo;

@TestMethodOrder(OrderAnnotation.class)

public class ArticuloDaoTestCase {

	/*@Order(1)
	@Test
	public void then_initialize_then_showIt() {
		ArticuloDao art = new ArticuloDaoMysqlImpl();
		assertNotNull(art);
		
	}
	
	@Order(2)
	@Test
	public void when_newArticulo_then_persistIt() throws GenericException, DuplicatedException {
		//probar el metodo save
		ArticuloDao art = new ArticuloDaoMysqlImpl();
		
		Articulo newArticulo = new Articulo("titulo","codigo6",new Date(), 1000d, 10l, 1l, 1l);
		
		art.save(newArticulo);
		assertNotNull(newArticulo.getId());
	}
	
	@Order(3)
	@Test
	public void when_findAll_then_listIt() throws GenericException, DuplicatedException {
		//probar el metodo findAll
		ArticuloDao art = new ArticuloDaoMysqlImpl();
		List<Articulo> arts = art.findAll(); 
		
		assertNotEquals(0,arts.size());
		assertEquals(20,arts.size());
	}
	
	@Order(4)
	@Test
	public void when_getOneByCode_then_showIt() throws GenericException, DuplicatedException {
		ArticuloDao art = new ArticuloDaoMysqlImpl(); 
		Articulo articulo = art.getByCode("1414");
	
		assertEquals("1414",articulo.getCodigo());
	}
	
	@Order(5)
	@Test
	public void when_exists_then_updateIt() throws GenericException, DuplicatedException {
		ArticuloDao art = new ArticuloDaoMysqlImpl();
		Articulo articulo = art.getByPK(14l);
		articulo.setTitulo("nuevo titulo");
		art.update(articulo);
		assertEquals("nuevo titulo",articulo.getTitulo());
	
	}
	
	@Order(6)
	@Test
	public void when_creat_update_delete_then_notExist() throws GenericException, DuplicatedException {
		ArticuloDao art = new ArticuloDaoMysqlImpl();
		
		Articulo newArticulo = new Articulo("titulo","codigo9",new Date(), 1000d, 10l, 1l, 1l);
		art.save(newArticulo);
		assertNotNull(newArticulo.getId());
		
		newArticulo.setTitulo("nuevo titulo");
		art.update(newArticulo);
		assertEquals("nuevo titulo",newArticulo.getTitulo());
		
		
		art.delete(newArticulo.getId());
		Articulo articuloDelete = art.getByPK(newArticulo.getId());
		assertNull(articuloDelete);
	
	}*/
	


	@Test
	public void when_duplicated_then_throwException() throws GenericException, DuplicatedException {
		//vamos a probar una excepcion por duplicado
		ArticuloDao art = new ArticuloDaoMysqlImpl();
		Articulo newArticulo = new Articulo("titulo","codigo9",new Date(), 1000d, 10l, 1l, 1l);
		
		art.save(newArticulo);
	
		assertThrows(DuplicatedException.class, ()-> {
			art.save(newArticulo);
		});
	}
	
}
