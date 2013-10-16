package primeros_proyectos;

//ESTA APLICACI�N CALCULA EL PER�METRO Y EL �REA DE UN RECT�NGULO
//PIDIENDO AL USUARIO QUE INTRODUZCA LA BASE Y LA ALTURA DEL MISMO.

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para utilizarla en la aplicaci�n

public class PerimetroAreaRectangulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos objeto teclado para introducci�n de datos
		
		int base,
			altura,
			perimetro, 
			area; //declaraci�n de variables enteras
		
		System.out.print( "Introduzca la BASE del rect�ngulo (n�mero entero positivo): "); //petici�n de base
		
		base = teclado.nextInt(); //asignaci�n de lectura de teclado a base
		
		System.out.print( "Introduzca la ALTURA del rect�ngulo (n�mero entero positivo): "); //petici�n de altura
		
		altura = teclado.nextInt(); //asignaci�n de lectura de teclado a altura
		
		teclado.close(); //cerramos entradas por teclado.
		
		perimetro = 2 * base + 2 * altura; //asignaci�n del resultado de la operaci�n a per�metro
		area = base * altura; //asignamos el resultado de la operaci�n a area
		
		System.out.println( "------RESULTADOS------"); //impresi�n de cabecera "Resultados"
		
		System.out.println( "Per�metro: " + perimetro ); //imprime perimetro
		System.out.println( "�rea: " + area ); //imprime area
		
		
		

	} //fin del m�todo main

} //fin de la clase PerimetroAreaRectangulo

