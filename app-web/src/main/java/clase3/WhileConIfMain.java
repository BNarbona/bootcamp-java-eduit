package clase3;

import java.util.Scanner;

public class WhileConIfMain {

	public static void main(String[] args) {
		int contador = 0;
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese dato: ");
		numero = teclado.nextInt();
		while (numero != 0 && contador<6) {
			contador++;
			System.out.println("Ingrese dato: ");
			numero = teclado.nextInt();
		}
		System.out.println("El programa ha terminado");
		
		teclado.close();
	}
	

}
