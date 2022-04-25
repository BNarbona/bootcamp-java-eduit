package clase19;

import clase7.Articulo;

public class AccionBaja implements IAccion {

	@Override
	public void exec(Articulo art) throws ExceptionBase {
		
		Articulo articulo = InMemoryDB.getById(art.getId());
		
		if(articulo!=null) {
			InMemoryDB.delete(art.getId());
			System.out.println("Se ha dado de baja el articulo de id: "+art.getId());
		}
	}

}
