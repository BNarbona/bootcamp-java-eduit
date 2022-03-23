package clase5;

import java.util.Scanner;

public class PisoMain {

	public static void main(String[] args) {
		int tamanio;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el tamaño del edificio");
		
		tamanio = teclado.nextInt();
		
		String [] edificio = new String [tamanio];
		
		System.out.println("Tamaño: "+tamanio);
		System.out.println("Tamaño: "+edificio.length);	

		for(int piso=0;piso<edificio.length;piso++) {
			edificio[piso]="persona-"+piso;	
		}
		
		for(int piso=0;piso<edificio.length;piso++) {
			String fulano = edificio[piso];
			System.out.println(fulano+" vive en el piso "+piso);
		}
		teclado.close();
	}

}
