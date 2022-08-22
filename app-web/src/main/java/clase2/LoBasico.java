package clase2;

public class LoBasico {

	public static void main(String[] args) {
	
		int valor1 = 10;
		int valor2 = 5;
		int resultado;
		resultado = valor1 + valor2;
		
		System.out.println("La suma de " +valor1+" + "+valor2+ " es :"+(valor1+valor2));
		System.out.println(+valor1+" + "+valor2+" = "+resultado);
	
		float a = 1.5f;
		int b = (int)a; // casteo hacia abajo. Pierdo informacion
		System.out.println(a);
		System.out.println(b);
		
	
	}

}
