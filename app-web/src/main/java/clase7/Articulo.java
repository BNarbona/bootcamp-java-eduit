package clase7;

public abstract class Articulo {

	private Long id;
	private String nombre;
	private String autor;
	private Double precio;
	private String urlImagen;
	
	//uso alt + shift + s para generar autom el constructor
	public Articulo(Long id, String nombre, String autor, Double precio, String urlImagen) {
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.urlImagen = urlImagen;
	} 
	public Articulo() {
	} 
	
	//alt+shirt+s 
	public void detalle() {
		//el padre hace lo que sabe
		
		System.out.println(this.getNombre());
		System.out.println(this.getAutor());	
		System.out.println(this.getPrecio());
		if (this.tieneImagen()) {
			System.out.println(this.getUrlImagen());
		} else {
			System.out.println("No tiene imagen, mostrar marca de agua");
		}
		
		// ahora el hijo hace su parte
		this.detalleHijo();
		System.out.println("");
	}
	
	public abstract void detalleHijo();
	
	
	boolean tieneImagen() {
		//boolean tieneImagen = this.urlImagen==null&& this.urlImagen =="";
		//if(tieneImagen) {
		//	retur false;
		//reemplazo todo con el return
		
		return this.urlImagen!=null && this.urlImagen !="";
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	
	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + ", urlImagen="
				+ urlImagen + "]";
	}
	
	
	
}