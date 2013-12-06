package ejercicios;

import java.util.Scanner;

/*
 * Escribir un programa que pida dos números
 * Si los dos números dados son iguales
 * 		se visualiza mensaje "son iguales"
 * 		se vuelven a pedir los dos números
 * el programa termina cuando los dos números no 
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
		
		//Pedir números
		
		do {
			
			System.out.print("Introduzca dos números: ");
			numero1 = teclado.nextInt();
			numero2 = teclado.nextInt();
			
			if ( numero1 == numero2 ) {
				
				System.out.println("Los números introducidos son iguales");
				
			} else {
				
				mayor = numero1;
				
				if ( numero2 > numero1 ) {
					
					mayor = numero2;
					
				}
				
				System.out.println("El número mayor es el " +  mayor );
			}
			
		} while ( numero1 == numero2 );
		
		teclado.close();

	}

}
