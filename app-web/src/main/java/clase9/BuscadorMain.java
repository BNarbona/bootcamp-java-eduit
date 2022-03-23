package clase9;

import clase7.Buscador;
import clase7.Carrito;

public class BuscadorMain {

	public static void main(String[] args) {
		
		String claveBuscada = "Batman"; //aca deberiamos poner un scanner
		
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
		if(miBuscador.hayResultados()) {
			for (int i=0; i < miBuscador.getCantidadArticulos(); i++) {
				if(i%2==0) {
					miCarrito.agregarCarrito(miBuscador.getArticulos()[i]);
				}
			}
		}
		
		for(int i=0; i<miCarrito.obtenerCantidadItems() ; i++) {
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
		}
	}
}
