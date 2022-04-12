package clase17;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		
		Set <Carrito1> carritosSet = new HashSet<Carrito1>();
		Carrito1 c1 = new Carrito1();
		carritosSet.add(c1);
		
		Carrito1 c2 = new Carrito1();
		carritosSet.add(c2);
		
		System.out.println(c1.equals(c2));
		
		System.out.println(carritosSet.contains(c1));
		System.out.println(carritosSet.contains(c2));
		
		
		
			
			
		
	}
	
}
