package buclesWhileDoWhile;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA NUMEROS
//Y SE VAN ESCRIBIENDO HASTA QUE EL NUMERO SEA NEGATIVO. 
//UTILIZA ESTRUCTURA DO-WHILE

//AUTOR: Miguel Ángel García Godoy
//FECHA: 14/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class ListaNumerosPositivos {

	public static void main(String[] args) {

		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.print( "Introduzca número: " );
			numero = teclado.nextInt();
			System.out.println( numero );
		
		} while ( numero >= 0 );
		
		teclado.close();
		
	}

}

