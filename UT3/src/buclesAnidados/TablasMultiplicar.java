package buclesAnidados;

import java.util.Scanner;

/* ESTA APLICACION PIDE AL USUARIO UN NUMERO
 * Y MUESTRA SU CORRESPONDIENTE TABLA DE MULTIPLICAR
 * TERMINA CUANDO SE INSERTA UN NUMERO QUE NO
 * ESTE COMPRENDIDO ENTRE EL 1 Y EL 10 
 * UTILIZA ESTRUCTURA FOR, DO-WHILE, IF-ELSE
 * 
 * AUTOR: Miguel �ngel Garc�a Godoy
 * FECHA: 17/11/2013
 * ASIGNATURA: Programaci�n
 * CURSO: Primero DAW 
 */

public class TablasMultiplicar {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.print( "Introduzca un n�mero: ");
			numero = teclado.nextInt();
			
			if ( numero < 1 || numero > 10 ) {
				
				System.out.println("FIN. S�lo para n�meros entre 1 y 10 (ambos inclusive)");
			}
							
			else { 
				
				System.out.printf( "===TABLA DEL %d===\n", numero );
				
				for ( int i = 1; i < 11; ++i ) {
					
					System.out.printf( "%d x %d = %d\n", numero, i, numero * i );
					
				}
			}
					
		} while ( numero >= 1 && numero <= 10 );
		
		teclado.close();

	}

}
