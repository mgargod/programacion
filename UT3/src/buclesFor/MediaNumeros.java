package buclesFor;

import java.util.Scanner;

//ESTA APLICACION PIDE AL USUARIO
//QUE INDIQUE LA CANTIDAD DE NUMEROS
//A LEER, DESPUES LOS LEE Y MUESTRA
//LA MEDIA DE LOS MISMOS Y LOS NUMEROS
//PARES INTRODUCIDOS
//UTILIZA ESTRUCTURA FOR

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 15/11/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

public class MediaNumeros {

	public static void main(String[] args) {
		
		int cantidad;
		int numero;
		int pares = 0;
		int suma = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Escriba cu�ntos n�meros va a introducir: ");
		cantidad = Integer.parseInt(teclado.next());
		
		for ( int i = 1; i <= cantidad; ++i ) {
			
			System.out.print( "Introduzca n�mero: ");
			numero = teclado.nextInt();
			
			suma += numero;
			
			if ( numero % 2 == 0 ) {
				
				++pares;
				
			}
			
		}
		
		teclado.close();
		
		System.out.printf( "La media de los %d n�meros es: %.2f", cantidad, (double)suma / cantidad );
		
		if ( pares > 0 ) {
			
			System.out.printf( "\nSe han introducido %d n�meros pares", pares );
		
		} else {
			
			System.out.print( "\nNo se han introducido n�meros pares" );
		}
		
	}

}
