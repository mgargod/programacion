package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el dividendo y el divisor: ");
		
		try {
			
			dividendo = teclado.nextInt();
			divisor = teclado.nextInt();
			System.out.println("Resultado: " + (dividendo / divisor ));
			teclado.close();
		}
		
		catch( InputMismatchException entradaInvalida ){
			
			System.out.println("Error, no es un número entero.");			
		}
		
		catch(ArithmeticException excepcionAritmetica) {
			
			System.out.println("Error, división por cero.");
			
		}
		
		finally {
			
			System.out.println("Este mensaje lanzado en un bloque \"finally\" se muestra siempre.");
		}
		
	}

}
