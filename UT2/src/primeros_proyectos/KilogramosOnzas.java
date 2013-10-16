package primeros_proyectos;

//ESTA APLICACI�N TRANSFORMA LOS KILOGRAMOS INTRODUCIDOS POR 
//EL USUARIO EN ONZAS.

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para usarla en la aplicaci�n

public class KilogramosOnzas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducci�n de datos
		
		double kilogramos,
			   onzas; //declaraci�n de variables reales;

							
		System.out.print( "Introduzca los kilogramos (puede ser con decimales): ");	//petici�n de kilogramos
		
		kilogramos = teclado.nextDouble(); //asignaci�n de lectura de teclado a kilogramos
		
		teclado.close(); //cerramos introducci�n de datos por teclado
		
		onzas = kilogramos * 35.2739619; //asignamos resultado de la operaci�n a onzas
				
		System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
		
		System.out.println( kilogramos + " kilogramos equivalen a " + onzas + " onzas." ); //imprime transformacion kg-oz
	
	} //fin del m�todo main

} //fin de la clase KilogramosOnzas

