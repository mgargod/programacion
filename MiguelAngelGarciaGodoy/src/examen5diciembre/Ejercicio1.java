package examen5diciembre;

//Miguel Ángel García Godoy

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int n = 0;
		String forma = "";
				
		System.out.print("Dame el número de filas: ");		
		
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		
		teclado.close();		
		
		// PRIMER DIBUJO
		
		System.out.println("Figura 1");
		
		for ( int i = 0; i < n; ++i ) {
			
			for ( int j = 0; j < n - i; ++j ) {				
				
				System.out.print("@");
				
			}
			
			System.out.println();
		}
		
		// SEGUNDO DIBUJO
		
		System.out.println("Figura 2");
		
		for ( int i = 0; i < n; ++i ) {
			
			for ( int j = 0; j < n - i; ++j ) {				
					
				System.out.print("@");				
			}			
			
			System.out.println();
			forma += " ";
			if ( i == n - 1 ) forma = "";
			System.out.print(forma);			
		
		}
		
		//TERCER DIBUJO		
		
		System.out.println("Figura 3");			
		
		forma = "";
		
		for ( int i = 1; i <= n; ++i ){
			
			for ( int j = 1; j <= n - i; ++j ){				
					
				System.out.print(" ");				
			}
			
			forma += "@";
			System.out.print(forma);
			System.out.println();
			forma += " ";
		
		}
		
		//CUARTO DIBUJO ARBOL DE NAVIDAD
		System.out.println();
		
		for ( int k = 0; k < n - 1; ++k ) {
		
			for ( int i = 0; i < k + 2; ++i ) {
				
				for ( int j = 0; j < n - i - 1; ++j ) {
					
					System.out.print(" ");
				}
				
				for ( int j = 0; j <= i; ++j ) {
					
					System.out.print("@ ");
				}
				
				System.out.println();
			}
		
		}

	}

}
