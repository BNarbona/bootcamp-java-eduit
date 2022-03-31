package practica_semana4;

public class Superman extends Volador implements Aterrizable {

	private String colorCapa;
	
	public Superman(String nombre, Integer id, String colorCapa) {
		super(nombre, id);
		this.colorCapa = colorCapa;
		
	}

	public void aterrizar() {
		System.out.println("Superman "+super.getNombre()+" aterrizando\n");
	}

	public void obtenerDatosV () {
		System.out.println("Color de la capa: "+this.colorCapa);
	}
}
