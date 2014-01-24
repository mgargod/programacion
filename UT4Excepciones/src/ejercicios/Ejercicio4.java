package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean continuar = true;
		int numErrores = 0;
		
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
				
				System.out.println("Error, no es un n�mero entero.");
				teclado.nextLine();
				++numErrores;
			}
			
			catch(ArithmeticException excepcionAritmetica) {
				
				System.out.println("Error, divisi�n por cero.");
				++numErrores;
			}
			
			if ( numErrores > 5 ) {
				
				System.out.println("Demasiados fallos. Vuelve a intentarlo otro d�a.");
				continuar = false;
			}
					
		} while ( continuar );
		
		teclado.close();
		
	}

}
