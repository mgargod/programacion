package ejerciciosinicial;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA LA TEMPERATURA
//EN FAHRENHEIT, LO PASA A GRADOS CENTIGRADOS Y MUESTRA LA
//TEMPERATURA CON UN MENSAJE DE PELIGRO DE CONGELACION SI
//LA MISMA ES MENOR O IGUAL QUE 0�C
//UTILIZA ESTRUCTURA IF-ELSE

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 7/11/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {

		//Leer la temperatura en Fahrenheit
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la temperatura (�F): ");
		double temperatura = teclado.nextDouble();
		teclado.close();
		
		//Pasar a �C
		temperatura = (temperatura - 32) / 1.8;
		
		//Si T� < 0
		if ( temperatura <= 0 ) {
						
			System.out.println( "Temperatura: " + temperatura + "�C");
			System.out.println( "Warning! Peligro de congelaci�n" );
		
		}
		
		else {
			
			System.out.println( "Temperatura: " + temperatura + "�C");
			System.out.println( "No hay riesgo de congelaci�n" );
			
		}
	
	}

}
