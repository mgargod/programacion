package metodos;

import java.util.Scanner;

public class AdivinaNumeroSecreto {
	
	private static boolean continuar;
	private static Scanner teclado;
	

	public static int generarNumeroSecreto() {
		
		int numSecreto = (int)(Math.random() * 100 + 1);		
		return numSecreto;
		
	}
	
	
	public static int introducirNumero() {	
		
		teclado = new Scanner(System.in);
		System.out.print("Escriba el número secreto: ");		
		int numJugador = teclado.nextInt();		
		
		return numJugador;
		
	}
	
	
	public static void compararNumeros( int num1, int num2 ) {		
			
		continuar = true;
		
		if ( num1 == num2 ) {
				
			continuar = false;
			teclado.close();
				
		} else if ( num1 > num2 ) {
				
			System.out.println("Es MAYOR");			
				
		} else {
				
			System.out.println("Es MENOR");
		}	
		
	}
	
	
	public static void imprimirResultado( int num, int intentos ) {
		
		System.out.printf("\nHas acertado el número secreto (el %d) en %d intentos.",
		           num, intentos);
		
	}	
	

	public static void main(String[] args) {

		//VARIABLES
		
		int numSecreto = 0;
		int numJugador = 0;		
		int intentos = 0;		
		
		//COMIENZA EL JUEGO
		
		numSecreto = generarNumeroSecreto();
		
		do {
			
			numJugador = introducirNumero();
			
			++intentos;
			
			compararNumeros( numSecreto, numJugador );
		
		} while (continuar);
		
		//RESULTADOS
			
		imprimirResultado( numSecreto, intentos);
	}
}
