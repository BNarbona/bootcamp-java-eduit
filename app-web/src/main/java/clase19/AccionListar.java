package clase19;

import clase7.Articulo;

public class AccionListar implements IAccion {

	@Override
	public void exec(Articulo algo) {
		System.out.println("Listando..."+algo);
	}

}
