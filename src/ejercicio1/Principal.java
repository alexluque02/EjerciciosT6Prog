package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 EXCEPCIONES ) Realizar un programa que haga las operaciones básicas de una
		 * calculadora solo con números enteros (sumar, resta, multiplicar, dividir y
		 * raíz cuadrada) teniendo en cuenta las posibles excepciones que se pueden
		 * producir (entrada de datos, división por cero, raíz de un número negativo,
		 * etc.)
		 */

		int n1, n2;
		double res;
		int menu=0;

		System.out.println("Bienvenido a la calculadora");

		do {
			try {
				System.out.println(
						"1. Suma\n" + "2. Resta\n" + "3. Multiplica\n" + "4. Divide\n" + "5. Raíz\n" + "0. Salir");
				menu = Leer.datoInt();
				switch (menu) {
				case 1:
					System.out.println("Diga el primer número");
					n1 = Leer.datoInt();
					System.out.println("Diga el segundo número");
					n2 = Leer.datoInt();
					res = n1 + n2;
					System.out.println(res);
					break;
				case 2:
					System.out.println("Diga el primer número");
					n1 = Leer.datoInt();
					System.out.println("Diga el segundo número");
					n2 = Leer.datoInt();
					res = n1 - n2;
					System.out.println(res);
					break;
				case 3:
					System.out.println("Diga el primer número");
					n1 = Leer.datoInt();
					System.out.println("Diga el segundo número");
					n2 = Leer.datoInt();
					res = n1 * n2;
					System.out.println(res);
					break;
				case 4:
					System.out.println("Diga el primer número");
					n1 = Leer.datoInt();
					System.out.println("Diga el segundo número");
					n2 = Leer.datoInt();
					res = n1 / n2;
					System.out.println(res);
					break;
				case 5:
					System.out.println("Diga el número");
					n1 = Leer.datoInt();
					res = Math.sqrt(n1);
					System.out.println(res);
					break;
				case 0:
					System.out.println("Adios");
					break;
				}
			} catch (NumberFormatException d) {
				System.out.println("Mallllll");
			} catch (ArithmeticException a) {
				System.err.println("No puedes dividir por cero");
			} catch (Exception e) {
				System.out.println("Ha ocurrido un error");
			}
		} while (menu != 0);

		System.out.println("Gracias por utilizar nuestra calculadora");
	}

}
