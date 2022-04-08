package clase13;

public class FormularioLegales extends Formulario {

	
	
	public FormularioLegales(String nombre) {
		super(nombre);
	}

	public void definirEtiquetas() {
	Etiqueta apellido = new Etiqueta("Apellido");
	Etiqueta nombre = new Etiqueta("Nombre");
	
	super.agregarEtiquetas(apellido);
	super.agregarEtiquetas(nombre);
	
	}
}
