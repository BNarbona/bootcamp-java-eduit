package clase19;

import clase7.Articulo;

public class AccionDefault implements IAccion {

	@Override
	public void exec(Articulo algo) {
		System.out.println("No existe la opcion seleccionada");

	}

}
