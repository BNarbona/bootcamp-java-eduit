package practica_semana4;

public class Ovni extends Volador {

	private String modelo;
	
	public Ovni(String nombre, int id, String modelo) {
		super(nombre, id);
		this.modelo = modelo;
		
	}

	public void obtenerDatosV () {
		System.out.println("Modelo: "+this.modelo);
	}
	
}
