package clase13;

public class FormularioContrato extends Formulario {

	public FormularioContrato(String nombre) {
		super(nombre);
	}

	@Override
	public void definirEtiquetas() {
		
		Etiqueta direccion = new Etiqueta("Direccion");
		Etiqueta apellido = new Etiqueta("Apellido");
		Etiqueta nombre = new Etiqueta("Nombre");
		
		//super.agregarEtiqueta(direccion);
		//super.agregarEtiqueta(apellido);
		//super.agregarEtiqueta(nombre);
		
		//Los agrego todos juntos
		super.agregarEtiquetas(new Etiqueta[] {direccion,apellido,nombre});

	}
;
	
	
	
}
