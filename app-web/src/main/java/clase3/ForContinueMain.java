package clase3;

import java.util.Scanner;

public class ForContinueMain {

	public static void main(String[] args) {
		
		int sumapares = 0;
		int sumaimpares = 0;
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {

			System.out.println("Ingrese un dato: ");
			numero = teclado.nextInt();
		

			if (numero == 0) {
				continue;
			}
			
			if(numero%2 == 0) {
				sumapares += numero;				
			} else {
				sumaimpares+=numero;
			}
		}
		
		System.out.println("Suma de pares= "+sumapares);
		System.out.println("Suma de impares= "+sumaimpares);
	
		teclado.close();
	}	

}
