package primeros_proyectos;

//ESTA APLICACI�N TRANSFORMA LOS KILOGRAMOS INTRODUCIDOS POR 
//EL USUARIO EN ONZAS.

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

//18/10/2013-ACTUALIZACI�N: Consideramos ONZAS como constante.

import java.util.Scanner; //importamos la clase Scanner para usarla en la aplicaci�n

public class KilogramosOnzas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducci�n de datos
		
		double masaOnzas,
			   masaKilogramos; //declaraci�n de variables reales;
		final double ONZAS = 35.2739619; //declaraci�n y valor de constante transformaci�n a onzas

							
		System.out.print( "Introduzca los kilogramos (puede ser con decimales): ");	//petici�n de kilogramos
		
		masaKilogramos = teclado.nextDouble(); //asignaci�n de lectura de teclado a masaKilogramos
		
		teclado.close(); //cerramos introducci�n de datos por teclado
		
		masaOnzas = masaKilogramos * ONZAS; //asignamos resultado de la operaci�n a masaOnzas
				
		System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
		
		System.out.println( masaKilogramos + " kilogramos equivalen a " + masaOnzas + " onzas." ); //imprime transformacion kg-oz
	
	} //fin del m�todo main

} //fin de la clase KilogramosOnzas

