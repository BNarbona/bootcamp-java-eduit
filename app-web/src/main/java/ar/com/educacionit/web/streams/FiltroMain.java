package ar.com.educacionit.web.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiltroMain {

	public static void main(String[] args) {
		
		List<Integer> edades = new ArrayList<>();
		edades.add(80);
		edades.add(120);
		edades.add(15);
		edades.add(10);
		edades.add(50);
		
		//filtrar los > a 55
		List<Integer> edadesFiltradas = new ArrayList<>();
		for(Integer edad: edades) {
			if(edad>50) {
				edadesFiltradas.add(edad);
			}
		}
		System.out.println(edadesFiltradas);
		
		//Conecto con el stream
		Stream<Integer> stEdades = edades.stream();
		//aplico la funcion intermedia
		stEdades = stEdades.filter(edad -> edad>55 );
		
		//aplico la funcion terminal 
		edadesFiltradas = stEdades.collect(Collectors.toList());
		System.out.println(edadesFiltradas);
		
		List<String> edadesString = new ArrayList<>();
		
		edadesString = 
				edades.stream()
				.filter(edad -> edad>50 && edad<120)
				.map(edad -> "EDAD: "+edad)
				.collect(Collectors.toList());
		
		System.out.println(edadesFiltradas);
		System.out.println(edadesString);
	}

}
