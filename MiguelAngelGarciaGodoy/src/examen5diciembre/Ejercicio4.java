package examen5diciembre;

import java.util.Scanner;

//Miguel Ángel García Godoy

public class Ejercicio4 {

	public static void main(String[] args) {		
		
		int numOpciones = 0;
		int maximo = 0;
		String opcion = "";
		String[] opciones;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido a Menú Generator.");
		System.out.print("Introduce el número máximo de opciones que desea generar (además de \"Salir\"): ");
		maximo = teclado.nextInt();
		
		opciones = new String[maximo + 1];
		System.out.println("Comenzaremos recopilando opciones (escribe * para terminar -- máximo " + maximo + " --)");
		
		int i;
		boolean continuar;
		
		do {
			
			continuar = true;
			
			for ( i = 0; i < opciones.length; ++i ) {
				
				System.out.print("Dame una opción: ");
				opciones[i] = teclado.next();
				
				if ( !opciones[i].equals("*") ) {
					
					++numOpciones;
				}
				
				if ( opciones[i].equals("*") && i >= 0 || i == opciones.length - 2 ) {
					
					continuar = false;
					
					if (numOpciones == maximo) {
						
						opciones[i + 1] = "Salir";
						
					}
					
					else {
						
						opciones[i] = "Salir";
					}
					
					i = opciones.length;
				}				
				
			}			
			
		} while ( continuar );
		
		//System.out.println("Número de opciones = " + numOpciones);		
		
		System.out.println("*   Menú   *\n" + 
		                   "************");
		for ( i = 0; i <= numOpciones; ++i ) {
			
			System.out.println( (i + 1) + ". " + opciones[i] );
			
		}
		
			
		do {
			
			continuar = true;
			
			System.out.print("Opción elegida: ");
			opcion = teclado.next().toLowerCase();
			
			for ( i = 0; i <= numOpciones; ++i ) {
				
				if ( opciones[i].toLowerCase().equals(opcion) ) {
					
					System.out.println("Ha elegido la opción: " + (i + 1) );
					i = numOpciones + 1;
					continuar = false;
				}

			}				
				
		} while ( continuar );
		
		teclado.close();
	}
}
