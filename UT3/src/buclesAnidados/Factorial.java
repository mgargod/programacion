package buclesAnidados;

import java.util.Scanner;

/* ESTA APLICACION PIDE AL USUARIO UN NUMERO
 * CON EL FIN DE CALCULAR EL FACTORIAL DE 
 * DICHO NUMERO. VALIDA QUE EL NUMERO INSERTADO
 * SEA POSITIVO (INCLUIDO EL 0). POSTERIORMENTE
 * DA LA OPORTUNIDAD DE INTRODUCIR OTRO NUMERO
 * Y SE VALIDA LA RESPUESTA.
 * UTILIZA ESTRUCTURA DO-WHILE, FOR, IF-ELSE
 * 
 * AUTOR: Miguel �ngel Garc�a Godoy
 * FECHA: 15/11/2013
 * ASIGNATURA: Programaci�n
 * CURSO: Primero DAW 
 */

public class Factorial {

	public static void main(String[] args) {
		
		int numero;
		long factorial; //M�ximo hasta factorial del n�mero 20
		String respuesta = null;
		
		Scanner teclado = new Scanner(System.in);
		
		do {			
						
			do {
				
				System.out.print("Introduzca un n�mero: ");
				numero = teclado.nextInt();
				
			} while ( numero < 0 );
			
			factorial = 1;
			
			if ( numero != 0 ) {
							
				for ( int i = numero; i > 0; --i ) {
				
					factorial *= i; 
			
				}
			}
				
				System.out.printf( "El factorial de %d es igual a %,d\n", numero, factorial );			
			
			
			do {
			
				System.out.print( "\n�Quiere insertar otro n�mero [s/n]? ");
				respuesta = teclado.next().toLowerCase();
			
			} while ( !(respuesta.equals("s") || respuesta.equals("n") ) );			
			
			
		} while ( respuesta.equals("s") );
		
		System.out.print( "\nGracias por participar y �hasta la pr�xima!" );
		
		teclado.close();

	}

}
