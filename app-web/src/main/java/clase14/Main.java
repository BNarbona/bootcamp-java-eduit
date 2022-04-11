package clase14;

public class Main {

	public static void main(String[] args) {
		
		Persona p = new Persona("Brenda", new Espanol());
	
		p.decir("Hablando idioma nativo");
		
		p.aprenderIdioma(new Ingles());
	
		p.decir("Hello", new Ingles());
		
		p.decir("Algo en italiano", new Italiano());
		
		p.aprenderIdioma(new Italiano());
		p.decirEnTodos("Hola");
		
	}

}
