package practica_semana4;

public class Ovni extends Volador {

	private String origen;
	
	public Ovni(String nombre, int id, String origen) {
		super(nombre, id);
		this.origen = origen;
		
	}

	public void obtenerDatosV () {
		System.out.println("Origen: "+this.origen);
	}
	
}
