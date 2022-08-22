package clase19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		
		//Asociamos los dias de la semana
		
		Map<Integer, String> mapSemana = new HashMap<>();
		
		mapSemana.put(1,"Lunes");
		mapSemana.put(2,"Martes");
		mapSemana.put(3,"Miercoles");
		mapSemana.put(4,"Jueves");
		mapSemana.put(5,"Viernes");
		mapSemana.put(6,"Sabado");
		mapSemana.put(7,"Domingo");
		
		System.out.println(mapSemana);
		
		boolean existe = mapSemana.containsKey(6);
		System.out.println("El sabado existe ?:" +existe);
		
		//eliminar elemento
		
		String value = mapSemana.remove(3);
		System.out.println(mapSemana);
		System.out.println(value);
		
		//borrar todo
		//mapSemana.clear();
		
		//obtengo las claves
		Set<Integer> keys = mapSemana.keySet();
		System.out.println(keys);
		
		//obtengo los valores
		
		Collection<String> values = mapSemana.values();
		System.out.println(values);
		
		//recorrer un mapa - para eliminar o reemplazar, usar el iterador
		
		for(Integer oneKey : keys ) {
			String oneValue = mapSemana.get(oneKey);
			System.out.println("Key: " + oneKey + " Value: "+oneValue);
		}
			
		Set<Map.Entry<Integer,String>> entrySet = mapSemana.entrySet();
		
		for(Map.Entry<Integer,String> oneEntry : entrySet) {
			Integer oneKey = oneEntry.getKey();
			String oneValue = oneEntry.getValue();
			
			System.out.println(oneKey +" - "+oneValue);
		}
	}

}
