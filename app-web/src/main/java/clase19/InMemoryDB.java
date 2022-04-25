package clase19;

import java.util.HashMap;
import java.util.Map;

import clase7.Articulo;

public class InMemoryDB {

	static private Map<Long,Articulo> db = new HashMap<>();
	
	public static void save (Long key, Articulo valor) throws ExceptionBase {
		if(key<0) {
			throw new ExceptionBase ("Operacion invalida", new ExceptionId ("Articulo no ingresado. El valor del Id debe ser un numero mayor a 0."));
		} else {
			InMemoryDB.db.put(key, valor);
		}
	}
	
	public static void update (Long key, Articulo newValue) {
		InMemoryDB.db.replace(key, newValue);
	}
	
	public static void delete (Long key) {
		InMemoryDB.db.remove(key);
	}
	
	
	public static Articulo getById(Long key) throws ExceptionBase {
		Articulo value = null;
		if(InMemoryDB.db.containsKey(key)) {
			value = InMemoryDB.db.get(key);
		} else {
			throw new ExceptionBase ("Operacion invalida", new ExceptionNoId("Accion no ejecutada. El Id no existe."));
		}
		return value;
	}

	public static void listAll() throws ExceptionBase {
		if(InMemoryDB.db.isEmpty()) {
			throw new ExceptionBase("Operacion invalida", new ExceptionEmpty("La base de datos esta vacia."));
		}
		System.out.println(InMemoryDB.db.values());
		
	}
	
}
