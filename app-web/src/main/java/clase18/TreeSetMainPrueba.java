package clase18;

import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMainPrueba {

	public static void main(String[] args) {
		
		//Collection
		// >List: admiten duplicados
		// >Set: No admiten duplicados 

		Collection<String> nombres = new TreeSet<>();

		nombres.add("jose");
		nombres.add("jose");
		
		//los tipos wrapper de java implementan la interface Comparable
		
		System.out.println(nombres);
		
		//-----
		
		ChequePrueba c1 = new ChequePrueba("1002000","rio");//ROOT
	
		ChequePrueba c2 = new ChequePrueba("1002001","bbva");//DER
		
		ChequePrueba c3 = new ChequePrueba("1000000","patagonia");//IZQ
		
		ChequePrueba c4 = new ChequePrueba("1002000","patagonia");//IZQ
				
		//agrego un orden externo a la collection
		Collection<ChequePrueba> cheques = new TreeSet<>();
		cheques.add(c1);
		cheques.add(c2);
		cheques.add(c3);
		cheques.add(c4);
		
		System.out.println(cheques);
		
		
		Iterator <ChequePrueba> itChequePrueba = cheques.iterator();
		
		while(itChequePrueba.hasNext()) {
			itChequePrueba.next();
			itChequePrueba.remove();
		}
		
		System.out.println("Vacio?: "+ cheques.isEmpty());
		
		

	}

}
