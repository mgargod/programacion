package ejercicios2;

import java.util.*;

/*
 * Crea una función llamada corta que tome una lista y la modifique, 
 * eliminando el primer y último elemento. Después escribe una función 
 * llamada centro que, pasada una lista por parámetro, devuelva una 
 * nueva lista que contenga todos menos los elementos primero y último.
 */

public class Ejercicio3_Corta {
	
	public static void corta(List<Object> lista) {
		lista.remove(0);
		lista.remove(lista.size()-1);
	}

	public static void main(String[] args) {

		List<Object> lista = new ArrayList<Object>();
		
		lista.add("Primero");
		lista.add("Segundo");
		lista.add("Tercero");
		lista.add("Último");
		
		//Imprimir lista original
		System.out.println(lista);
		
		//Cortar lista
		corta(lista);
		
		//Imprimir lista corta
		System.out.println(lista);

	}

}
