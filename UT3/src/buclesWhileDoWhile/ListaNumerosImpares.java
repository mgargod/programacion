package buclesWhileDoWhile;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA NUMEROS
//Y SE MUESTRAN HASTA QUE EL MISMO ES PAR. 
//UTILIZA ESTRUCTURA DO-WHILE  E IF

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 14/11/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner;

public class ListaNumerosImpares {

	public static void main(String[] args) {

		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.print( "Introduzca n�mero: " );
			numero = teclado.nextInt();
			if ( numero % 2 == 0 )break;
			System.out.println( "N�mero introducido: " + numero );
		
		} while ( numero % 2 == 1 );
		
		teclado.close();
		
	}

}

