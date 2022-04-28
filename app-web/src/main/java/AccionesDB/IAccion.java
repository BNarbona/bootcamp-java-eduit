package AccionesDB;

import Excepciones.ExceptionBase;
import InMemoryDB.Articulo;

public interface IAccion {

	public void exec (Articulo ctx) throws ExceptionBase;
	
}
