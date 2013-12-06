package examen5diciembre;

import java.util.Scanner;

//Miguel �ngel Garc�a Godoy

public class Ejercicio4 {

	public static void main(String[] args) {		
		
		int numOpciones = 0;
		int maximo = 0;
		String opcion = "";
		String[] opciones;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido a Men� Generator.");
		System.out.print("Introduce el n�mero m�ximo de opciones que desea generar (adem�s de \"Salir\"): ");
		maximo = teclado.nextInt();
		
		opciones = new String[maximo + 1];
		System.out.println("Comenzaremos recopilando opciones (escribe * para terminar -- m�ximo " + maximo + " --)");
		
		int i;
		boolean continuar;
		
		do {
			
			continuar = true;
			
			for ( i = 0; i < opciones.length; ++i ) {
				
				System.out.print("Dame una opci�n: ");
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
		
		//System.out.println("N�mero de opciones = " + numOpciones);		
		
		System.out.println("*   Men�   *\n" + 
		                   "************");
		for ( i = 0; i <= numOpciones; ++i ) {
			
			System.out.println( (i + 1) + ". " + opciones[i] );
			
		}
		
			
		do {
			
			continuar = true;
			
			System.out.print("Opci�n elegida: ");
			opcion = teclado.next().toLowerCase();
			
			for ( i = 0; i <= numOpciones; ++i ) {
				
				if ( opciones[i].toLowerCase().equals(opcion) ) {
					
					System.out.println("Ha elegido la opci�n: " + (i + 1) );
					i = numOpciones + 1;
					continuar = false;
				}

			}				
				
		} while ( continuar );
		
		teclado.close();
	}
}
