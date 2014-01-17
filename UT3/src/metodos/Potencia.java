package metodos;

import java.util.Scanner;

public class Potencia {
	
	public static int enteroPotencia( int base, int potencia ) {
		
		int resultado = 1;
		
		for ( int i = 1; i <= potencia; ++i ) {
			
			resultado *= base; 
		}
		
		return resultado;
	}

	public static void main(String[] args) {
		
		int potencia = 0;
		int base = 0;
		int exponente = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.print("Dame la base [entero] y el exponente [entero positivo <> 0]: ");
			base = teclado.nextInt();
			exponente = teclado.nextInt();
			
		} while ( exponente <= 0 );
		
		teclado.close();

		potencia = enteroPotencia(base, exponente);
		
		System.out.printf("%d elevado a %d es igual a %d", base, exponente, potencia);

	}

}
