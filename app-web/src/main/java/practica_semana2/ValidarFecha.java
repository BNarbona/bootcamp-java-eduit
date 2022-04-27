package practica_semana2;

import java.util.Scanner;

public class ValidarFecha {

	public static void main(String[] args) {

		int dia;
		int mes;
		int anio;
		int opcion;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Ingrese una fecha");
			dia = leerDato("Ingrese el dia (dd): ", teclado);
			mes = leerDato("Ingrese el mes (mm): ", teclado);
			anio = leerDato("Ingrese el año (aaaa): ", teclado);

			if (anio >= 1900 && anio <= 2099) {
				if (mes >= 1 && mes <= 12) {
					if (mes == 2) {
						if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {

							if (dia >= 1 && dia <= 29) {
								mostrarFecha(dia, mes, anio);
							} else {
								System.out.println("El dia ingresado no es correcto");
							}

						} else if (dia >= 1 && dia <= 28) {
							mostrarFecha(dia, mes, anio);

						} else {
							System.out.println("El dia ingresado no es correcto");
						}

					} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
						if (dia >= 1 && dia <= 30) {
							mostrarFecha(dia, mes, anio);
						} else {
							System.out.println("El dia ingresado no es correcto");
						}

					} else if (dia >= 1 && dia <= 31) {
						mostrarFecha(dia, mes, anio);
					} else {
						System.out.println("El dia ingresado no es correcto");
					}
				} else {
					System.out.println("El mes ingresado no es correcto");
				}
			} else {
				System.out.println("El año ingresado no es correcto");
			}

			do {
				System.out.println("\n1-Para ingresar nueva fecha\n0-Para salir");
				opcion = teclado.nextInt();
			} while (opcion < 0 || opcion > 1);

		} while (opcion == 1);
		System.out.println("Salida exitosa");

		teclado.close();
	}

	static void mostrarFecha(int dia, int mes, int anio) {
		System.out.println("La fecha ingresada es correcta: " + dia + "/" + mes + "/" + anio);
	}

	static int leerDato(String msj, Scanner teclado) {
		System.out.print(msj);
		return teclado.nextInt();
	}

}
