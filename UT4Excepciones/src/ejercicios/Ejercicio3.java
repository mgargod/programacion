package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean continuar = true;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.print("Introduce el dividendo y el divisor: ");
			
			try {
				
				dividendo = teclado.nextInt();
				divisor = teclado.nextInt();
				System.out.println("Resultado: " + (dividendo / divisor ));
				continuar = false;				
			}
			
			catch( InputMismatchException entradaInvalida ){
				
				System.out.println("Error, no es un número entero.");
				teclado.nextLine();
			}
			
			catch(ArithmeticException excepcionAritmetica) {
				
				System.out.println("Error, división por cero.");				
			}			
					
		} while ( continuar );
		
		teclado.close();
		
	}

}
