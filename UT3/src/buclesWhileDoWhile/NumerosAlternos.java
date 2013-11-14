package buclesWhileDoWhile;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA NUMEROS
//Y SE MUESTRAN ALTERNATIVAMENTE, EL PRIMERO SI, EL 
//SEGUNDO NO, EL TERCERO SI, Y ASI SUCESIVAMENTE, HASTA
//QUE EL INTRODUCIDO SEA NEGATIVO, QUE NO SE MUESTRA.
//UTILIZA ESTRUCTURA DO-WHILE E IF.

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 14/11/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner;

public class NumerosAlternos {

	public static void main(String[] args) {

		int numero;
		int contador = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.print( "Introduzca n�mero: " );
			numero = teclado.nextInt();
			
			if( numero < 0 ) break;
			
			++contador;
			
			if( contador % 2 == 1 )
			
				System.out.println( numero ); 
		
		} while ( numero >= 0 );
		
		teclado.close();
		
	}

}

