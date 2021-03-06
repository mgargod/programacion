package ejerciciosprofundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	
	private static Scanner teclado;
	
	public static double leerLado() {
		
		teclado = new Scanner(System.in);
		double lado;
		
		System.out.print("Introduzca lado: ");		
			
		lado = teclado.nextDouble();
		
		return lado;
	}

	public static void main(String[] args) {

		double[] lados = new double[2];
		boolean ladoCorrecto;
		boolean hayErrores;			
				
		for ( int i = 0; i < lados.length; ++i ) {
			
			ladoCorrecto = false;
			hayErrores = true;
			
			do {
					
				try {
					
					lados[i] = leerLado();
					ladoCorrecto = ( lados[i] > 0 );
					if (!ladoCorrecto) System.out.println("El lado tiene que ser mayor que 0...");
					hayErrores = false;
				}
					
				catch ( InputMismatchException entradaInvalida ) {
						
					System.out.println("Debe introducir n�meros. Int�ntelo de nuevo");	
				}
			
			} while ( hayErrores || !ladoCorrecto );			
		}
		
		System.out.println("=========== R E S U L T A D O S ===========");
		
		for ( int i = 0; i < lados.length; ++i ) {
			
			System.out.printf("Lado n� %d: %.2f\n", (i+1), lados[i]);
		}
		
		System.out.printf("PERIMETRO: %.2f\n", (lados[0] + lados[1]) * 2 );
		System.out.printf("AREA: %.2f\n", lados[0] * lados[1] );		
	}
}
