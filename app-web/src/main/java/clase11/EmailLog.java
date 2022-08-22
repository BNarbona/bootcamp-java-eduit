package clase11;

public class EmailLog extends Log {

	public EmailLog() {
		super();
		Log.cont++;
	}
	
	public EmailLog(String msj) {
		super(msj);
		Log.cont++;
	
	}

	@Override
	public void loguear() {
		System.out.println("Enviando por mail:/ "+super.getMsj()); // usar super. para saber de quien viene
																 //al usar super, nos aseguramos de usar el filtro de null para que no se rompa		
	}

}
