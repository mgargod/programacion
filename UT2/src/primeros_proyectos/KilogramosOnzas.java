package primeros_proyectos;

//ESTA APLICACIÓN TRANSFORMA LOS KILOGRAMOS INTRODUCIDOS POR 
//EL USUARIO EN ONZAS.

//AUTOR: Miguel Ángel García Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para usarla en la aplicación

public class KilogramosOnzas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducción de datos
		
		double kilogramos,
			   onzas; //declaración de variables reales;

							
		System.out.print( "Introduzca los kilogramos (puede ser con decimales): ");	//petición de kilogramos
		
		kilogramos = teclado.nextDouble(); //asignación de lectura de teclado a kilogramos
		
		teclado.close(); //cerramos introducción de datos por teclado
		
		onzas = kilogramos * 35.2739619; //asignamos resultado de la operación a onzas
				
		System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
		
		System.out.println( kilogramos + " kilogramos equivalen a " + onzas + " onzas." ); //imprime transformacion kg-oz
	
	} //fin del método main

} //fin de la clase KilogramosOnzas

