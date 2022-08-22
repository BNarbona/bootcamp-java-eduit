package clase20;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Vendedores {

	private Collection <String> vendedores;
	
	public Vendedores() {
		vendedores = new HashSet <String>();
		
		//primera linea del archivo 
		vendedores.add("id|nombre|sucursal");
		
		//cada vendedor
		vendedores.add("1|juan|1");
		vendedores.add("2|pedro|1");
		vendedores.add("3|nico|2");
		vendedores.add("4|santiago|3");
	}
	
	//necesito un metodo publico
	public Collection <Vendedor> getVendedores() {
		//¿que necesito hacer?
		//parsear
		/*for(int i = 1;i < this.vendores.size();i++) {
		}*/
		
		//otra forma
		
		Collection<Vendedor> vendedores = new HashSet<>();
		
		Iterator<String> itVendedores = this.vendedores.iterator();
		if(itVendedores.hasNext()) {
			String primerLinea = itVendedores.next();//id|nombre|sucursal
			while(itVendedores.hasNext()) {
				String siguienteLinea = itVendedores.next();//1|juan|1
				
				//ESTA ES UNA FORMA
				/*String[] arrayVendedor = siguienteLinea.split("\\|");	
				//covierto los datos
				Long id = Long.parseLong(arrayVendedor[0]);
				String nombre = arrayVendedor[1];
				Integer sucursal = Integer.parseInt(arrayVendedor[2]);	
				//creo un vendedor
				Vendedor unVendedor = new Vendedor(id, nombre, sucursal);*/
				//guardo los vendedores
				
				//ESTA OTRA FORMA ES MAS "LIMPIA"
				Vendedor unVendedor = new Vendedor(siguienteLinea);
				vendedores.add(unVendedor);
				
			}
			
		}
		return vendedores;
	}
}


