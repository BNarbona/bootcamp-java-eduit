package clase17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionEliminarDuplicados {

	public static void main(String[] args) {
		
		Collection<String> nombres1 = new ArrayList<>();
		
		nombres1.add("brenda");
		nombres1.add("brenda");
		nombres1.add("walter");
		nombres1.add("nicolas");
		
		System.out.println(nombres1);
		//toString() es de object, la collection lo sobreescribe
		
		// para eliminar duplicados
		nombres1 = new HashSet<>(nombres1); // le mando la coleccion por parametros
		System.out.println(nombres1);
		
		boolean esta = nombres1.contains("brenda");
		System.out.println(esta);
		
	Collection<String> nombres2 = new HashSet<>();
		
		nombres2.add("juan");
		nombres2.add("pedro");
	
	// junto dos listas
		
		Collection<String> nombres1y2 = new ArrayList<>();
	
		nombres1y2.addAll(nombres1);
		nombres1y2.addAll(nombres2);
		System.out.println(nombres1y2);
		
		boolean estaLista = nombres1y2.containsAll(nombres1);
		System.out.println(estaLista);
		
		
	}
}
