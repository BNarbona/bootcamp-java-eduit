package practica_semana6_new;

import clase7.Articulo;

public class AccionListar implements IAccion {

	@Override
	public void exec(Articulo art) throws ExceptionBase {
		InMemoryDB.listAll();
		
	}

}
