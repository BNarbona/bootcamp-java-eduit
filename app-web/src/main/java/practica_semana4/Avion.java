package practica_semana4;

public class Avion extends Volador implements Aterrizable {

	private Integer numPasajeros;
	
	public Avion(String nombre, Integer id, Integer numPasajeros ) {
		super(nombre, id);
		this.numPasajeros = numPasajeros;
		
	}

	public void aterrizar() {
		System.out.println("Avion "+super.getNombre()+" aterrizando\n");
	}
	
	public void obtenerDatosV () {
		System.out.println("Numero de pasajeros: "+this.numPasajeros);
	}
}
