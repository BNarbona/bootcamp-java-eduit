package practica_semana5;

public class Pelicula extends Articulo {

	Float duracion;

	public Pelicula(String nombre, String Id, Float duracion) {
		super(nombre, Id);
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + "]";
	}
	
	
}
