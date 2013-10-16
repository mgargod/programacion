package primeros_proyectos;

//ESTA APLICACI�N CALCULA EL PER�METRO Y EL �REA DE UN C�RCULO PIDIENDO
//AL USUARIO QUE INTRODUZCA EL RADIO DEL MISMO.

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para usarla en la aplicaci�n

public class PerimetroAreaCirculo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducci�n de datos
		
		int radio; //declaraci�n de variable entera;
		double PI = 3.1415927; //declaraci�n y asignaci�n de valor de constante PI
		double perimetro,
			   area; //declaraci�n de variables reales;
				
		System.out.print( "Introduzca el RADIO del c�rculo (n�mero entero positivo): ");	//petici�n de radio
		
		radio = teclado.nextInt(); //asignaci�n de lectura de teclado a radio
		
		teclado.close(); //cerramos introducci�n de datos por teclado
		
		perimetro = 2 * PI * radio; //asignamos resultado de la operaci�n a perimetro
		area = PI * radio * radio; //asignamos resultado de la operaci�n a area
		
		System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
		
		System.out.println( "Per�metro: " + perimetro ); //imprime perimetro
		System.out.println( "�rea: " + area ); //imprime area

	} //fin del m�todo main

} //fin de la clase PerimetroAreaCirculo

