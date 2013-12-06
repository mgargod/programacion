package ejercicios;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {

		//VARIABLES
		
		int numPrograma = 0;
		int numUsuario = 0;		
		boolean continuar;
		boolean acertado = false;
		int intentos = 0;
	    long start = System.currentTimeMillis();
	    long intervalo;
	    final int MAX = 10;
	    		
		Scanner teclado = new Scanner(System.in);
		
		//PENSAR NUMERO
		
		numPrograma = (int)(Math.random() * 100 + 1);
		
		//COMIENZA EL JUEGO
		
		do {
			
			continuar = true;
			
			System.out.print("Escriba el número secreto: ");
			
			numUsuario = teclado.nextInt();
			++intentos;
			intervalo = (System.currentTimeMillis() - start)/1000;			
			System.out.println("Llevas jugando " + intervalo + " segundos.");
			
			if ( numPrograma == numUsuario ) {
				
				continuar = false;
				acertado = true;				
				
			} else if ( numPrograma > numUsuario ) {
				
				System.out.println("Es MAYOR");
				
			} else {
				
				System.out.println("Es MENOR");
			}			
			
		} while ( continuar && intentos < MAX );
		
		teclado.close();
		
		//RESULTADOS
		
		if ( acertado ) {
			
			System.out.printf("\nHas acertado el número (que era el %d) en el intento nº %d, tardando %d segundos.",
					           numPrograma, intentos, intervalo );			
		} else {
			
			System.out.printf("\nNo has acertado el número (que era el %d) en %d intentos, tardando %d segundos.",
			           numPrograma, intentos, intervalo );
		}

	}

}
