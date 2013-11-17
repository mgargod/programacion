package buclesFor;

import java.util.Scanner;

//ESTA APLICACION PIDE AL USUARIO
//QUE INDIQUE LA CANTIDAD DE NUMEROS
//A LEER, DESPUES LOS LEE Y MUESTRA
//LA MEDIA DE LOS MISMOS Y LOS NUMEROS
//PARES INTRODUCIDOS
//UTILIZA ESTRUCTURA FOR

//AUTOR: Miguel Ángel García Godoy
//FECHA: 15/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

public class MediaNumeros {

	public static void main(String[] args) {
		
		int cantidad;
		int numero;
		int pares = 0;
		int suma = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Escriba cuántos números va a introducir: ");
		cantidad = Integer.parseInt(teclado.next());
		
		for ( int i = 1; i <= cantidad; ++i ) {
			
			System.out.print( "Introduzca número: ");
			numero = teclado.nextInt();
			
			suma += numero;
			
			if ( numero % 2 == 0 ) {
				
				++pares;
				
			}
			
		}
		
		teclado.close();
		
		System.out.printf( "La media de los %d números es: %.2f", cantidad, (double)suma / cantidad );
		
		if ( pares > 0 ) {
			
			System.out.printf( "\nSe han introducido %d números pares", pares );
		
		} else {
			
			System.out.print( "\nNo se han introducido números pares" );
		}
		
	}

}
