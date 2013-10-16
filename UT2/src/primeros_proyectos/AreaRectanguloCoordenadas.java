package primeros_proyectos;

//ESTA APLICACI�N CALCULA EL �REA DE UN RECT�NGULO ALINEADO CON LOS EJES X-Y
//PIDIENDO AL USUARIO QUE INTRODUZCA LAS COORDENADAS DEL MISMO.

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para utilizarla en la aplicaci�n

public class AreaRectanguloCoordenadas{

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos objeto teclado para introducci�n de datos
		
		int x1,
			x2,
			y1,
			y2,
			area; //declaraci�n de variables enteras
						
		System.out.print( "Introduzca la abscisa X1: "); //petici�n de x1
		
		x1 = teclado.nextInt(); //asignaci�n de lectura de teclado a x1
		
		System.out.print( "Introduzca la abscisa X2 (mayor que X1): "); //petici�n de x2
		
		x2 = teclado.nextInt(); //asignaci�n de lectura de teclado a x2
		
		System.out.print( "Introduzca la ordenada Y1: "); //petici�n de y1
		
		y1 = teclado.nextInt(); //asignaci�n de lectura de teclado a y1
		
		System.out.print( "Introduzca la ordenada Y2 (mayor que Y1): "); //petici�n de y2
		
		y2 = teclado.nextInt(); //asignaci�n de lectura de teclado a y2
		
		teclado.close(); //cerramos entradas por teclado.
		
		area = ( x2 - x1 ) * ( y2 - y1 ); //asignamos el resultado de la operaci�n a area
		
		System.out.println( "------RESULTADOS------"); //impresi�n de cabecera "Resultados"
		
		System.out.println( "�rea: " + area ); //imprime area
		
		
		

	} //fin del m�todo main

} //fin de la clase AreaRectanguloCoordenadas

