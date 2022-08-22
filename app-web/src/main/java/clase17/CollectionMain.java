package clase17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionMain {

	public static void main(String[] args) {
		//tipo de datos: char, int, String
		//wrapper Integer, Long, Float
		//vectores -> son estaticos 
		
		
		
		//JAVA COLLECTION FRAMEWORK
		
		//creo
		Collection <String> nombres = new ArrayList<String>();
		
		//agrego elementos
		nombres.add("Brenda");
		nombres.add("Javi");
		nombres.add("Nawy");
		
		//tamaño
		int tamanio = nombres.size();
		System.out.println("tamaño: "+tamanio);
		System.out.println(nombres);
		
		//recorro
		for(String nombre:nombres) {
			System.out.println(nombre);
		}
		
		//eliminar elementos
		
		//nombres.remove("Brenda");
		//System.out.println(nombres);
		
		//eliminar todos
		//nombres.clear();
		
		//eliminar de manera segura
		//no se puede usar un for porque se redimenciona el vector, llamamos al ITERATOR
		Collection <String> nombresEliminados = new ArrayList<String>(); // nueva coleccion
		
		Iterator <String> itNombres = nombres.iterator();
		
		while(itNombres.hasNext()) {	//pregunto si hay siguiente
			String nombreActual = itNombres.next();			//me muevo al siguiente, porque estaria en el borde
			nombresEliminados.add(nombreActual);
			itNombres.remove(); 		// lo elimino
			
		}
		
		System.out.println(nombres.isEmpty());
		itNombres = nombresEliminados.iterator();
		
		while(itNombres.hasNext()) {
			System.out.println(itNombres.next());
		}
	}


}
