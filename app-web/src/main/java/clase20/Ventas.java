package clase20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

//clase inmutable
public class Ventas {
	
private Collection <String> ventas;
	
	public Ventas() {
		ventas = new HashSet <String>();
		 
		ventas.add("id_vendedor|fecha_venta|monto_venta");
		
		ventas.add("1|18/04/2022|1500");
		ventas.add("1|15/04/2022|2000");
		ventas.add("2|10/03/2022|14000");
		//ventas.add("1|16/04/2022|3500");
	}
	
	public Collection <Venta> getVentas() {
		
		Collection<Venta> ventas = new ArrayList<>();
		
		Iterator<String> itVentas = this.ventas.iterator();
		if(itVentas.hasNext()) {
			String primerLinea = itVentas.next();
			while(itVentas.hasNext()) {
				String siguienteLinea = itVentas.next();
				
				//Venta unaVenta = new Venta(siguienteLinea);
				//ventas.add(unaVenta);
				
			}
			
		}
		return ventas;
	}

	
	
}
