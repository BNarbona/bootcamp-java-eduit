package practica_semana4;

public abstract class Volador {

	private String nombre;
	private Integer id;
	
	public Volador (String nombre, Integer id) {
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	
	public abstract void obtenerDatosV();
	
	public void obtenerDatos() {
		System.out.println("Nombre: "+ this.nombre);
		System.out.println("ID: "+this.id);
		
		obtenerDatosV();
	}
	
	
	
}
