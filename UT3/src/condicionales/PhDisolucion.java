package condicionales;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA
//EL PH DE UNA DISOLUCION, Y SE MUESTRA SI ESTA  
//ES ACIDA O PELIGROSAMENTE ACIDA
//UTILIZA ESTRUCTURA IF-ELSE IF

//AUTOR: Miguel Ángel García Godoy
//FECHA: 10/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class PhDisolucion {

	public static void main(String[] args) {

		double pH;
		String mensaje = null;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print( "Introduzca el pH de la disolución: " );
		pH = teclado.nextDouble();
		
		teclado.close();
		
		if ( pH >= 3.0 && pH < 7.0 ) {
			
			mensaje = "es ácida.";
		
		} else if ( pH < 3.0 ) {
			
			mensaje = "es peligrosamente ácida.";
		
		} else {
			
			mensaje = "no es ácida.";
		
		}
		
		System.out.printf( "La disolución cuyo pH es igual a %.1f %s", pH, mensaje );
		

	}

}
