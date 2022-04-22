package clase20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MainTest {

public static void main(String[] args) {
	
	 Vendedores archivoVendedores = new Vendedores();
	
	 Collection <Vendedor> vendedores = archivoVendedores.getVendedores();
	 
	 Ventas archivoVentas = new Ventas();
	 Collection <Venta> ventas = archivoVentas.getVentas();  
	 
	 
	 Map<Vendedor, Collection<Venta>> mapVentasXVendedor = new HashMap<>(); 
	 
	 //inicializo cada vendedor con una coleccion vacia
	 for(Vendedor vendedor : vendedores) {
		 mapVentasXVendedor.put(vendedor, new ArrayList<>());
	 }
	 
	 //INVESTIGAR HASHCODE E EQUALS
	 
	 for(Vendedor vendedor : vendedores) {
		 
		 // genero para cada vendedor una lista vacia... ver que no se borre 
		 for(Venta venta : ventas) {
			 if(vendedor.getId().equals(venta.getIdVendedor())) {
				// mapVentasXVendedor.put(vendedor, ventas);
				 //if(!mapVentasXVendedor.containsKey(vendedor)) {
				Collection <Venta> ventasDelVendedor =  mapVentasXVendedor.get(vendedor); // para cada vendedor voy guardando la venta en una coleccion
				ventasDelVendedor.add(venta);
			}
		}
	}
}
		 
		 
	 
	 
	 
	 
	// System.out.println(vendedores);
	 
}

