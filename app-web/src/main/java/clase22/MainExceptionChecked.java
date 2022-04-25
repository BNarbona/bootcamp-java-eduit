package clase22;

public class MainExceptionChecked {

	public static void main(String[] args) {
		
		try {
			saludar(null);
		} catch ( Exception e) {
			e.printStackTrace();  //muestra el mensaje de error y ademas donde se produjo
			String error = e.getMessage(); //me devuelve el mensaje de error solamente
			System.out.println(error); //
		}
		
	}

	static void saludar(String saludo) throws Exception{
		if(saludo == null) {
			throw new Exception("No informa saludo");
		}
		System.out.println("Mostrando Saludo=" + saludo);
	}
}
