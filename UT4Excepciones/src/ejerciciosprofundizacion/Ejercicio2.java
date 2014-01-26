package ejerciciosprofundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	
	private static Scanner teclado;
	
	public static float leerFloat() {
		
		teclado = new Scanner(System.in);
		float numero = 0;
		
		System.out.print("Introduzca un número float: ");
		
		try {
			
			numero = teclado.nextFloat();			
			
		}
		
		catch (InputMismatchException entradaInvalida) {
			
			System.out.println("Error. Ha introducido letras.");
			throw entradaInvalida;
		}
		
		return numero;
	}
	
	public static double leerDouble() {
		
		teclado = new Scanner(System.in);
		double numero = 0;
		
		System.out.print("Introduzca un número double: ");
		
		try {
			
			numero = teclado.nextDouble();
			
		}
		
		catch (InputMismatchException entradaInvalida) {
			
			System.out.println("Error. Ha introducido letras.");
			throw entradaInvalida;
		}
		
		return numero;
	}

	public static void main(String[] args) {

		float numFloat = 0;
		double numDouble = 0;
		boolean hayError;
		
		do {
			
			hayError = false;
			
			try {
				
				numFloat = leerFloat();				
			}
			
			catch ( InputMismatchException entradaInvalida ) {
				
				hayError = true;
			}
			
		} while ( hayError );
		
		do {
			
			hayError = false;
			
			try {
				
				numDouble = leerDouble();
			}
			
			catch ( InputMismatchException entradaInvalida ) {
				
				hayError = true;
			}
			
		} while ( hayError );
		
		System.out.printf("\nEl mayor es: %.2f", numFloat >= numDouble ? numFloat : numDouble );

	}

}
