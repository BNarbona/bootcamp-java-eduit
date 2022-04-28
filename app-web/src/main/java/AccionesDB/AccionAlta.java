package AccionesDB;

import Excepciones.ExceptionBase;
import InMemoryDB.Articulo;
import InMemoryDB.InMemoryDB;

public class AccionAlta implements IAccion {

	@Override
	public void exec(Articulo art) throws ExceptionBase {
		InMemoryDB.save(art.getId(), art);	
	}

}
