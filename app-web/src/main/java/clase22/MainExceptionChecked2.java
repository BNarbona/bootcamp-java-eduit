package clase22;

import java.util.Scanner;

public class MainExceptionChecked2 {

	public static void main(String[] args) {

		int a = 100;
		int b = 0;
		int c;
		
		boolean error = true;
		Scanner teclado = new Scanner(System.in);
		
		//valido el dato ingresado
		do {										
			System.out.println("Ingrese b");
			try {
				b = teclado.nextInt();
				error = false;
			} catch (Exception e) {
				teclado.next();  //limpio el teclado 
				continue;       //vuelve a iniciar el ciclo  
				
			}
			
		} while(error);
		
		
		
		
		try {
			System.out.println(Calculadora.dividir(a, b));
		} catch (DivisionException e) {
			 e.printStackTrace();
		} finally {
			teclado.close();
			
		}
	}
}
