package ejerciciosArrays;

import java.util.Scanner;

/*
 * Ejercicio 1 Realiza un programa que calcule los 6 números para rellenar 
 * una quiniela primitiva controlando que no se repita ninguno de ellos.
 */

public class Ejercicio1_Primitiva {
	
	//METODO "ALEATORIOS-SIN-REPETICION": PARA NO REPETIR 
	//ELEMENTOS ALEATORIOS DE UNA MATRIZ DADA
		
	public static void aleatoriosSinRepeticion( int[] matriz, int MIN, int MAX ) {
			
		int i = 0;
		int j = 0;
			
		matriz[i] = (int)(Math.random()*MAX + MIN);
			
		for ( i = 1; i < matriz.length; ++i ) {
				
			matriz[i] = (int)(Math.random()*MAX + MIN);
				
			for ( j = 0; j < i; ++j ) {
					
				if ( matriz[j] == matriz[i] ) {
						
					--i;				
				}
			}
		}		
			
	}//FIN METODO "ALEATORIOS-SIN-REPETICION"

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escriba número de combinaciones: ");
		int numCombinaciones = teclado.nextInt();
		teclado.close();
		
		for(int i = 0; i < numCombinaciones; ++i) {
			
			System.out.println("\n===== Combinación nº " + (i+1) + " ======");
			
			int[] combinacion = new int[6];
		
			aleatoriosSinRepeticion(combinacion,1,49);		
				
			for(int numero: combinacion) 
				System.out.print(numero + " ");
		}

	}

}
