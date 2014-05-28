package ejercicios2;

import java.util.*;

/*
 * Escribe una función llamada tiene_duplicados que tome una lista y 
 * devuelva true si existe algún elemento que aparece más de una vez. 
 * No debe modificarse la lista original.
 */

public class Ejercicio4_Duplicados {
	
	public static boolean tieneDuplicados(List<Object> lista) {		
		
		Set<Object> conjunto = new HashSet<Object>();
		conjunto.addAll(lista);
		if(conjunto.size() == lista.size())
			return false;
		else
			return true;		
	}

	public static void main(String[] args) {

		List<Object> lista = new ArrayList<Object>();
		
		lista.add("Primero");
		lista.add("Segundo");
		lista.add("Segundo");
		lista.add("Tercero");
		lista.add("Cuarto");
		
		//Imprimir lista original
		System.out.println(lista);
		System.out.println("¿Tiene duplicados? " + tieneDuplicados(lista));

	}

}
