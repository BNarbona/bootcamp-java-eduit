package practica_semana6_new;

import clase7.Articulo;
import clase7.Libro;

public class MainAccion {

	public static void main(String[] args) {
	
		/* Simulamos que el usuario ingresa las opciones
		 * 1-Alta
		 * 2-Baja
		 * 3-Modificar
		 * 4-Listar
		 */

		//creacion de algunos articulo para prueba
		Articulo articulo1 = new Libro(-10l,"Batman","Bruce Wayne",2000d,"","isbn111");
		Articulo articulo2 = new Libro(002l,"Harry Potter","J. K. Rowling",3000d,"","isbn222");
		Articulo articulo3 = new Libro(003l,"The Maze Runner","James Dashner",2500d,"","isbn333");
		
		//simulacion de ingreso de un articulo a la DB, con la opcion 1-Alta (articulo con Id incompatible)
		Integer op = 1;
		IAccion accion = AccionMap.getAccion(op);		
		try {
			accion.exec(articulo1);
		} catch (Exception e) {
			System.err.println(e.getCause().getMessage());
		}
		
		//ingreso de dos articulos a la DB para las pruebas
		try {
			accion.exec(articulo2);
			accion.exec(articulo3);
		} catch (Exception e) {
			System.err.println(e.getCause().getMessage());
		}
	 	
		//simulacion de la opcion 4-listar
	 	op = 4;
	 	accion = AccionMap.getAccion(op);
	 	try {
			accion.exec(articulo1);
		} catch (Exception e) {
			System.err.println(e.getCause().getMessage());
		}
	
	 	//simulacion de la opcion 2-Baja (de un articulo que no existe en la DB)
	 	op = 2;
	 	accion = AccionMap.getAccion(op);
		try {
			accion.exec(articulo1);
		} catch (Exception e) {	
			System.err.println(e.getCause().getMessage());
		}
		
		//simulacion de la opcion 3-Modificar (se cambia el importe del articulo)
		articulo2 = new Libro(002l,"Harry Potter","J. K. Rowling",5000d,"","isbn222");
		
		op = 3;
		accion = AccionMap.getAccion(op);
		try {
			accion.exec(articulo2);
		} catch (Exception e) {
			System.err.println(e.getCause().getMessage());
		}
	
		
		//se vuelve a listar con la opcion 4
	 	op = 4;
	 	accion = AccionMap.getAccion(op);
	 	try {
			accion.exec(articulo3);
		} catch (Exception e) {
			System.err.println(e.getCause().getMessage());
		}
	 	
	 	//Se da de baja toda los elementos de la DB
	 	op = 2;
	 	accion = AccionMap.getAccion(op);
		try {
			accion.exec(articulo2);
			accion.exec(articulo3);
		} catch (Exception e) {	
			System.err.println(e.getCause().getMessage());
		}
		
		//se vuelve a listar con la opcion 4 (para ver excepcion por base de datos vacia)
	 	op = 4;
	 	accion = AccionMap.getAccion(op);
	 	try {
			accion.exec(articulo3);
		} catch (Exception e) {
			System.err.println(e.getCause().getMessage());
		}
		
	}
	
}
