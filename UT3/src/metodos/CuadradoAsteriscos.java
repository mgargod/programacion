package metodos;

import java.util.Scanner;

public class CuadradoAsteriscos {
	
	public static void cuadradoAsteriscos ( int filas_columnas ) {		
				
		for ( int i = 0; i < filas_columnas; ++i ) {
			
			for ( int j = 0; j < filas_columnas; ++j ) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		int numFilasColumnas;	
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.print("Dame el número de filas y columnas [ > 0 ]: ");
			numFilasColumnas = teclado.nextInt();			
			
		} while ( numFilasColumnas <= 0 );
		
		teclado.close();
		
		cuadradoAsteriscos(numFilasColumnas);

	}

}
