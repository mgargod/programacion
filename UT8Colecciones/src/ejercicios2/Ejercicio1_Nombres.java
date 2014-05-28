package ejercicios2;

import java.util.*;

/*
 * Crear un programa que pida una serie de nombres. Después de cada nombre deberá 
 * preguntarse si quiere o no insertar otro nombre. Finalmente se imprimirán los 
 * nombres en el mismo orden en el que se introdujeron y también en oden inverso. 
 * Nota: prueba a realizarlo usando ListIterator, que tiene los métodos hasPrevious() y previous().
 */

public class Ejercicio1_Nombres {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static String pedirNombre() {
		
		System.out.print("Introduzca nombre: ");
		return teclado.nextLine();		
		
	}
	
	public static boolean deseaContinuar(String pregunta) {	
		
		String respuesta;
		boolean continuar;
		boolean devolver = false;		
		
		do {			
			continuar = false;			
			
			System.out.print(pregunta);
			respuesta = teclado.next();
			
			if(respuesta.equalsIgnoreCase("s"))	{
				devolver = true;
				teclado.nextLine();
			}
			else if(respuesta.equalsIgnoreCase("n")) devolver = false;
			else {
				System.out.println("Debe introducir \"s\" o \"n\".");
				continuar = true;
			}				
				
		} while(continuar);		
		
		return devolver;		
	}
	
	public static void imprimirEnOrdenIntroduccion(List<String> lista) {		
		
		ListIterator<String> it = lista.listIterator();
		System.out.println("==== EN EL ORDEN DE INTRODUCCION ====");
		while(it.hasNext())
			System.out.println(it.next());		
	}
	
	public static void imprimirEnOrdenInverso(List<String> lista) {		
		
		ListIterator<String> it = lista.listIterator(lista.size());
		System.out.println("==== EN EL ORDEN INVERSO ====");
		while(it.hasPrevious())
			System.out.println(it.previous());		
	}

	public static void main(String[] args) {

		List<String> nombres = new LinkedList<String>();
		boolean continuar;
		
		do {
			
			continuar = true;
			nombres.add(pedirNombre());
			if(!deseaContinuar("¿Desea introducir más nombres [s/n]? "))
				continuar = false;				
			
		} while (continuar);
		
		imprimirEnOrdenIntroduccion(nombres);
		imprimirEnOrdenInverso(nombres);

	}

}
