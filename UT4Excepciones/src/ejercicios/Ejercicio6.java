package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	
	public static int pedirNumero() throws InputMismatchException {
		
		int num;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);	
		
		System.out.print("Dame un número entero [pulsa una letra para terminar]: ");
		
		num = teclado.nextInt();		
		
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
