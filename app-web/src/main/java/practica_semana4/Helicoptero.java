package practica_semana4;

public class Helicoptero extends Volador implements Aterrizable {

	private String marca;
	private String tipo;
	
	public Helicoptero (String nombre, Integer id, String marca, String tipo) {
		super(nombre, id);
		this.marca = marca;
		this.tipo = tipo;
	}

	public void aterrizar() {
		System.out.println("Helicoptero "+super.getNombre()+" aterrizando\n");
	}
	
	public void obtenerDatosV () {
		System.out.println("Color de la capa: "+this.marca);
		System.out.println("Tipo: "+this.tipo);
	}
	
}
