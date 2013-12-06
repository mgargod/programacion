package ejercicios;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int numero;
		int numero2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("�Cu�ntos n�meros de la serie de Fibonacci? ");
		numero = teclado.nextInt();		
		
		int[] serie = new int[numero];
		
		serie[0] = 0;
		serie[1] = 1;
		
		for ( int i = 2; i < serie.length; ++i ) {
			
			serie[i] = ( serie[i - 2] + serie[i - 1] );
		}
		
		System.out.println("Serie Fibonacci generada: ");
		
		for ( int i = 0; i < serie.length; ++i ) {
			
			System.out.print( serie[i] + ", ");
		}
		
		
		boolean condicion = true;
		
		do {
			
			String mensaje = "NO EST�";
			
			System.out.print("\nIntroduzca un n�mero: ");
			numero2 = teclado.nextInt();
			
			if ( numero2 == 0 ) {
				
				condicion = false;
			}
			
			for ( int i = 0; i < serie.length; ++i ) {
				
				if ( serie[i] == numero2 ) {
					
					mensaje = "EST�";
					i = serie.length;
				}
			}
			
			System.out.println("El n�mero " + numero2 + " " + mensaje + " en la serie dada.");
			
		} while ( condicion );
		
		System.out.println("Gracias por utilizar esta maravillosa aplicaci�n.");
		
		teclado.close();

	}

}
