package clase4;

public class Funcion {
	
	//main seria la funcion principal
	//podemos crear muchas funciones
	public static void main(String[] args) {
		
	funcionsumados(5);
	mostrarparidad(4);

	}

	static float funcionsumados (float num){
		float resultado = num + 2;
		return resultado;
	}
	
	static float dividir (float a, float b) {
		float res;
		if(b != 0 ) {
			res = a/b;
		} else {
			System.out.println("b no puede valer 0");
			res = -1;
		}
		return res;
		
	}
	
	static void mostrarparidad (int numero) {
		boolean res = (numero%2 == 0 )?true:false;
		System.out.println(res?"Es par":"Es impar");
	}
	
}
