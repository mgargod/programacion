package ejemplos;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		Scanner teclado = new Scanner(System.in);
		
		try {
			
			dividendo = teclado.nextInt();
			divisor = teclado.nextInt();
		}
		
		catch( InputMismatchException entradaInvalida ){
			
			System.err.println("Error, no es un número entero.");
			System.exit(0);
		}
		
		catch( NoSuchElementException noHayEntrada ) {
			
			System.err.println("Error, no se puede leer de teclado.");
			System.exit(0);
			
		}
		
		try {
			
			System.out.println("Resultado: " + (dividendo/divisor));
		}
		
		catch(ArithmeticException excepcionAritmetica) {
			
			System.out.println("Error, división por cero.");
			System.out.println(excepcionAritmetica.getMessage());
		}
		
		catch(Exception e) {
			
			System.out.println("Error, inesperado.");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Adiós");
	}

}
