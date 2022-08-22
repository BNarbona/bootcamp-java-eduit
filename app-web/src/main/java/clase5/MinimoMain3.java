package clase5;

import java.util.Arrays;

public class MinimoMain3 {

	public static void main(String[] args) {
		
		int [] edades = {36,40,28,24,17,17,17,30};
		
		
		if(edades.length!=0) {
			int minimo = encotrarMinimo(edades);
			int cantmin = contarMinimos(edades, minimo);
			int [] posiciones = posMinimos(edades,minimo,cantmin);	
			
			System.out.println("El mimimo es: "+minimo);
			System.out.println("La cantidad de minimos es: "+cantmin);
			System.out.println("Se encuentra en las posiciones: " + Arrays.toString(posiciones));
			
		} else {
			System.out.println("No hay edades");
		}

	}

	static int[] posMinimos(int[] edades, int minimo, int cantmin) {
		int [] pos = new int [cantmin];
		int j = 0;
		for (int i = 0; i<edades.length;i++) {
			if(edades[i]==minimo) {
				pos[j]=i;
				j++;
			}
		}
		return pos;
	}

	static int contarMinimos(int[] edades, int minimo) {
		int cantmin=0;
		for(int i=0;i<edades.length;i++) {
			if(minimo==edades[i]) {
				cantmin++;
			}
		}
		return cantmin;
	}

	static int encotrarMinimo(int[]edades) {
		int minimo = edades[0];
		for(int i=0;i<edades.length;i++) {
			if (edades[i]<minimo) {
				minimo=edades[i];
			}
		}
		return minimo;
	}
	
}
