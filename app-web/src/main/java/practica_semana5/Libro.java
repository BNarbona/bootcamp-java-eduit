package practica_semana5;

public class Libro extends Articulo {

	String autor;

	public Libro(String nombre, String Id, String autor) {
		super(nombre, Id);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + "]";
	}

	
	
}
