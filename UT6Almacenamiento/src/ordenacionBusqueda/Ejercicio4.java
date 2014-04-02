package ordenacionBusqueda;

/*
 * Ejercicio 4. Necesitamos crear un método al que le pasemos un vector de enteros y nos devuelva 
 * el vector sin números repetidos. No es necesario conservar el orden de los elementos.
 * 
 */

import java.util.Arrays;

public class Ejercicio4 {
	
	public static int[] vectorSinRepetidos( int[] vector ) {
		
		int[] vectorAux = new int[vector.length];		
		int contador = 0;
		
		Arrays.sort(vector);
		vectorAux[0] = vector[0];
		
		for(int i=1; i < vector.length; ++i) {
			
			if ( vector[i-1] != vector[i] ) {
				
				contador++;				
				vectorAux[contador] = vector[i];
			}			
		}		
		
		return Arrays.copyOfRange(vectorAux, 0, (contador+1));			
	}

	public static void main(String[] args) {

		int[] vector = {5,6,1,9,3,5,8,7,6,6,6,5,10,11,15,7,3,1,1,2};
		int[] vector2 = vectorSinRepetidos(vector);
		
		System.out.println(Arrays.toString(vector2));

	}

}

