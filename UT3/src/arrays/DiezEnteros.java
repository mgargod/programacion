package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiezEnteros {

	public static void main(String[] args) {
		
		int[] enteros = new int[10];
		int[] enteros2 = new int[10];

		Scanner teclado = new Scanner(System.in);
		
		for ( int i = 0; i < enteros.length; ++i ) {
			
			System.out.printf( "Introduzca el número %d: ", i + 1 );
			enteros[i] = teclado.nextInt();
		
		}
				
		teclado.close();
		
		System.out.println("Su array desordenado: " + Arrays.toString(enteros));
		System.out.println("Ordenando array...");
		
		for ( int i = (enteros.length); i > 0; --i ) {
			
			enteros2[ enteros.length - i] = enteros[i - 1];
		
		}
		
		System.out.println("Su array ordenado: " + Arrays.toString(enteros2));

	}

}
