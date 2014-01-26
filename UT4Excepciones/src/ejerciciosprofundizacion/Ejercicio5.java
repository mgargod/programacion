package ejerciciosprofundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
	
	private static Scanner teclado;
	
	public static double leerNumero() {
		
		teclado = new Scanner(System.in);
		double numero = 0;
		
		System.out.print("Introduzca un n�mero [pulse * para finalizar]: ");
		
		try {
			
			numero = teclado.nextDouble();
		}
		
		catch ( InputMismatchException entradaInvalida ) {
			
			throw entradaInvalida;
		}
		
		return numero;
	}

	public static void main(String[] args) {

		double[] numeros = new double[40];
		int contadorNumeros = 0;
		String letraIntroducida = "";
		boolean continuarLeyendo = true;

		do {
		
			try {
				
				for ( int i = 0; i < numeros.length; ++i ) {
				
					numeros[i] = leerNumero();
					++contadorNumeros;				
				}
			}
			
			catch (InputMismatchException entradaInvalida ) {
				
				letraIntroducida = teclado.next();
				
				if (letraIntroducida.equals("*") && contadorNumeros == 0) {
					
					System.out.println("No ha introducido ning�n n�mero.");
					System.exit(-1);
				
				} else if (letraIntroducida.equals("*") && contadorNumeros > 0) {
					
					System.out.println("Fin de lectura. N�meros le�dos: " + contadorNumeros);
					continuarLeyendo = false;
				
				} else {
					
					System.out.println("Debe introducir n�meros. Int�ntelo de nuevo.");
				}	
			}
		
		} while ( continuarLeyendo );
		
		double mayor = numeros[0];
		
		for ( int i = 1; i < contadorNumeros; ++i ) {
				
			if ( numeros[i] >= mayor ) mayor = numeros[i];					
		}
			
		System.out.println("El MAYOR es: " +  mayor );
	}

}
