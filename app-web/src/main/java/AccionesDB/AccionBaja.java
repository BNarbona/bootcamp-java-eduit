package AccionesDB;

import Excepciones.ExceptionBase;
import Excepciones.ExceptionNull;
import InMemoryDB.Articulo;
import InMemoryDB.InMemoryDB;

public class AccionBaja implements IAccion {

	@Override
	public void exec(Articulo art) throws ExceptionBase {
		if (art != null) {
			InMemoryDB.delete(art.getId());
			System.out.println("Se ha dado de baja el articulo de id: " + art.getId());
		} else { throw new ExceptionBase ("Operacion invalida", new ExceptionNull("Accion no ejecutada. Articulo null."));
		}
	}
}