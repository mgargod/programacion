package ejercicios;

import java.util.Scanner;

public class Asteriscos {

	public static void main(String[] args) {
		
		int numFilas = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Número de filas: ");
		numFilas = teclado.nextInt();
		
		teclado.close();
		
		String forma = "";
		
		// PRIMER DIBUJO
		
		for ( int i = 1; i <= numFilas ; ++i ) {
			
			forma += "*";
			System.out.print(forma);
			System.out.println();
		}
		
		
		System.out.println();
		
	
		//SEGUNDO DIBUJO
		
		forma = "";

		
		for ( int i = 1; i <= numFilas; ++i ){
			
			for ( int j = 1; j <= numFilas - i; ++j ){				
					
					System.out.print(" ");				
			}
			
			forma += "*";
			System.out.print(forma);
			System.out.println();					
		
		}
		
		
		System.out.println();
		
		
		//TERCER DIBUJO
		
		forma = "";
		
		for ( int i = 1; i <= numFilas; ++i ){
			
			for ( int j = 1; j <= numFilas - i; ++j ){				
					
					System.out.print(" ");				
			}
			
			forma += "*";
			System.out.print(forma);
			System.out.println();
			forma += "*";
		
		}		

	}

}
