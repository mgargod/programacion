package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio5_Encriptacion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escriba la frase para codificar [ minúsculas y/o números ]: ");
		char[] caracteres = teclado.nextLine().toCharArray();
		
		for ( int i = 0; i < caracteres.length; ++i ) {
			
			if ( !(Character.isLowerCase(caracteres[i]) || Character.isDigit(caracteres[i])) && caracteres[i] != ' ') {
				
				System.out.println("Debe introducir minúsculas y/o números.");
				System.exit(0);
			}
		}
		
		for ( int i = 0; i < caracteres.length; ++i ) {
			if ( i < caracteres.length -1 )
				caracteres[i]+=caracteres[i+1] + 3;
			else
				caracteres[i]+= 4 + 3;
		}
		
		for (char caracter : caracteres)
			System.out.print(caracter);
		
		//Decodificar
		
		System.out.println("\nFrase decodificada: ");
		
		for ( int i = caracteres.length - 1; i >= 0; --i ) {
			if ( i == caracteres.length -1 )				
				caracteres[i]-= (4 + 3);
			else
				
				caracteres[i]-=(caracteres[i+1] + 3);
		}
		
		for (char caracter : caracteres)
			System.out.print(caracter);
		
		teclado.close();

	}

}
