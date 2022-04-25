package clase19;

import clase7.Articulo;

public class AccionAlta implements IAccion {

	@Override
	public void exec(Articulo art) throws ExceptionBase {
		
		//usa la base de datos InMemory
		InMemoryDB.save(art.getId(), art);
	
	}

}
