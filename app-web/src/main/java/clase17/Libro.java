package clase17;

import java.io.Serializable;
import java.util.Collection;

public class Libro implements iDato <Serializable> {

	// puedo poner cualquier cosa como <T>, MENOS datos primitivos
	@Override
	public Serializable buscarPorId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection <Serializable> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
