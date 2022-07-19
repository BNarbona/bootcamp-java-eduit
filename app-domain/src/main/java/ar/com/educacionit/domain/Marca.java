package ar.com.educacionit.domain;

public class Marca implements Entity{

	private Long id;
	private String descripcion;
	private Long habilitada;
	
	public Marca(Long id, String descripcion, Long habilitada) {
		this.id=id;
		this.descripcion = descripcion;
		this.habilitada = habilitada;
	}
	
	public Marca(String descripcion, Long habilitada) {
		this.descripcion = descripcion;
		this.habilitada = habilitada;
		
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getHabilitada() {
		return habilitada;
	}

	public void setHabilitada(Long habilitada) {
		this.habilitada = habilitada;
	}

	@Override
	public String toString() {
		return "Marca [id=" + id + ", descripcion=" + descripcion + ", habilitada=" + habilitada
				+ "]";
	}
	
}
