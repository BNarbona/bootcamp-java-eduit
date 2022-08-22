package clase13;

public abstract class Formulario {
	
	private String nombre;
	private Etiqueta[] etiquetas;
	
	public Formulario(String nombre) {
		this.etiquetas = new Etiqueta [0];
		this.nombre = nombre;
	}
	
	public abstract void definirEtiquetas();

	public void agregarEtiquetas(Etiqueta[] etiquetas2) {
		this.etiquetas = etiquetas2; 
		//hay que agregar
	}
	
	public void agregarEtiquetas(Etiqueta apellido) {
		Etiqueta[] nuevas = new Etiqueta [etiquetas.length+1];
		for(int i = 0; i<etiquetas.length;i++ ) {
			nuevas[i]=etiquetas[i];
		}
		nuevas[etiquetas.length] = apellido;
		etiquetas = nuevas;
	}

	public String compilarEtiquetas() {
		StringBuffer texto = new StringBuffer(this.nombre);
		texto.append("\n");
		for(Etiqueta e : etiquetas) {
			texto.append(e.getTag());
			texto.append(", ");
		}
		return texto.toString();
	}

}
