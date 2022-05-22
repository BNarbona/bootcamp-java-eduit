package ar.com.educacionit.web.controllers;

import java.util.List;

import ar.com.educacionit.domain.Marca;
import ar.com.educacionit.services.MarcaService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.MarcaServiceImpl;

public class MarcaController {

	public static void main(String[] args) {
		
		MarcaService servicio = new MarcaServiceImpl();
		
		/*Marca marca = null;
		Long id = 4L;
		String nombre = "Topper";
		Long habilitada = 3L;
		
		marca = new Marca(id, nombre, habilitada);
		
		try {
			servicio.updateMarca(marca);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			marca = servicio.getById(1L);
		} catch (ServiceException e) {
			e.printStackTrace();
		}*/
		
		List<Marca> listadoMarcas=null;
		
		try {
			listadoMarcas = servicio.findAll();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		System.out.println(listadoMarcas);
		
		/*Marca marcanueva = new Marca ("Puma",2L);
		
		try {
			servicio.save(marcanueva);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		try {
			listadoMarcas = servicio.findAll();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		System.out.println(listadoMarcas);
		
		try {
			servicio.deleteMarca(3L);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
	}

}
