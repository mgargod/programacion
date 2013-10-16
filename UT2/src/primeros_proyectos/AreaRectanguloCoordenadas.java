package primeros_proyectos;

//ESTA APLICACIÓN CALCULA EL ÁREA DE UN RECTÁNGULO ALINEADO CON LOS EJES X-Y
//PIDIENDO AL USUARIO QUE INTRODUZCA LAS COORDENADAS DEL MISMO.

//AUTOR: Miguel Ángel García Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para utilizarla en la aplicación

public class AreaRectanguloCoordenadas{

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos objeto teclado para introducción de datos
		
		int x1,
			x2,
			y1,
			y2,
			area; //declaración de variables enteras
						
		System.out.print( "Introduzca la abscisa X1: "); //petición de x1
		
		x1 = teclado.nextInt(); //asignación de lectura de teclado a x1
		
		System.out.print( "Introduzca la abscisa X2 (mayor que X1): "); //petición de x2
		
		x2 = teclado.nextInt(); //asignación de lectura de teclado a x2
		
		System.out.print( "Introduzca la ordenada Y1: "); //petición de y1
		
		y1 = teclado.nextInt(); //asignación de lectura de teclado a y1
		
		System.out.print( "Introduzca la ordenada Y2 (mayor que Y1): "); //petición de y2
		
		y2 = teclado.nextInt(); //asignación de lectura de teclado a y2
		
		teclado.close(); //cerramos entradas por teclado.
		
		area = ( x2 - x1 ) * ( y2 - y1 ); //asignamos el resultado de la operación a area
		
		System.out.println( "------RESULTADOS------"); //impresión de cabecera "Resultados"
		
		System.out.println( "Área: " + area ); //imprime area
		
		
		

	} //fin del método main

} //fin de la clase AreaRectanguloCoordenadas

