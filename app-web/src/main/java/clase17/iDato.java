package clase17;

import java.util.Collection;

public interface iDato <T> {

	//puedo devolver un elemento
	public T buscarPorId();
	
	//puedo devolver una coleccion de elementos
	public Collection <T> buscarTodos();
	
}
