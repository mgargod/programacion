package ejerciciosArrays;

import java.util.Scanner;

/*
 * Ejercicio 3 Mediante el uso de arrays pide al usuario un n�mero 
 * y muestra por pantalla si este es pal�ndromo o no. Debes pedir el n�mero completo, no digito a digito.
 */

public class Ejercicio3_Palindromo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		long numUsuario;
		char[] cadenaNumero;
		String esPalindromo = "<< SI >>";
		
		System.out.print("Introduzca un n�mero entero: ");
		numUsuario = teclado.nextLong();
		
		cadenaNumero = Long.toString(numUsuario).toCharArray();
		
		for(int i = 0; i < cadenaNumero.length / 2; ++i ) {
			
			if ( !(cadenaNumero[i] == cadenaNumero[cadenaNumero.length - 1 - i]))
				esPalindromo = "<< NO >>";				
		}
		
		System.out.printf("El n�mero %d %s es pal�ndromo.", numUsuario, esPalindromo);
		teclado.close();

	}

}
