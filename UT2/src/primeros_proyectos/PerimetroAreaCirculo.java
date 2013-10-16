package primeros_proyectos;

//ESTA APLICACIÓN CALCULA EL PERÍMETRO Y EL ÁREA DE UN CÍRCULO PIDIENDO
//AL USUARIO QUE INTRODUZCA EL RADIO DEL MISMO.

//AUTOR: Miguel Ángel García Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para usarla en la aplicación

public class PerimetroAreaCirculo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducción de datos
		
		int radio; //declaración de variable entera;
		double PI = 3.1415927; //declaración y asignación de valor de constante PI
		double perimetro,
			   area; //declaración de variables reales;
				
		System.out.print( "Introduzca el RADIO del círculo (número entero positivo): ");	//petición de radio
		
		radio = teclado.nextInt(); //asignación de lectura de teclado a radio
		
		teclado.close(); //cerramos introducción de datos por teclado
		
		perimetro = 2 * PI * radio; //asignamos resultado de la operación a perimetro
		area = PI * radio * radio; //asignamos resultado de la operación a area
		
		System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
		
		System.out.println( "Perímetro: " + perimetro ); //imprime perimetro
		System.out.println( "Área: " + area ); //imprime area

	} //fin del método main

} //fin de la clase PerimetroAreaCirculo

