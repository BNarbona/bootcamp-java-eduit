package clase19;

import clase7.Articulo;

public class AccionAlta implements IAccion {

	@Override
	public void exec(Articulo algo) {
		
		//usa la base de datos InMemory
		InMemoryDB.save(algo.getId(), algo);

	}

}
