package clase4;

import java.util.Scanner;

public class DoMain {

	public static void main(String[] args) {
		// Leer un dato hasta que el usuario digite 0

		int numero;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese un numero: ");
			numero = teclado.nextInt();
			
		}while(numero!=0);
		
		System.out.println("Saliendo del programa..");
		teclado.close();
	}

}
