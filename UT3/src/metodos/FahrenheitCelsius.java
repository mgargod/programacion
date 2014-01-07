package metodos;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {

		double fahrenheit;
		
		Scanner teclado = new Scanner(System.in);		
		
		do {
			
			System.out.print("Introduzca temperaturas en grados Fahrenheit [999 para terminar]: ");
			fahrenheit = teclado.nextDouble();
			if ( fahrenheit != 999 )
				System.out.printf("Temperatura en ºC: %.2f\n", fahrenheitCelsius(fahrenheit));
			
		} while ( fahrenheit != 999 );
		
		teclado.close();
	}
	
	public static double fahrenheitCelsius ( double fahrenheit ) {
		
		double celsius = ((double)5 / 9)*( fahrenheit - 32 );
		
		return celsius;
	}

}
