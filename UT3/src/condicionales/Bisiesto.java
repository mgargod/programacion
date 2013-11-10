package condicionales;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA
//UN AÑO CUALQUIERA, Y SE MUESTRA SI EL MISMO  
//ES O NO BISIESTO
//UTILIZA ESTRUCTURA IF-ELSE IF

//AUTOR: Miguel Ángel García Godoy
//FECHA: 10/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		
		int year;
		String mensaje="";

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el año: ");
		year = teclado.nextInt();
		
		teclado.close();
		
		if ( year % 100 == 0 ) {
			
			if ( year % 400 == 0 ) {
			
			mensaje = "es";
			
			}
			
			else {
				
				mensaje = "no es";
				
			}
			
				
		} else if ( year % 4 == 0 ){
			
			mensaje = "es";
			
		} else {
			
			mensaje = "no es";
		
		}
		
		System.out.printf( "El año %d %s bisiesto.", year, mensaje );
	
	}

}
