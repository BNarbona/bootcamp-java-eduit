package ar.com.educacionit.web.controllers;

import java.util.Scanner;

import ar.com.educacionit.domain.Categoria;
import ar.com.educacionit.services.CategoriaService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.CategoriaServiceImpl;

public class CrearCategoriaController {

	public static void main(String[] args) throws ServiceException {
		
		
		CategoriaService service = new CategoriaServiceImpl();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la descripcion: ");
		String descripcion = teclado.next();
		
		System.out.println("Habilitada 1-SI/ 2-NO: ");
		Long habilitada = teclado.nextLong();
		
		
		Categoria nuevo = new Categoria (descripcion, habilitada);
		service.save(nuevo);
	
		teclado.close();
	}
}
