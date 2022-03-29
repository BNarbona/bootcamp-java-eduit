package clase11;

public class DefaultLog extends Log {

	public DefaultLog () {
		
	}
	
	public DefaultLog (String msj) {
		super(msj);
	}

	@Override
	public void loguear() {
		System.out.println("Sin implementacion");

	}

}
