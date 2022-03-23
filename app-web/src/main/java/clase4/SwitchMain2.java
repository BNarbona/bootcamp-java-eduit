package clase4;

import java.util.Scanner;

public class SwitchMain2 {

	public static void main(String[] args) {
	
		int operacion; //la variable va fuera del do/while
		int continuar;
		double res;
		double a;
		double b;
		
		Scanner teclado = new Scanner(System.in);
		
		//alt+shit+m
		do {
			
			operacion = validarOpciones(1,4,teclado,"Ingrese operacion: \n1=suma, 2=resta; 3=multi, 4=div");
		
			a = leerData("Ingrese a", teclado);
			b = leerData("Ingrese b", teclado);
	
			switch(operacion) {
				case 1:
					res = a + b;			
					mostrarResultado(res, "+");
					break;
				case 2:			
					res = a - b;			
					mostrarResultado(res, "-");//f5
					break;
				case 3:			
					res = a * b;			
					mostrarResultado(res, "*");
					break;
				case 4:			
					if(b != 0) {
						res = a / b;
						mostrarResultado(res, "/");
					}else {
						System.out.println("No se puede divir por 0");
					}
					break;
					
			}		
		
			continuar =  validarOpciones (0,1,teclado,"Continuar 1-SI 0-NO");
			
		} while(continuar==1);
		
		teclado.close();
		System.out.println("Salida exitosa");
	}

	static int validarOpciones(int i, int j, Scanner teclado, String msj) {
		int opcion;
		do {
			System.out.println(msj);
			opcion = teclado.nextInt();
			
		}while (opcion<i || opcion>j);
		return opcion;
	}

	static double leerData(String mensaje, Scanner teclado) {
		System.out.println(mensaje);
		return teclado.nextDouble();
	}

	/*static void mostrarMenu() {
		System.out.println("Ingrese operacion: ");
		System.out.println("0=salir, 1=suma, 2=resta; 3=multi, 4=div");
	}*/

	static void mostrarResultado(double res, String operacion) {
		System.out.println("La operacion " + operacion + " = " + res);
	}
}

