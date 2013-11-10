package ejerciciosinicial;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA LA TEMPERATURA
//EN FAHRENHEIT, LO PASA A GRADOS CENTIGRADOS Y MUESTRA LA
//TEMPERATURA CON UN MENSAJE DE PELIGRO DE CONGELACION SI
//LA MISMA ES MENOR O IGUAL QUE 0ºC
//UTILIZA ESTRUCTURA IF-ELSE

//AUTOR: Miguel Ángel García Godoy
//FECHA: 7/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {

		//Leer la temperatura en Fahrenheit
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la temperatura (ºF): ");
		double temperatura = teclado.nextDouble();
		teclado.close();
		
		//Pasar a ºC
		temperatura = (temperatura - 32) / 1.8;
		
		//Si Tª < 0
		if ( temperatura <= 0 ) {
						
			System.out.println( "Temperatura: " + temperatura + "ºC");
			System.out.println( "Warning! Peligro de congelación" );
		
		}
		
		else {
			
			System.out.println( "Temperatura: " + temperatura + "ºC");
			System.out.println( "No hay riesgo de congelación" );
			
		}
	
	}

}
