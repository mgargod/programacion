package primeros_proyectos;

//ESTA APLICACIÓN CALCULA EL PERÍMETRO Y EL ÁREA DE UN RECTÁNGULO
//PIDIENDO AL USUARIO QUE INTRODUZCA LA BASE Y LA ALTURA DEL MISMO.

//AUTOR: Miguel Ángel García Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para utilizarla en la aplicación

public class PerimetroAreaRectangulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos objeto teclado para introducción de datos
		
		int base,
			altura,
			perimetro, 
			area; //declaración de variables enteras
		
		System.out.print( "Introduzca la BASE del rectángulo (número entero positivo): "); //petición de base
		
		base = teclado.nextInt(); //asignación de lectura de teclado a base
		
		System.out.print( "Introduzca la ALTURA del rectángulo (número entero positivo): "); //petición de altura
		
		altura = teclado.nextInt(); //asignación de lectura de teclado a altura
		
		teclado.close(); //cerramos entradas por teclado.
		
		perimetro = 2 * base + 2 * altura; //asignación del resultado de la operación a perímetro
		area = base * altura; //asignamos el resultado de la operación a area
		
		System.out.println( "------RESULTADOS------"); //impresión de cabecera "Resultados"
		
		System.out.println( "Perímetro: " + perimetro ); //imprime perimetro
		System.out.println( "Área: " + area ); //imprime area
		
		
		

	} //fin del método main

} //fin de la clase PerimetroAreaRectangulo

