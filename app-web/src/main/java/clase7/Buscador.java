package clase7;

public class Buscador {

	//atributos
	String claveBusqueda;
	Articulo [] articulos;
	Integer cantidad;
	
	//constructor
	public Buscador() {
		claveBusqueda = ""; //inicia vacio para asegurarme de que no sea nulo. 
		articulos = new Articulo [0]; // creo el vector vacio
		cantidad = 0;
	}
	
	public Buscador(String claveBusqueda) {
		this.claveBusqueda=claveBusqueda; 
	
	}
	
	//metodos
	public void buscar () {
		//deberiamos pedir a algun servicio los resultados de la busqueda
		//ahora los vamos a "harcodear" para simular esto
		
		Articulo [] resultados = new Articulo [4];
		resultados[0] = new Articulo (1l,"BATMAN (1930-1940) EL CABALLERO OSCURO","DC Comics",1540.90d,"https://www.tematika.com/media/catalog/Ilhsa/Imagenes/689621.jpg");
		resultados[1] = new Articulo (2l,"BATMAN (1950) UNA NUEVA DIMENSION","DC Comics",1540.90d,"https://www.tematika.com/media/catalog/Ilhsa/Imagenes/689624.jpg");
		resultados[2] = new Articulo (3l,"BATMAN (1960) EL CRUZADO DE LA CAPA","DC Comics",1540.90d,"https://www.tematika.com/media/catalog/Ilhsa/Imagenes/689626.jpg");
		resultados[3] = new Articulo (4l,"BATMAN (1990) LA SOMBRA DEL MURCIELAGO","DC Comics",1540.90d,"");
	
		cantidad = resultados.length;
		articulos = resultados;
		
	}

	public void mostrarCantidadDeResultados() {
		System.out.println("Se encontraron "+this.cantidad+" resultados para "+this.claveBusqueda+"\n");
		
	} 
	
	public void detalle () {
	
			for (int i =0; i<this.cantidad; i++) {	
				Articulo unArticulo = this.articulos[i];
				
				System.out.println(unArticulo.nombre);
				System.out.println(unArticulo.autor);	
				System.out.println(unArticulo.precio);
				if (unArticulo.tieneImagen()) {
					System.out.println(unArticulo.urlImagen);
				} else {
					System.out.println("No tiene imagen, mostrar marca de agua");
				}
				System.out.println();
			
					//con el for each
					//for(String aux : miBuscador.articulos) { 
					//	System.out.println(aux);
					//}
					//con el for
					//for (int i =0; i<miBuscador.cantidad; i++) {	
					//	System.out.println(miBuscador.articulos[i]);
					//	}
			}
			
	}

	public boolean hayResultados() {
		return this.cantidad >0;
	}
	
}
