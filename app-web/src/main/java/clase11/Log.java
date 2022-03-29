package clase11;

public abstract class Log {
	
	private String msj;
	protected final Long id = 1l; // GENERO UNA CONSTANTE. Este valor no se puede modificar en ningun lugar porque es final
	//atributo final: solo lo puedo asignar desde el constructor.  
	
	protected static int cont = 0; 
	//Atributo Static: Pertenece a la clase, si cambia en algun lugar, cambia para todos
	//visible por cualquier instancia
	
	public Log () {
	
	}
	
	
	public Log ( String msj) {
		this.msj = msj;
	}
	

	public String getMsj() {
		String msj;
		if(this.msj==null) {
			msj ="";
		} else {
			msj = this.msj;
		}
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}


	public abstract void loguear();

}
