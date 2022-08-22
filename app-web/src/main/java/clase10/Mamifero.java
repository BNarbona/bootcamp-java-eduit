package clase10;

public class Mamifero extends Animal {
	// tiene lo mismo que un animal
	
	private Integer tiempoGestacion;
	// nacen de alguna manera particular
	// y tienen sus propios metodos

	public Mamifero (String color, Integer tiempoG) {
		super(color);
		
		//ahora que nacio el padre, seteo el hijo
		this.tiempoGestacion = tiempoG;
		
		super.getEdad();
	
	}
	
	
	
	
 

}
