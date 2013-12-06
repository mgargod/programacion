package ejercicios;

import java.util.Scanner;

/*
 * Escribir programa que pida datos de empleados (nombre, sueldo)
 * Realizará una pregunta "¿Otro [s/n]?" para saber cuándo parar
 * 
 * Calcular la media del sueldo
 * Mostrar nombre de empleados que cobren por encima de la media.
 * 
 */

public class EmpleadosSueldo {

	public static void main(String[] args) {
		
		//Variables
		
		String[] nombres = new String[10];
		int[] sueldos = new int[10];
		int longNombres = 0;
		int longSueldos = 0;
		String respuesta = null;
		int suma = 0;
		double media = 0.0;
		String empleadosSobreMedia = "";
		
		//Objeto clase Scanner
		
		Scanner teclado = new Scanner(System.in);
		
		//Bucle de petición de datos
		
		do { 			
							
			System.out.print("Introduzca nombre del empleado: ");
			nombres[longNombres] = teclado.next();
				
			System.out.print("Introduzca sueldo del empleado: ");
			sueldos[longSueldos] = teclado.nextInt();
			
			do {
				
				System.out.print("¿Otro [s/n]? ");
				respuesta = teclado.next().toLowerCase();
				
			} while ( !( respuesta.equals("s") || respuesta.equals("n") ) );
			
			if ( respuesta.equals("s") ) {
				
				++longNombres;
				++longSueldos;
			}			
			
		} while ( respuesta.equals("s") );
		
		teclado.close();
		
		
		//Cálculo de la media de los sueldos
		
		for ( int i = 0; i <= longSueldos; ++i ) {
			
			suma += sueldos[i];
		}
		
		media = (double)suma / longSueldos + 1;
		
		//Imprimir nombres de empleados que cobran por encima media		
		
		for ( int i = 0; i <= longSueldos; ++i ) {
			
			if ( sueldos[i] > media ) {
				
				empleadosSobreMedia += nombres[i] + ", ";
			}
		}
		
		System.out.print("\nEmpleados que cobran por encima de la media: " + empleadosSobreMedia);	

	}

}
