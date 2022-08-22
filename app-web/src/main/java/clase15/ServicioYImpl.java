package clase15;

public class ServicioYImpl implements Parseable <TipoY>{

	@Override
	public TipoY parse() {
		
		String dato = "";
		TipoY tipoY = new TipoY(dato);
			
		return tipoY;
	}

	
	
}
