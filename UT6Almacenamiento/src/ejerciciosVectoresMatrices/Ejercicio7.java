package ejerciciosVectoresMatrices;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejercicio 7. Escribe un m�todo que reciba una matriz de enteros 
 * con la creaci�n ya hecha y que dicho m�todo se encargue, �nicamente, 
 * de cargar dicha matriz con datos que se van a insertar a traves del teclado 
 * y as� devolver dicha informaci�n al m�todo que le llam�.
 */



public class Ejercicio7 {
	
	public static void rellenarMatriz( int[][] matriz) {
		
		Scanner teclado = new Scanner(System.in);
		
		for ( int i = 0; i < matriz.length; ++i ) {
			for ( int j = 0; j < matriz[i].length; ++j ) {
				System.out.printf("Introduzca un n�mero entero para la posici�n [%d][%d]: ",i,j);
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		/*
		for ( int[] fila : matriz ) {
			for ( int elemento : fila ) {
				
			}
		}
		*/
		
	}

	public static void main(String[] args) {

		int[][] matriz = new int[2][2];	
			
		rellenarMatriz(matriz);
		for ( int[] fila : matriz ) {
			
			System.out.println(Arrays.toString(fila));				
			
		}

	}

}
