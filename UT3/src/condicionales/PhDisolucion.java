package condicionales;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA
//EL PH DE UNA DISOLUCION, Y SE MUESTRA SI ESTA  
//ES ACIDA O PELIGROSAMENTE ACIDA
//UTILIZA ESTRUCTURA IF-ELSE IF

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 10/11/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner;

public class PhDisolucion {

	public static void main(String[] args) {

		double pH;
		String mensaje = null;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print( "Introduzca el pH de la disoluci�n: " );
		pH = teclado.nextDouble();
		
		teclado.close();
		
		if ( pH >= 3.0 && pH < 7.0 ) {
			
			mensaje = "es �cida.";
		
		} else if ( pH < 3.0 ) {
			
			mensaje = "es peligrosamente �cida.";
		
		} else {
			
			mensaje = "no es �cida.";
		
		}
		
		System.out.printf( "La disoluci�n cuyo pH es igual a %.1f %s", pH, mensaje );
		

	}

}
