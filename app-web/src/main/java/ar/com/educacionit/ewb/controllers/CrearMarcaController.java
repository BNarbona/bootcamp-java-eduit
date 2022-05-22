package ar.com.educacionit.ewb.controllers;

import java.util.Scanner;

import ar.com.educacionit.domain.Marca;
import ar.com.educacionit.services.MarcaService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.MarcaServiceImpl;

public class CrearMarcaController {

	public static void main(String[] args) throws ServiceException {
		
		
		MarcaService service = new MarcaServiceImpl();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la descripcion: ");
		String descripcion = teclado.next();
		
		System.out.println("Habilitada 1-SI/ 2-NO: ");
		Long habilitada = teclado.nextLong();
		
		System.out.println("Ingrese el CUIT: ");
		String cuit = teclado.next();
		
		Marca nuevo = new Marca (descripcion, habilitada, cuit);
		service.save(nuevo);
	
		teclado.close();
	}
}
