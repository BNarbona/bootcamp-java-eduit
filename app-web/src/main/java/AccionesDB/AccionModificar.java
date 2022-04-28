package AccionesDB;

import Excepciones.ExceptionBase;
import Excepciones.ExceptionNull;
import InMemoryDB.Articulo;
import InMemoryDB.InMemoryDB;

public class AccionModificar implements IAccion {

	@Override
	public void exec(Articulo art) throws ExceptionBase {
		if (art != null) {
			InMemoryDB.update(art.getId(), art);
		} else { throw new ExceptionBase ("Operacion invalida", new ExceptionNull("Accion no ejecutada. Articulo null."));
		}
	}
}
