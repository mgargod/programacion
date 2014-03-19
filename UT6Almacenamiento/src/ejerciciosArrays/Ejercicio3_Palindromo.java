package ejerciciosArrays;

import java.util.Scanner;

/*
 * Ejercicio 3 Mediante el uso de arrays pide al usuario un número 
 * y muestra por pantalla si este es palíndromo o no. Debes pedir el número completo, no digito a digito.
 */

public class Ejercicio3_Palindromo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		long numUsuario;
		char[] cadenaNumero;
		String esPalindromo = "<< SI >>";
		
		System.out.print("Introduzca un número entero: ");
		numUsuario = teclado.nextLong();
		
		cadenaNumero = Long.toString(numUsuario).toCharArray();
		
		for(int i = 0; i < cadenaNumero.length / 2; ++i ) {
			
			if ( !(cadenaNumero[i] == cadenaNumero[cadenaNumero.length - 1 - i]))
				esPalindromo = "<< NO >>";				
		}
		
		System.out.printf("El número %d %s es palíndromo.", numUsuario, esPalindromo);
		teclado.close();

	}

}
