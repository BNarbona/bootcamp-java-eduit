package clase6;

public class ObjectsMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		Object  edad = new Integer (10);
		Object  nombre = "Brenda";
		@SuppressWarnings("deprecation")
		Object letra = new Character ('a');
		Object [] array = {edad, nombre, letra};

		
		//for each
		
		for (Object aux : array) {
			if (aux instanceof Integer) {
				Integer auxint = (Integer) aux;
				System.out.println(auxint);
			} else if(aux instanceof String) {
				String auxint = (String) aux;
				System.out.println(auxint);
			} else if(aux instanceof Character) {
				Character auxint = (Character) aux;
				System.out.println(auxint);
			}
			
		}

	}

}
