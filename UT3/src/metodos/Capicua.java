package metodos;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {

		long numero;
		
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("Introduzca un n�mero: ");
		
		numero = teclado.nextLong();
		
		teclado.close();
		
		if ( isCapicua(numero) )
		
			System.out.println( "El n�mero " + numero + " es capic�a." );
		
		else
			
			System.out.println( "El n�mero " + numero + " no es capic�a." );

	}
	
	public static boolean isCapicua ( long numero ) {
		
		boolean capicua = true;
		
		char[] cadena = (Long.toString(numero)).toCharArray();		
				
		for ( int i = 0; i <= cadena.length / 2; ++i ) {
			
			if ( !(cadena[i] == cadena[cadena.length - i - 1] ) ) {
				
				capicua = false;
			}
		}
		
		return capicua;
	}

}
