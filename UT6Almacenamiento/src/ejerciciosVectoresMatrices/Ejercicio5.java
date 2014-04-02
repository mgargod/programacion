package ejerciciosVectoresMatrices;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejercicio 5. Escribe un programa que pida 8 notas. El programa debe visualizar cuál es la nota más alta, 
 * luego la siguiente, y así sucesivamente. Si hay alguna nota repetida, se visualizará solo una vez.
 */

public class Ejercicio5 {

	public static void main(String[] args) {

		double[] notas = new double[8];
		Scanner teclado = new Scanner(System.in);
		boolean valorErroneo = false;
		
		for ( int i = 0; i < notas.length; ++i ) {
			
			valorErroneo = true;
			
			do {
				
				System.out.printf("Introduzca la nota %d de %d: ", (i+1), notas.length);
				
				try {
					
					notas[i] = teclado.nextDouble();
					valorErroneo = false;
					
				} catch (InputMismatchException ime) {
					
					System.out.println("Debe introducir un número decimal. Inténtelo de nuevo.");
					teclado.nextLine();
					
				}
				
			} while (valorErroneo);		
			
		}
		
		teclado.close();
		
		Arrays.sort(notas);
		
		System.out.println("========================\nTodas las notas: " + Arrays.toString(notas));
		System.out.println("========================\nNotas distintas de mayor a menor: ");
		
		System.out.println(notas[notas.length - 1]);
		
		for (int i = notas.length - 2; i >= 0; --i) {
			
			if ( notas[i] != notas[i+1] )			
				System.out.println(notas[i]);
		}

	}

}

