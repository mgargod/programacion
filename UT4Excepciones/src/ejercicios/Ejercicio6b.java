package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6b {
	
	public static int pedirNumero() {
		
		int num = 0;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);			
		
		boolean continuar = true;
		
		do {
			
			System.out.print("Dame un número entero [pulsa una letra para terminar]: ");
			
			try {
		
				num = teclado.nextInt();
				continuar = false;				
			}
			
			catch ( InputMismatchException entradaInvalida ) {
				
				String introducido = teclado.nextLine();
				if ( Character.isDigit(introducido.charAt(0)))
					System.out.println("El número introducido no es válido. Vuelva insertarlo.");
				else
					throw entradaInvalida;				
			}			
		
		} while ( continuar );
		
		return num;		
	}

	public static void main(String[] args) {

		int suma = 0;
		int contador = 0;
		boolean noHayErrores;
		
		noHayErrores = true;
		
		do {
			
			try {
				
				suma += pedirNumero();
				++contador;
			}
			
			catch ( InputMismatchException entradaInvalida ) {				
				
				noHayErrores = false;				
			}			
			
		} while ( noHayErrores && contador < 6 );
		
		System.out.println("Suma de números = " + suma);

	}

}
