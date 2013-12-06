package ejercicios;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		final String PASSWORD = "class";
		String candidata = null;
		int intentos = 1;
		
		
		Scanner teclado = new Scanner(System.in);
		
		do {				
			
			System.out.print("Introduzca la contraseña (intento nº " + intentos + "): ");
			candidata = teclado.next().toLowerCase();
			++intentos;			
						
			if ( candidata.equals(PASSWORD) ){
				
				System.out.println("Contraseña válida");
				intentos = 4;
			
			} else {				
				
				System.out.println("Contraseña fallida");				
			}			
			
		} while ( !(candidata.equals(PASSWORD)) && intentos <= 3 );
		
		if ( intentos > 3 && !candidata.equals(PASSWORD)) 
			
			System.out.println("Ha sobrepasado el número máximo de intentos.");
		
		teclado.close();

	} 

}

