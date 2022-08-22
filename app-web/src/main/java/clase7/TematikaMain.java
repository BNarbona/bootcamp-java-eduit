package clase7;

import java.util.Scanner;

public class TematikaMain {

	public static void main(String[] args) {
		
		//String claveBuscada = "Batman"; //aca deberiamos poner un scanner
		Scanner teclado = new Scanner (System.in);
		
		
		int continuar;
	
		do {
			String claveBuscada;
			do {
				System.out.println("Ingrese la clave de busqueda");
				claveBuscada = teclado.next();
					
			} while("".equals(claveBuscada)||"".equals(claveBuscada.trim()));
				
			
			Buscador miBuscador = new Buscador(claveBuscada);
			//miBuscador.claveBusqueda = claveBuscada;
			miBuscador.buscar();
			
			miBuscador.mostrarCantidadDeResultados();
			
			if(miBuscador.hayResultados()) {
				miBuscador.detalle();
			}
			//creo un carrito
			
			Carrito miCarrito = new Carrito();
			
			// agrego al carrito los articulos pares para simular
			/*if(miBuscador.hayResultados()) {
				for (int i=0; i < miBuscador.getCantidadArticulos(); i++) {
					if(i%2==0) {
						miCarrito.agregarCarrito(miBuscador.getArticulos()[i]);
					}
				}
			}
			
			for(int i=0; i<miCarrito.items.length; i++) {
				System.out.println(miCarrito.items[i].articulo.getNombre());
				System.out.println(miCarrito.items[i].articulo.getPrecio());
				System.out.println(miCarrito.items[i].cantidad);
			}
			
			System.out.println(miCarrito.obtenerPrecio());
			
			miCarrito.eliminarItem(miCarrito.items[1]);
		
			for(int i=0; i<miCarrito.items.length; i++) {
				System.out.println(miCarrito.items[i].articulo.getNombre());
				System.out.println(miCarrito.items[i].articulo.getPrecio());
				System.out.println(miCarrito.items[i].cantidad);
			}*/
		
		System.out.println("Desea continuar: 1-SI / 0-NO");
		continuar = teclado.nextInt();
		
		} while(continuar==1);
		System.out.println("Saliendo del buscador");
		
		teclado.close();
	}
}
