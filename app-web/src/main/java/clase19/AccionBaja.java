package clase19;

import clase7.Articulo;

public class AccionBaja implements IAccion {

	@Override
	public void exec(Articulo algo) {
		InMemoryDB.delete(algo.getId());
		System.out.println("Se ha dado de baja el articulo de id: "+algo.getId());

	}

}
