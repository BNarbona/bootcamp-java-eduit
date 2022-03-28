package clase10;

import clase7.Articulo;
import clase7.Buscador;

public class BuscadorHerenciaMain {

	public static void main(String[] msj) {

	Buscador miBuscador = new Buscador("iron man");
	//miBuscador.claveBusqueda = claveBuscada;
	miBuscador.buscar();
	
	miBuscador.mostrarCantidadDeResultados();
	
	Articulo [] resultados = miBuscador.getResultados(); // por ejemplo si quiero obtener los resultados para algo

	for(Articulo aux:resultados) {
		
		aux.detalle(); // Muestra lo del padre + lo del hijo segun corresponda
		
		if(aux instanceof Libro) {
			Libro l = (Libro)aux;// me quedo con la parte de la clase hija	
			l.getIsbn();
		}
		if(aux instanceof Musica) {
			Musica m = (Musica)aux;
			m.getListaTemas();
		} else {
			Pasatiempo p = (Pasatiempo)aux;
			p.getMarca();
		}

		
	}
	

	}
	
}
