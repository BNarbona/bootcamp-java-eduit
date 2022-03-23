package clase6;

import java.util.Scanner;

public class CalculadoraMain {

	public static void main(String[] args) {
		
		double valor1;
		double valor2;
		//double resultado;
		
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("Valor 1: ");
		valor1 = teclado.nextDouble();
		
		System.out.print("Valor 2: ");
		valor2 = teclado.nextDouble();
		
		Calculadora calc1 = new Calculadora (valor1, valor2, "Suma");
		
		calc1.sumar();

		teclado.close();

	}

}
