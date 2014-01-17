package metodos;

import java.util.Scanner;

public class CuadradoCaracteres {
	
	public static void cuadradoCaracteres ( char caracter, int numFilasColumnas ) {
		
		for ( int i = 0; i < numFilasColumnas; ++i ) {
			for ( int j = 0; j < numFilasColumnas; ++j ) {
				System.out.print(caracter);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int numFilasColumnas;
		char caracter;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el número de filas-columnas: ");
		
		numFilasColumnas = teclado.nextInt();
		
		System.out.print("Introduzca el caracter a representar: ");
		caracter = teclado.next().charAt(0);
		
		teclado.close();
		
		cuadradoCaracteres(caracter, numFilasColumnas);

	}

}