package ejercicios;

/*
 * 2.Crear una colección de caracteres que se irán introduciendo por teclado, 
hasta que se introduzca un *.
Decir si hay algún carácter duplicado.
 */

import java.util.*;

public class Ejercicio2_Caracteres {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		ArrayList<Character> caracteres = new ArrayList<Character>();
		HashSet<Character> duplicados = new HashSet<Character>();
		
		boolean finBucle;
		char caracter;
		int frecuencia;
		do {
			
			finBucle = false;
			
			System.out.print("Introduzca carácter: ");
			caracter = teclado.next().charAt(0);
			if(caracter == '*')
				finBucle = true;
			else
				caracteres.add(caracter);			
			
		} while (!finBucle);
		
		for(Character ch : caracteres) {
			frecuencia = Collections.frequency(caracteres,ch);
			if(frecuencia > 1)				
				duplicados.add(ch);			
		}
		
		System.out.println("Duplicados: " + duplicados);			

	}

}
