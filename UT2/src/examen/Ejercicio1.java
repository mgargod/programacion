package examen;

/*
 * Alumno: MIGUEL ANGEL GARCIA GODOY
 * Asignatura: PROGRAMACION
 * Curso: 1º DAW
 * Fecha: 29/11/2013
 * 
 */

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int n = 0;
		int suma = 0;
		int positivos = 0;
		int negativos = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de números a leer: ");
		n = teclado.nextInt();
		
		int[] numeros = new int[n];
		
		System.out.println("Escriba " + n + " números: ");
		
		for ( int i = 0; i < numeros.length; ++i ){
			
			numeros[i] = teclado.nextInt();
			suma += numeros[i];
			
			if ( numeros[i] > 0 ){
				
				++positivos;
			}
			
			if ( numeros[i] < 0 ){
				
				++negativos;
			}
			
		}
		
		teclado.close();
		
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.printf("Media: %.1f", (double)suma / numeros.length);

	}

}
