package ar.com.educacionit.web.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;

public class FiltroMainObjetos {

	public static void main(String[] args) throws ServiceException {
		
		Set<Integer> edades = Set.of(10,50,20,120);
		
		Integer suma = 0;
		for(Integer edad: edades) {
			suma += edad; 
		}
		System.out.println(suma);
		
		suma = edades.stream()
			.reduce(0,(x,y) -> x+y);
		System.out.println(suma);
		
		Collection<Articulo> arts = new ArticulosServiceImpl().findAll();
		
		Double sumaD = arts.stream()
			.map(articulo -> articulo.getPrecio())
			.reduce(0D, (x,y) -> x+y);
		
			System.out.println(sumaD);
			
		Set<String> palabras = Set.of("Hola", "Brenda");
		String unaSolaPalabra = palabras.stream()
				.reduce("", (x,y) -> x + " - " + y);
		System.out.println(unaSolaPalabra);
		
	}

}
