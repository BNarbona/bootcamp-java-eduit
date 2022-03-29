package clase10;

import clase7.Articulo;

public class Libro extends Articulo {

	//atributos propios isbn
	private String isbn;
	
	public Libro(Long id, String nombre, String autor, Double precio, String urlImagen, String isbn) {
		super(id, nombre, autor, precio, urlImagen);
		this.isbn = isbn;
		
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/*@Override
	public void detalle() {
		super.detalle(); // lo que sabe hacer el padre
		System.out.println("ISBN: "+this.isbn);//lo que sabe hacer el hijo
	}*/

	//libro esta obligado a implementar el metodo detalleHijo() de la clase padre
	
	@Override
	public void detalleHijo() {
		System.out.println("ISBN: "+this.isbn);
		
	}
	
}
