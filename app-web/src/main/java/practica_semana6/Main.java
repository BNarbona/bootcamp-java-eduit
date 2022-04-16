package practica_semana6;

public class Main {

	public static void main(String[] args) {
		
		//creacion de elementos de diferentes tipos para las pruebas
		Libro libroA = new Libro ("EL RESPLANDOR", "0001l", "KING, STEPHEN");
		Libro libroB = new Libro ("DOCTOR SUEÑO", "0002l",	"KING, STEPHEN");
		Libro libroC = new Libro ("CAMARA SECRETA", "0003l", "ROWLING, J.K.");
		Pelicula peliA = new Pelicula ("LOS INTOCABLES", "0004p", 120f);
		Pelicula peliB = new Pelicula ("AQUAMAN", "0005p", 140f); 
		
		
		Articulo [] lista = new Articulo[0];
		CollectionCustom<Articulo> elementos = new CollectionCustomImpl(lista);
		
		//agregado de elementos al principio del array
		elementos.addFirst(libroA);
		elementos.addFirst(libroB);
		System.out.println(elementos.toString()+"\n");
		
		//agregado de elementos al final del array
		elementos.addLast(libroC);
		elementos.addLast(peliA);
		elementos.addLast(peliB);
		System.out.println(elementos.toString());
		System.out.println("Tamaño del listado: "+elementos.size()+"\n");
		//Comprobacion de array vacio
		System.out.println("El listado de elementos esta vacio?: "+elementos.empty()+"\n");
		
		//eliminacion de un elemento que existe en el array
		Articulo eliminado; 
		eliminado = elementos.remove(libroC);
		if(eliminado==null) {
			System.out.println("No existe el elemento que quiere eliminar en la lista"+"\n");
		} else {
			System.out.println("Se ha eliminado el elemento "+eliminado+"\n");
		}
		
		System.out.println(elementos.toString()+"\n");
		
		//eliminacion de un elemento que ya NO existe en el array
		eliminado = elementos.remove(libroC);
		if(eliminado==null) {
			System.out.println("No existe el elemento que quiere eliminar en la lista"+"\n");
		} else {
			System.out.println("Se ha eliminado el elemento "+eliminado+"\n");
		}
		
		//eliminacion de todos los elementos 
		elementos.removeAll();
		System.out.println("La lista esta vacia?: "+elementos.empty());
		
		System.out.println("Tamaño del listado: "+elementos.size());
	}

}
