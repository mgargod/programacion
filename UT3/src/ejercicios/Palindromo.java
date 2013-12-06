package ejercicios;

import java.util.Scanner;


public class Palindromo {

	public static void main(String[] args) {
		
		
		long candidato;
		
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("Introduzca un número: ");
		
		candidato = teclado.nextLong();
		
		teclado.close();
		
		char[] cadena = (Long.toString(candidato)).toCharArray();
		
		String palindromo = "ES";
		
		for ( int i = 0; i <= cadena.length / 2; ++i ) {
			
			if ( !(cadena[i] == cadena[cadena.length - i - 1] ) ) {
				
				palindromo = "NO ES";
			}
		}
		
		System.out.println( "El número " + candidato + " " + palindromo + " palíndromo." );
		

		

		
		
		
		
		
		
		

	}

}
