package ejerciciosVectoresMatrices;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejercicio 7. Escribe un método que reciba una matriz de enteros 
 * con la creación ya hecha y que dicho método se encargue, únicamente, 
 * de cargar dicha matriz con datos que se van a insertar a traves del teclado 
 * y así devolver dicha información al método que le llamó.
 */



public class Ejercicio7 {
	
	public static void rellenarMatriz( int[][] matriz) {
		
		Scanner teclado = new Scanner(System.in);
		
		for ( int i = 0; i < matriz.length; ++i ) {
			for ( int j = 0; j < matriz[i].length; ++j ) {
				System.out.printf("Introduzca un número entero para la posición [%d][%d]: ",i,j);
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
