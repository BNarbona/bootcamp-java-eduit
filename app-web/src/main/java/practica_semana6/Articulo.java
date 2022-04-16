package practica_semana6;

public class Articulo {

	String nombre;
	String Id;
	
	public Articulo (String nombre, String Id) {
		this.nombre = nombre;
		this.Id = Id;
		
	}
	
	public Articulo () {
	}


	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + "]";
	}


	
}
