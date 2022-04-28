package ar.com.educacionit.domain;

public class Articulo {

	private Double id;
	private String modelo;
	private Float precio;

	public Articulo(Double id, String modelo, Float precio) {
		this.id = id;
		this.modelo = modelo;
		this.precio = precio;
	}

	public Double getid() {
		return id;
	}

	public void setid(Double id) {
		id = id;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	
	
}
