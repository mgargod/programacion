package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosDistintos {

	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		int numero = 0;
		int tamaño = 0;
		int contador = 0;
		boolean cero = false;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca números (Máximo 10): ");
		
		while ( contador < 10 && !cero ) {
			
			numero = teclado.nextInt();
			
			if ( numero == 0 ) {
				
				cero = true;
				
			} else {
				
				boolean encontrado = false;
				
				for (int i = 0; i < tamaño; ++i ) {
					
					if ( numero == numeros[i] ) {
						
						encontrado = true;
						
					}										
				}
				
				if ( !encontrado ) {
					
					numeros[tamaño] = numero;
					++tamaño;
				}
			}	
			
			++contador;
		}
		
		teclado.close();
		
		System.out.println("Tamaño números: " + tamaño );
		
		System.out.println(Arrays.toString(numeros));
		
		//Variante de Arrays.toString
		
		for ( int i = 0; i < tamaño; ++i ) {
			
			System.out.print(numeros[i] + ", ");
		}
		
	}

}
