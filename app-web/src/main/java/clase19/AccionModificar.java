package clase19;

import clase7.Articulo;

public class AccionModificar implements IAccion {

	@Override
	public void exec(Articulo algo) {
		Articulo art = InMemoryDB.getById(algo.getId());
		
		//tendriamos qeu ingresar algun dato en art
		
		if(art!=null) {
			InMemoryDB.update(algo.getId(), art);
		}

	}

}
