package clase10;

public class repasoOOP {

	public static void main (String[] msj) {
		//crear una clase: molde para crear objetos
		
		Animal perro = new Animal("un color"); // la parte de la derecha, ejecutamos el constructor de la clase animal, es decir,
									 //reservamos el espacio de memoria donde se va a encontrar el objeto nuevo
		perro.hablar();
		
		System.out.println(perro.getColor());
		//instanciar un objeto de esa clase: objeto vivo
		
		//ejecutar un metodo de ese objeto:accion/ comportamiento del objeto vivo
	
		perro.setColor("Rojo");
		System.out.println(perro.getColor());
		
	}
	
}
