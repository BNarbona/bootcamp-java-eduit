package clase8;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		
		int cantidadAlumnos;
		String[] nombre;
		String[] apellido;
		Double[] promedio;
		
		
		Scanner teclado = new Scanner(System.in);
		
		do {
		
		System.out.print("Ingrese la cantidad de alumnos a procesar: ");
		cantidadAlumnos = teclado.nextInt();
		} while (cantidadAlumnos<=0);
		
		nombre = new String[cantidadAlumnos];
		apellido = new String[cantidadAlumnos];;
		promedio = new Double[cantidadAlumnos];;
		
		
		for(int i=0; i<cantidadAlumnos;i++) {
			Integer cantidadNotas=0;
			System.out.println("\nIngrese los datos del alumno "+(i+1)+"");
			nombre[i] = ingresarDatos("Nombre", teclado);
			apellido[i] = ingresarDatos("Apellido", teclado);	
			cantidadNotas = Integer.parseInt(ingresarDatos("Cantidad de notas", teclado));
			promedio[i] = calcularPromedio(cantidadNotas, teclado);
		}
		
			calificacionMasAlta(promedio, nombre, apellido);
			calificacionMasBaja(promedio, nombre, apellido);
			condicionAlumnos(promedio, nombre, apellido);	
			
			teclado.close();
			
	}
	

		private static String ingresarDatos(String dato, Scanner teclado) {
			System.out.print(dato+" :");
			return teclado.next();
		}
		
		private static Double calcularPromedio(int cantidadNotas, Scanner teclado) {
			Double promedio = 0d;
			for(int i=0; i<cantidadNotas;i++) {
				System.out.print("Ingrese la nota "+(i+1)+": ");
				Double nota = teclado.nextDouble();
				if (nota>=0&&nota<=10) {
					promedio+=nota;
				} else {
					System.out.println("Ingrese un valor de nota entre 0 y 10");
					i--;
				}
			}
			return promedio/cantidadNotas;
		}
		
		private static void calificacionMasAlta(Double[] promedio, String[] nombre, String[] apellido) {
			Double maximo = encotrarMaximo(promedio);
			int cantmax = contarPromedios(promedio, maximo);
			int [] posMaximos = posicionesPromedios(promedio,maximo,cantmax);	
			
			System.out.println("\nLa calificacion mas alta es: "+maximo);			
			System.out.println("El/los alumno/s con la nota mas alta es/son: ");
			for (int j =0; j<cantmax; j++) {
				int pos = posMaximos[j];
				System.out.println(nombre[pos]+" "+apellido[pos]);
			}
		}
		
		private static void calificacionMasBaja(Double[] promedio, String[] nombre, String[] apellido) {
			Double minimo = encotrarMinimo(promedio);
			int cantmin = contarPromedios(promedio, minimo);
			int [] posMinimos = posicionesPromedios(promedio,minimo,cantmin);
			
			System.out.println("\nLa calificacion mas baja es: "+minimo);			
			System.out.println("El/los alumno/s con la nota mas baja es/son: ");
			for (int i =0; i<cantmin; i++) {
				int pos = posMinimos[i];
				System.out.println(nombre[pos]+" "+apellido[pos]);
			}
		}
		
		private static Double encotrarMinimo(Double[]promedio) {
			Double minimo = promedio[0];
			for(int i=0;i<promedio.length;i++) {
				if (promedio[i]<minimo) {
					minimo=promedio[i];
				}
			}
			return minimo;
		}
		
		private static Double encotrarMaximo(Double[]promedio) {
			Double maximo = promedio[0];
			for(int i=0;i<promedio.length;i++) {
				if (promedio[i]>maximo) {
					maximo=promedio[i];
				}
			}
			return maximo;
		}


		private static int contarPromedios(Double[] promedio, Double valor) {
			int cant=0;
			for(int i=0;i<promedio.length;i++) {
				if(valor.equals(promedio[i])) {
					cant++;
				}
			}
			return cant;
		}

		private static int[] posicionesPromedios(Double[] promedio, Double valor, int cantidad) {
			int [] pos = new int [cantidad];
			int j = 0;
			for (int i = 0; i<promedio.length;i++) {
				if(valor.equals(promedio[i])) {
					pos[j]=i;
					j++;
				}
			}
			return pos;
		}
		
		private static void condicionAlumnos(Double[] promedio, String[] nombre, String[] apellido) {
			System.out.println("\nAlumnos promocionados: ");
			for (int i=0; i<promedio.length;i++) {
				if (promedio[i]>=7) {
					System.out.println(nombre[i]+" "+apellido[i]);
				}
			}
			System.out.println("\nAlumnos que deben recursar: ");
			for (int i=0; i<promedio.length;i++) {
				if (promedio[i]<7) {
					System.out.println(nombre[i]+" "+apellido[i]);
				}	
			}
		
		}
}
