package clase19;

import clase7.Articulo;

public class AccionModificar implements IAccion {

	@Override
	public void exec(Articulo art) throws ExceptionBase {
		Articulo articulo = InMemoryDB.getById(art.getId());
		
		if(articulo!=null) {
			InMemoryDB.update(art.getId(), art);
		}

	}

}
