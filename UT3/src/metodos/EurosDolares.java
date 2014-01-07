package metodos;

import java.util.Scanner;

public class EurosDolares {

	public static void main(String[] args) {
		
		double euros;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad en euros: ");
		
		euros = teclado.nextDouble();
		
		teclado.close();
		
		System.out.printf("Equivalente en dólares: %.2f", toDolares(euros));	

	}
	
	public static double toDolares( double euros ) {
		
		final double CAMBIO = 1.3796;
		
		double dolares = euros * CAMBIO;
		
		return dolares;
	}

}
