package clase19;

import clase7.Articulo;

public class AccionDefault implements IAccion {

	@Override
	public void exec(Articulo art) {
		System.out.println("No existe la opcion seleccionada");

	}

}
