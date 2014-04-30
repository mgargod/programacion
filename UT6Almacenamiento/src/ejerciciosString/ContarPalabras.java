package ejerciciosString;

/*
 * Dada una frase, que puede contener caracteres, espacios en blanco, 
 * puntos y comas, contar las palabras que contiene. 
 * Por ejemplo "El perro de San Roque. Fin." devuelve 6.
 */

import java.util.Scanner;

public class ContarPalabras {
	
	/**
	 * METODO pedirFrase
	 * @return String (la frase introducida)
	 */
	public static String pedirFrase() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca frase: ");
		return teclado.nextLine();
		
	}
	
	/**
	 * METODO contarPalabras (cuenta las palabras contenidas en una frase y lo muestra)
	 * @param frase: String
	 */
	
	public static void contarPalabras(String frase) {
		
		int cuentaPalabras = 0;	
		
		for(int i=1; i < frase.length(); ++i){
			if((frase.charAt(i)==' '||frase.charAt(i)=='.'||frase.charAt(i)==',') && 
			   !(frase.charAt(i-1)==' '||frase.charAt(i-1)=='.'||frase.charAt(i-1)==',')){
				cuentaPalabras++;
			}			
		}
		
		if(frase.length() > 0 && Character.isLetterOrDigit(frase.charAt(frase.length()-1)))
			cuentaPalabras++;
		
		System.out.printf("Total palabras: %d", cuentaPalabras);
		
		
	}

	public static void main(String[] args) {

		contarPalabras(pedirFrase());		

	}

}
