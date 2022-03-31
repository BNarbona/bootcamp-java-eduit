package practica_semana4;

public class Helicoptero extends Volador implements Aterrizable {

	private String modelo;
	private String tipo;
	
	public Helicoptero (String nombre, Integer id, String modelo, String tipo) {
		super(nombre, id);
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public void aterrizar() {
		System.out.println("Helicoptero "+super.getNombre()+" aterrizando\n");
	}
	
	public void obtenerDatosV () {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Tipo: "+this.tipo);
	}
	
}
