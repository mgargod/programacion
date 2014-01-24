package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

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
			
			System.err.println("Error, no es un número entero.");			
		}
		
		catch(ArithmeticException excepcionAritmetica) {
			
			System.err.println("Error, división por cero.");
			
		}		
		
	}

}
