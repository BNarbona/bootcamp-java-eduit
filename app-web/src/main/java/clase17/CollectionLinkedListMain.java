package clase17;

import java.util.LinkedList;
import java.util.Vector;

public class CollectionLinkedListMain {

	public static void main(String[] args) {
		
		LinkedList <String> nombres = new LinkedList<>();
		
		nombres.add("Brenda");
		
		nombres.addFirst("Javier");
		nombres.addLast("Nahuel");
		
		for(String nombre:nombres) {
			System.out.println(nombre);
		}
		
		//Vector <String> vector = new Vector<>(); //es mas lento, no se usa mucho
		
	}
	
}
