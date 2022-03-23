package clase3;

import java.util.Scanner;

public class PromedioDeNotas {

	public static void main(String[] args) {
	
		float primerNota;
		float segundaNota;
		float tercerNota;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la primer nota: ");
		primerNota = teclado.nextFloat();
		
		System.out.println("Ingrese la segunda nota: ");
		segundaNota = teclado.nextFloat();
		
		System.out.println("Ingrese la tercer nota: ");
		tercerNota = teclado.nextFloat();
		
		float promedio = (primerNota+segundaNota+tercerNota)/3;
		
		System.out.println("El promedio es: "+promedio);
		
		if (promedio <7) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Tiene que recuperar");	
		}
		teclado.close();
	}

}
