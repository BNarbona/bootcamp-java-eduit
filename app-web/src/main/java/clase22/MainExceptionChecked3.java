package clase22;

public class MainExceptionChecked3 {

	public static void main(String[] args) {
		
		try {
			System.out.println(Calculadora.calcular(0, 0, "log"));
		} catch (OperationBaseException e) {
			
			String message = e.getMessage();
			Throwable cause = e.getCause();
			System.out.println(message);
			System.out.println(e.getCause().getMessage());
			e.printStackTrace();
			
		} catch (InvalidOperation io) {
			
		}
		
		System.out.println("continua");
		
	}
}
