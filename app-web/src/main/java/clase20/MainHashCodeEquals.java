package clase20;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class MainHashCodeEquals {

	public static void main(String[] args) {
		
		Collection <Venta> coleccion = new HashSet<>();
		
		Date fecha = new Date();
		
		Venta v1 = new Venta (1L,fecha,200D);
		
		Venta v2 = new Venta (2L,fecha,300D);
		
		coleccion.add(v1);
		coleccion.add(v2);
		
		if(v1.equals(v2)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
			
		}
		
		System.out.println(coleccion);
		
	}

}
