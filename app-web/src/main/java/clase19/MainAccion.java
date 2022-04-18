package clase19;

import java.util.Scanner;

import clase10.Libro;
import clase7.Articulo;

public class MainAccion {

	public static void main(String[] args) {
		
		/* Simulamos que el usuario ingresa una opcion
		 * 1-Alta
		 * 2-Baja
		 * 3-Modificar
		 * 4-Listar
		 */
		
		Integer op = 1;
		IAccion accion = AccionMap.getAccion(op);
		//Articulo articulo = construirArticulo();
		
		InMemoryDB.listAll();
	//	accion.exec(articulo);
		
		
	}
	
	/*private static Articulo construirArticulo() {
		Scanner teclado = new Scanner(System.in);
		Articulo art = new Libro();
		art.setAutor(teclado.next());
		art.setId(teclado.nextLong());
		
		//agregar los demas datos
		
		teclado.close();
		return art;
		
	}*/

}
