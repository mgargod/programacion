package ejercicios2;

import java.util.*;

/*
 * Escribe una función que tome una lista de números y devuelva la suma acumulativa; 
 * esto es, una nueva lista donde cada elemento contiene la suma de todos los elementos 
 * anteriores en la lista original. Por ejemplo, la suma acumulativa de [1,2,3] es [1,3,6].
 */

public class Ejercicio2_SumaAcumulativa {
	
	public static List<Integer> sumaAcumulativa(List<Integer> listaNumeros) {
		
		List<Integer> sumAcu = new ArrayList<Integer>();
		int suma = 0;
		
		for(int i=0; i<listaNumeros.size(); ++i) {
			suma+=listaNumeros.get(i);
			sumAcu.add(suma);			
		}
		
		return sumAcu;		
	}
	
	public static List<Integer> rellenarConEnteros(int cantidad) {
		List<Integer> listaEnteros = new ArrayList<Integer>();
		for(int i=1; i<=cantidad; ++i)
			listaEnteros.add(i);
		return listaEnteros;			
	}

	public static void main(String[] args) {		
		
		List<Integer> listaNumeros = new ArrayList<Integer>();
		List<Integer> listaSumaAcu = new ArrayList<Integer>();
		
		listaNumeros = rellenarConEnteros(10);
		listaSumaAcu = sumaAcumulativa(listaNumeros);
		
		System.out.println(listaNumeros);
		System.out.println(listaSumaAcu);		

	}

}
