package clase7;

public class Articulo {

	Long id;
	String nombre;
	String autor;
	Double precio;
	String urlImagen;
	
	//uso alt + shift + s para generar autom el constructor
	public Articulo(Long id, String nombre, String autor, Double precio, String urlImagen) {
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.urlImagen = urlImagen;
	} 
	
	boolean tieneImagen() {
		//boolean tieneImagen = this.urlImagen==null&& this.urlImagen =="";
		//if(tieneImagen) {
		//	retur false;
		//reemplazo todo con el return
		
		return this.urlImagen!=null && this.urlImagen !="";
	}
	
	
}
