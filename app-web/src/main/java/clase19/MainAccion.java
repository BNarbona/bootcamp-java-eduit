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
		Articulo articulo = construirArticulo();
		
		InMemoryDB.listAll();
		
	 	accion.exec(articulo);
		InMemoryDB.listAll();
		
		InMemoryDB.delete(articulo.getId());
		InMemoryDB.listAll();
	}
	
	private static Articulo construirArticulo() {
		Scanner teclado = new Scanner(System.in);
		Articulo art = new Libro();
		System.out.println("Ingrese el Titulo: ");
		art.setNombre(teclado.next());
		
		System.out.println("Ingrese el Id: ");
		art.setId(teclado.nextLong());
		
		System.out.println("Ingrese el precio: ");
		art.setPrecio(teclado.nextDouble());
		
		System.out.println("Ingrese el Autor: ");
		art.setAutor(teclado.next());
		
		art.setUrlImagen("-");
		
		teclado.close();
		return art;
		
	}

}
