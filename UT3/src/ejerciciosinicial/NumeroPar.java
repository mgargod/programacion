package ejerciciosinicial;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA UN NUMERO
//ENTERO Y SE MUESTRA SI EL NUMERO INTRODUCIDO ES PAR
//UTILIZA ESTRUCTURA IF

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 7/11/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {

		//Pedir numero
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un n�mero entero: ");
		int numero = teclado.nextInt();
		teclado.close();
		
		//Condicion de numero par
		if ( numero % 2 == 0 ){
			
			System.out.println( "Ha introducido el n�mero " + numero + ", que es par." );
			
		}

	}

}
