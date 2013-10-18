package primeros_proyectos;

//ESTA APLICACIÓN TRANSFORMA LOS KILOGRAMOS INTRODUCIDOS POR 
//EL USUARIO EN ONZAS.

//AUTOR: Miguel Ángel García Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

//18/10/2013-ACTUALIZACIÓN: Consideramos ONZAS como constante.

import java.util.Scanner; //importamos la clase Scanner para usarla en la aplicación

public class KilogramosOnzas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducción de datos
		
		double masaOnzas,
			   masaKilogramos; //declaración de variables reales;
		final double ONZAS = 35.2739619; //declaración y valor de constante transformación a onzas

							
		System.out.print( "Introduzca los kilogramos (puede ser con decimales): ");	//petición de kilogramos
		
		masaKilogramos = teclado.nextDouble(); //asignación de lectura de teclado a masaKilogramos
		
		teclado.close(); //cerramos introducción de datos por teclado
		
		masaOnzas = masaKilogramos * ONZAS; //asignamos resultado de la operación a masaOnzas
				
		System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
		
		System.out.println( masaKilogramos + " kilogramos equivalen a " + masaOnzas + " onzas." ); //imprime transformacion kg-oz
	
	} //fin del método main

} //fin de la clase KilogramosOnzas

