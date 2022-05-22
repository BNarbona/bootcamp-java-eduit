package ar.com.educacionit.ewb.controllers;

import java.util.Scanner;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;

public class CrearArticuloController {

	public static void main(String[] args) throws ServiceException {
		
		
		ArticulosService service = new ArticulosServiceImpl();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el titulo: ");
		String titulo = teclado.next();

		System.out.println("Ingrese el codigo: ");
		String codigo = teclado.next();
		
		System.out.println("Ingrese el precio: ");
		Double precio = teclado.nextDouble();
		
		System.out.println("Ingrese el stock: ");
		Long stock = teclado.nextLong();
	
		System.out.println("Ingrese la marca: ");
		Long marcasId = teclado.nextLong();
		
		System.out.println("Ingresela categoria: ");
		Long categoriasId = teclado.nextLong();
		
		Articulo nuevo = new Articulo(titulo, codigo, null, precio, stock, marcasId, categoriasId);
		service.save(nuevo);
		
		teclado.close();
		
		
		/*try {
			service.save(nuevo);
		} catch (ServiceException e) {
			System.err.println(e.getMessage() + "," + e.getCause().getMessage());
			System.out.println("Existe, actualizando item");
			//si fue duplicado el codigo
			try {
				Articulo existente = service.getByCode(nuevo.getCodigo());
				
				//actualizo los datos del articulo 
				existente.setTitulo(nuevo.getTitulo());
				existente.setMarcasId(nuevo.getMarcasId());
				existente.setCategoriasId(nuevo.getCategoriasId());
				existente.setPrecio(nuevo.getPrecio());
				existente.setStock(nuevo.getStock());
				
				service.update(existente);
			
			} catch (ServiceException e1) {
				System.err.println(e1.getMessage() + "," + e1.getCause().getMessage());
			}
		}*/
	}
}
