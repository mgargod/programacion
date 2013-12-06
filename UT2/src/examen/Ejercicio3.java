package examen;

/*
 * Alumno: MIGUEL ANGEL GARCIA GODOY
 * Asignatura: PROGRAMACION
 * Curso: 1º DAW
 * Fecha: 29/11/2013
 * 
 */

import java.util.Scanner;


public class Ejercicio3 {
	
	public static int random( int base, int rango ){
		
		int aleatorio = 0;
		aleatorio = (int)(Math.random() * rango + base);
		return aleatorio;
	}

	public static void main(String[] args) {

		String[] frases = new String[40];
		String respuesta = "";
		int contador = 0;
		String continuar = null;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido a Haiku Generator.");
		
		System.out.println("Comenzaremos recopilando versos (escribe * para terminar)");
		
		boolean condicion;
		
		
		do {
			
			System.out.print("Dame un verso: ");
			respuesta = teclado.nextLine().toLowerCase();			
			if ( !(respuesta.equals("")) &&  !(respuesta.equals("*"))){
				
				++contador;
				frases[contador - 1] = respuesta;
			}
			
			if ( (respuesta.equals("*") && contador >= 3) || (contador >= 40) ) {
				
				condicion = false;
			}
			
			else {
				
				condicion = true;
			}
			
		} while ( condicion );
		
				
		System.out.println("Versos leidos (" + contador + "): ");		
				
		for ( int i = 0; i < contador; ++i ){
			
			System.out.println(frases[i]);
		}		
		
		do {
		
			System.out.println("\nHaiku\n*****************");
			
			int[] versos = new int[3];
						
			int i = 0;
			int j;
			
			versos[i] = random(0, contador);
			
			for ( i = 1; i < 3; ++i ) {
				
				versos[i] = random(0, contador);
				
				for ( j = 0; j < i; ++j ) {
					
					if ( versos[i] == versos[j] ) {
						
						--i;
					}
				}
			}
			
			for ( i = 0; i < 3; ++i ){
				
				System.out.println(frases[versos[i]]);
			}
			
			do {
				
				System.out.print("\n¿Otro Haiku? [S/n] ");
				continuar = teclado.next().toLowerCase();
								
			} while ( !(continuar.equals("s") || continuar.equals("n") ) );
			
		} while ( continuar.equals("s") );
		
		teclado.close();
		
		System.out.println("Adiós, gracias por utilizar Haiku Generator.");

	}

}
