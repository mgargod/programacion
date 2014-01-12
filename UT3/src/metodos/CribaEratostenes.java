package metodos;

import java.util.Scanner;

public class CribaEratostenes {
	
	public static int preguntarLimite() {
		
		Scanner teclado = new Scanner(System.in);
		
		int numLimite = 0;
		
		do {
			
			System.out.print("Escriba el número límite [>1]: ");
			numLimite = teclado.nextInt();
		
		} while (numLimite <= 1);
		
		teclado.close();
		
		return numLimite;		
	}
	
	public static boolean[] cribaErastotenes ( int limite ) {		
		
		boolean[] noPrimos = new boolean [limite + 1];
		
		for ( int i = 2; i <= Math.sqrt(limite); ++i ) {
			
			if ( noPrimos[i] == false ) {
				
				for ( int j = (int)Math.pow(i, 2); j <= limite; j += i) {
					
					noPrimos[j] = true;					
				}
			}
		}
		
		return noPrimos;		
	}
	
	public static void imprimirResultados ( boolean[] matriz ) {
		
		int contador = 0;
		
		for ( int i = 2; i < matriz.length; ++i ) {
			
			if ( matriz[i] ) {				
				
				System.out.printf("%5d", i); //vale hasta el numero 10000
				
				++contador;
				
				if ( contador != 0 && contador % 10 == 0) {
					
					System.out.println();
				}
			}		
		}		
	}

	public static void main(String[] args) {

		int numLimite = preguntarLimite();		
		boolean[] noPrimos = cribaErastotenes( numLimite );
		imprimirResultados( noPrimos );		

	}
}
