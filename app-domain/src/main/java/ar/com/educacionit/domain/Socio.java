package ar.com.educacionit.domain;

public class Socio implements Entity  {

	private Long id;
	private String apellido;
	private String nombre;
	private String codigo;
	
	
	public Socio(Long id, String apellido, String nombre, String codigo) {
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.codigo = codigo;
	}
	

	public Socio(String apellido, String nombre, String codigo) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.codigo = codigo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", codigo=" + codigo + "]";
	}


	
}
