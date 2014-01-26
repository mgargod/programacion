package ejerciciosprofundizacion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
	
	private static Scanner teclado;
	
	public static int leerNumero() {
		
		teclado = new Scanner(System.in);
		int numero = 0;
		
		System.out.print("Introduzca un número: ");
		
		try {
			
			numero = teclado.nextInt();			
			
		}
		
		catch (InputMismatchException entradaInvalida) {
			
			System.out.println("Error. Ha introducido letras. Inténtelo de nuevo.");
			throw entradaInvalida;
		}
		
		return numero;
		
	}

	public static void main(String[] args) {

		int numero = 0;		
		boolean hayError;		
		boolean numeroEncontrado = false;
		
		do {	
			
			hayError = false;
			
			try {
				
				numero = leerNumero();
				numeroEncontrado = numero >= 1 && numero <= 5;
			}
			
			catch ( InputMismatchException entradaInvalida ) {
				
				hayError = true;
			}
			
		} while ( hayError || !numeroEncontrado );
		
		System.out.println("¡NUMERO ENCONTRADO! Usted ha escrito el número " + numero);

	}

}
