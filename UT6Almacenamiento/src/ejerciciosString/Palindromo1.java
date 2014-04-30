package ejerciciosString;

import java.util.Scanner;

public class Palindromo1 {
	
	public static boolean palinSimple(String frase) {		
				
		boolean esPalindromo = true;
		for(int i=0; i < frase.length()/2; ++i) {
			if(frase.charAt(i) != frase.charAt(frase.length() - i - 1)){
				esPalindromo = false;
				i = frase.length()/2;
			}				
		}
		
		return esPalindromo;
	}

	public static void main(String[] args) {

		//Calcular si una frase es un pal�ndromo, comprobando si la cadena es sim�trica.
		//V�ase el m�todo est�tico "palinSimple"
		
		//1.Lectura de cadena
		//2.Procesamiento de cadena
			//2.1 quitar espacios
			//2.2 convertir a min�sculas
		//3.Comprobaci�n utilizando el m�todo "palinSimple"
		
		Scanner teclado = new Scanner(System.in);
		String frase;
		StringBuilder aux;
		System.out.print("Introduzca frase:");
		frase = teclado.nextLine();
		aux = new StringBuilder(frase);
		for(int i=0; i < aux.length(); ++i){
			if(aux.charAt(i)==' ') aux.deleteCharAt(i);
		}
		
		System.out.println((palinSimple(aux.toString().toLowerCase())?"Es pal�ndromo":"No es pal�ndromo"));	
		
		teclado.close();
	}

}
