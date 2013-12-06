package ejercicios;

import java.util.Scanner;

public class Palindromo2 {

	public static void main(String[] args) {

		long numero;
		long cociente;
		String izquierdaDerecha;
		String derechaIzquierda;
		String mensaje = "no es";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero: ");
		numero = teclado.nextLong();
		
		teclado.close();
		
		izquierdaDerecha = Long.toString( numero );		
		
		cociente = numero / 10;		
		derechaIzquierda = Long.toString( numero % 10 );
		
		while( cociente != 0 ){			
			
			derechaIzquierda += Long.toString( cociente % 10 );
			cociente /= 10;
			
		}
		
		if ( izquierdaDerecha.equals( derechaIzquierda ) ) {
			
			mensaje = "es";
		}
		
		System.out.println("El número introducido " + mensaje + " palíndromo.");
	}

}

