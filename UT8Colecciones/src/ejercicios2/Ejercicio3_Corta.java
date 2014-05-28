package ejercicios2;

import java.util.*;

/*
 * Crea una funci�n llamada corta que tome una lista y la modifique, 
 * eliminando el primer y �ltimo elemento. Despu�s escribe una funci�n 
 * llamada centro que, pasada una lista por par�metro, devuelva una 
 * nueva lista que contenga todos menos los elementos primero y �ltimo.
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
		lista.add("�ltimo");
		
		//Imprimir lista original
		System.out.println(lista);
		
		//Cortar lista
		corta(lista);
		
		//Imprimir lista corta
		System.out.println(lista);

	}

}
