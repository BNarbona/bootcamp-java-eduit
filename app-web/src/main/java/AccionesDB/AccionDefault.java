package AccionesDB;

import InMemoryDB.Articulo;

public class AccionDefault implements IAccion {

	@Override
	public void exec(Articulo art) {
		System.out.println("No existe la opcion seleccionada");

	}

}
