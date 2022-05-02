package ar.com.educacionit.domain;

public class Articulo {

	private Long id;
	private String modelo;
	private Float precio;

	public Articulo(Long id, String modelo, Float precio) {
		this.id = id;
		this.modelo = modelo;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	
	
}
