package ar.com.educacionit.services.files;

public class SumaRecursiva {

	public static void main(String[] args) {
		
		//suma de N: N 5 > 5+4+3+2+1
		
		/*int n = 5;
		int suma = 0;
		
		while (n>0) {
			suma += n;
			n--;
		}*/
		
		int valorSumado= suma(5);
		System.out.println(valorSumado);
		
		//System.out.println(factorial(4));
		
		System.out.println(esPalindromo(""));
		System.out.println(esPalindromo("A"));
		System.out.println(esPalindromo("base"));
		System.out.println(esPalindromo("neuquen"));
		System.out.println(esPalindromo("neteen"));
		
	}
		//1-un caso base: donde termina la recursividad
		//2-un metodo que se invoca a si mismo 
		
		public static int suma (int n) {
			//5
			if(n>0) {
				return n + suma (n-1);
			}
			return n;
		}
		
		//Calcular el factorial de un numero N 
		
		public static int factorial (int n) {
			if(n>1) {
				return n * factorial(n-1);
			}
			return 1;	
		}
		
		public static boolean esPalindromo(String palabra) {
			if(palabra.length()<=1) {
				return true;
			} else {
				if(palabra.charAt(0)==palabra.charAt(palabra.length()-1)) 
					return esPalindromo(palabra.substring(1,palabra.length()-1));
				else 
					return false;
			}
			
		}

}
