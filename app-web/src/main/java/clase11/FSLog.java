package clase11;

public final class FSLog extends Log implements IEjecutable {
//final: corta la herencia de la clase
	public FSLog() {
		Log.cont++;
	}
	
	public FSLog(String msj) {
		super(msj);
		Log.cont++;
	
	}

	@Override
	public void loguear() {
		System.out.println("Escribiendo en c:/ "+super.getMsj()); // usar super. para saber de quien viene
																 //al usar super, nos aseguramos de usar el filtro de null para que no se rompa		
	}

	@Override
	public void ejecutar() {
		System.out.println("FS Log ejecutando el metodo Ejecutar");
	}

}
