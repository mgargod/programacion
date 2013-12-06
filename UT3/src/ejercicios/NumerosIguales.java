package ejercicios;

import java.util.Scanner;

/*
 * Escribir un programa que pida dos n�meros
 * Si los dos n�meros dados son iguales
 * 		se visualiza mensaje "son iguales"
 * 		se vuelven a pedir los dos n�meros
 * el programa termina cuando los dos n�meros no 
 * son iguales y se imprime el mayor
 */

public class NumerosIguales {

	public static void main(String[] args) {

		//Variables
		
		int numero1;
		int numero2;
		int mayor;
		
		//Objeto de clase Scanner
		
		Scanner teclado = new Scanner(System.in);
		
		//Pedir n�meros
		
		do {
			
			System.out.print("Introduzca dos n�meros: ");
			numero1 = teclado.nextInt();
			numero2 = teclado.nextInt();
			
			if ( numero1 == numero2 ) {
				
				System.out.println("Los n�meros introducidos son iguales");
				
			} else {
				
				mayor = numero1;
				
				if ( numero2 > numero1 ) {
					
					mayor = numero2;
					
				}
				
				System.out.println("El n�mero mayor es el " +  mayor );
			}
			
		} while ( numero1 == numero2 );
		
		teclado.close();

	}

}
