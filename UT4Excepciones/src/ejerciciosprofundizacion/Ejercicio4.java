package ejerciciosprofundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	
	private static Scanner teclado;
	
	public static double leerNumero() {
		
		teclado = new Scanner(System.in);
		double numero = 0;
		
		System.out.print("Introduzca un número decimal: ");
		
		try {
			
			numero = teclado.nextDouble();			
			
		}
		
		catch (InputMismatchException entradaInvalida) {
			
			System.out.println("Error. Ha introducido letras. Inténtelo de nuevo.");
			throw entradaInvalida;
		}
		
		return numero;
		
	}

	public static void main(String[] args) {

		double[] numeros = new double[10];
		boolean hayError;
		int contadorErrores = 0;
		
		for ( int i = 0; i < numeros.length; ++i ) {
			
			do {
				
				hayError = false;
				
				try {
					
					numeros[i] = leerNumero();
					System.out.println("Numero " + (i+1) + "º guardado correctamente.");
				}
				
				catch ( InputMismatchException entradaInvalida ) {
					
					hayError = true;
					++contadorErrores;					
				}				
				
			} while ( hayError );			
		}
			
		double mayor = numeros[0];
			
		for ( int i = 1; i < numeros.length; ++i ) {
				
			if ( numeros[i] >= mayor ) mayor = numeros[i];					
		}
			
		System.out.println("El MAYOR es: " +  mayor );
		System.out.println("Se han producido " + contadorErrores + " errores durante la lectura.");				
	}
}


