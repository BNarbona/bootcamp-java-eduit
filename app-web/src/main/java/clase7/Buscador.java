package clase7;

import clase10.Libro;
import clase10.Musica;
import clase10.Pasatiempo;
import clase10.Pelicula;

public class Buscador {

	//atributos
	private String claveBusqueda;
	private Articulo [] articulos;
	private Integer cantidad;
	
	//constructor
	public Buscador() {
		claveBusqueda = ""; //inicia vacio para asegurarme de que no sea nulo. 
		articulos = new Articulo [0]; // creo el vector vacio
		cantidad = 0;
	}
	
	public Buscador(String claveBusqueda) {
		this.claveBusqueda=claveBusqueda; 
		articulos = new Articulo [0]; // creo el vector vacio
	
	}
	
	//metodos
	public void buscar () {
		//deberiamos pedir a algun servicio los resultados de la busqueda
		//ahora los vamos a "harcodear" para simular esto
		
		Articulo [] resultados = new Articulo [4];
		resultados[0] = new Libro (1l,"BATMAN (1930-1940) EL CABALLERO OSCURO","DC Comics",1540.90d,"https://www.tematika.com/media/catalog/Ilhsa/Imagenes/689621.jpg","6896");
		
		String [] temas = {"Tema1", "Tema2"};
		
		resultados[1] = new Musica (2l,"BATMAN (1950) UNA NUEVA DIMENSION","DC Comics",1540.90d,"https://www.tematika.com/media/catalog/Ilhsa/Imagenes/689624.jpg", temas);
		
		((Musica)resultados[1]).agregarTema("Tema nuevo");// hago un casteo--> downcasting
		
		resultados[2] = new Pasatiempo (3l,"BATMAN (1960) EL CRUZADO DE LA CAPA","DC Comics",1540.90d,"https://www.tematika.com/media/catalog/Ilhsa/Imagenes/689626.jpg", "unaMarca");
		resultados[3] = new Pelicula (4l,"BATMAN (1990) LA SOMBRA DEL MURCIELAGO","DC Comics",1540.90d,"", "La Productora");
	
		cantidad = resultados.length;
		articulos = resultados;
		
	}

	public void mostrarCantidadDeResultados() {
		System.out.println("Se encontraron "+this.cantidad+" resultados para "+this.claveBusqueda+"\n");
		
	} 
	
	public void detalle () {
	
			for (int i =0; i<this.cantidad; i++) {	
				Articulo unArticulo = this.articulos[i];
				unArticulo.detalle();//ahora pase parte del metodo detalle al propio articulo
					System.out.println("");
				
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
	
	public int getCantidadArticulos() {
		int cantidad=0;
		if(this.articulos != null) {
			this.cantidad=this.articulos.length;
		}
		return cantidad;
	}

	public String getClaveBusqueda() {
		return claveBusqueda;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}

	public Articulo[] getArticulos() {
		return articulos;
	}

	public void setArticulos(Articulo[] articulos) {
		this.articulos = articulos;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Articulo [] getResultados() {
		return this.articulos;
	}
	
	
	
}
