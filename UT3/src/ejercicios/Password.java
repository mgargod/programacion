package ejercicios;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		final String PASSWORD = "class";
		String candidata = null;
		int intentos = 1;
		
		
		Scanner teclado = new Scanner(System.in);
		
		do {				
			
			System.out.print("Introduzca la contrase�a (intento n� " + intentos + "): ");
			candidata = teclado.next().toLowerCase();
			++intentos;			
						
			if ( candidata.equals(PASSWORD) ){
				
				System.out.println("Contrase�a v�lida");
				intentos = 4;
			
			} else {				
				
				System.out.println("Contrase�a fallida");				
			}			
			
		} while ( !(candidata.equals(PASSWORD)) && intentos <= 3 );
		
		if ( intentos > 3 && !candidata.equals(PASSWORD)) 
			
			System.out.println("Ha sobrepasado el n�mero m�ximo de intentos.");
		
		teclado.close();

	} 

}

