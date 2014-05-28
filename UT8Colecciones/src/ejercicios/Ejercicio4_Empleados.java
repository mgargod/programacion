package ejercicios;

import java.util.*;

/*
 * Crear un programa que utilice dos colecciones, una de tipo ArrayList y otra de tipo LinkedList. 
 * Las colecciones se cargarán con objetos de tipo Empleado (de los ejercicios anteriores), 
 * en la cantidad que quieras, pero al menos un objeto se cargará en las dos colecciones. 
 * El programa realizará las siguientes operaciones (tras cada operación imprimir el contenido 
 * de las colecciones para comprobar el resultado):

    Añadirá a la primera colección los empleados que estén en la segunda.
    Borrará de la primera colección todos los empleados que no estén en la segunda.
    Borra toda la primera colección.

 */


public class Ejercicio4_Empleados {
	
	public static void imprimirLista(List<Empleado> lista) {		
		for(Empleado empleado : lista) 
			empleado.visualizarDatos();		
	}

	public static void main(String[] args) {
		
		LinkedList<Empleado> lista1 = new LinkedList<Empleado>();
		ArrayList<Empleado> lista2 = new ArrayList<Empleado>();
		
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado();
		Empleado empleado4 = new Empleado();
		
		empleado1.pedirDatos();
		empleado2.pedirDatos();
		empleado3.pedirDatos();
		empleado4.pedirDatos();
		
		lista1.add(empleado1);
		lista1.add(empleado2);
		lista2.add(empleado1);
		lista2.add(empleado3);
		lista2.add(empleado4);
		
		//Colecciones originales
		System.out.println("============ LISTA 1 =============");
		imprimirLista(lista1);
		System.out.println("============ LISTA 2 =============");
		imprimirLista(lista2);
		
		//Añadirá a la primera colección los empleados que estén en la segunda.
		lista1.addAll(lista2);
		System.out.println("======== Lista 1 añadida la Lista 2 ========");
		imprimirLista(lista1);
		
		//Borrará de la primera colección todos los empleados que no estén en la segunda.		
		
		for(int i=0; i < lista1.size(); ++i)
			if(!lista2.contains(lista1.get(i)))
				lista1.remove(i);
		System.out.println("======== Lista 1 borrando elementos que no están en Lista 2 ========");
		imprimirLista(lista1);		
		
	}
}
