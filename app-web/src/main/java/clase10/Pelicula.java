package clase10;

import clase7.Articulo;

public class Pelicula extends Articulo {
	
	private String productora;
	
	public Pelicula(Long id, String nombre, String autor, Double precio, String urlImagen, String Productora) {
		super(id, nombre, autor, precio, urlImagen);
		this.productora = productora;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	@Override
	public void detalleHijo() {
		System.out.println("productora: "+this.productora);;
		
	}
	
	

}
