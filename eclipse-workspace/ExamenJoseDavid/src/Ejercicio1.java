import java.util.Scanner;

/**
 * 
 * @author charmi
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sumaposi = 0;
		double multinumneg = 1;
		int contadorceros = 0;
		int contadorpar = 0;
		int contadorimpar = 0;
		Scanner leer = new Scanner(System.in);

		System.out.println(
				"Elije una opción:\n|1-Cadenas|\n|2-Operaciones|\n|3-Par/Impar|\n|4-Números|\n|Un valor negativo sale del programa|");
		int opcion = leer.nextInt();

		while (opcion >= 0) {

			if (opcion >= 0) {

				switch (opcion) {
				case 1:
					leer.nextLine();
					System.out.println("Introduce una frase:");
					String frase = leer.nextLine();
					if (frase.length() >= 4) {

						System.out.printf("%s José David Lozano Ojidos\n", frase);
					}
					System.out.println(
							"\nElije una opción:\n|1-Cadenas|\n|2-Operaciones|\n|3-Par/Impar|\n|4-Números|\n|Un valor negativo sale del programa|");
					opcion = leer.nextInt();
					break;
				case 2:
					System.out.println("Introduce un número decimal:");
					double num = leer.nextDouble();
					System.out.println("El numero redondeado es :" + Math.ceil(num));
					System.out.println("Y su raíz cuadrada es :" + Math.sqrt(num));
					System.out.println(
							"\nElije una opción:\n|1-Cadenas|\n|2-Operaciones|\n|3-Par/Impar|\n|4-Números|\n|Un valor negativo sale del programa|");
					opcion = leer.nextInt();
					break;
				case 3:

					int num2 = 1;
					do {

						System.out.println("|Introduce un numero par o impar (0 para finalizar)|");
						num2 = leer.nextInt();

						if (num2 == 0) {

							System.out.printf("El número de pares es %d\nY el número de impares es: %d\n", contadorpar,
									contadorimpar);

						}

						else if (num2 % 2 == 0) {

							System.out.println("El número es par\n");
							contadorpar++;
						} else {
							System.out.println("El número es impar\n");
							contadorimpar++;
						}

					} while (num2 != 0);

					System.out.println(
							"\nElije una opción:\n|1-Cadenas|\n|2-Operaciones|\n|3-Par/Impar|\n|4-Números|\n|Un valor negativo sale del programa|");
					opcion = leer.nextInt();

					break;

				case 4:
					for (int i = 1; i <= 4; i++) {

						System.out.printf("Introduce un numero decimal por %d vez\n", i);
						double numdec = leer.nextDouble();

						if (numdec > 0) {

							sumaposi = sumaposi + numdec;

						} else if (numdec < 0) {

							multinumneg = multinumneg * numdec;

						} else if (numdec == 0) {

							contadorceros++;
						}

					}

					System.out.printf("\nLa suma de números positivos es %.2f\n"
							+ "La multiplicación de numeros negativos es %.2f\n" + "Y el número de ceros es : %d\n ",
							sumaposi, multinumneg, contadorceros);

					System.out.println(
							"\nElije una opción:\n|1-Cadenas|\n|2-Operaciones|\n|3-Par/Impar|\n|4-Números|\n|Un valor negativo sale del programa|");
					opcion = leer.nextInt();

					break;

				}
			}

		}
		System.out.println("Fin de programa");
	}
}
