package clase20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MainTest {

	public static void main(String[] args) {

		Vendedores archivoVendedores = new Vendedores();

		Collection<Vendedor> vendedores = archivoVendedores.getVendedores();

		Ventas archivoVentas = new Ventas();
		Collection<Venta> ventas = archivoVentas.getVentas();

		Map<Vendedor, Collection<Venta>> mapVentasXVendedor = new HashMap<>();

		// inicializo cada vendedor con una coleccion vacia
		for (Vendedor vendedor : vendedores) {
			mapVentasXVendedor.put(vendedor, new ArrayList<>());
		}

		// INVESTIGAR HASHCODE E EQUALS

		for (Vendedor vendedor : vendedores) {
			for (Venta venta : ventas) {
				if (vendedor.getId().equals(venta.getIdVendedor())) {
					// mapVentasXVendedor.put(vendedor, ventas);
					// if(!mapVentasXVendedor.containsKey(vendedor)) {
					Collection<Venta> ventasDelVendedor = mapVentasXVendedor.get(vendedor); 
					// para cada vendedor voy guardando la venta en una coleccion
					ventasDelVendedor.add(venta);
				}
			}
		}

		for(Vendedor vendedor: vendedores) {
			System.out.println(vendedor);
			Collection <Venta> ventasVendedor =  mapVentasXVendedor.get(vendedor);
			if(ventasVendedor.isEmpty()) {
				System.out.println("No tiene ventas");
			} else {
			for(Venta venta: ventasVendedor) {
				System.out.println(venta);
			}	
			}
		}
	}

}

