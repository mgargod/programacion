package primeros_proyectos;

//ESTA APLICACIÓN CALCULA EL VOLUMEN DE UNA ESFERA PIDIENDO
//AL USUARIO QUE INTRODUZCA EL RADIO DE LA MISMA

//AUTOR: Miguel Ángel García Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para usarla en la aplicación

public class VolumenEsfera {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducción de datos
		
		int radio; //declaración de variable entera;
		double PI = 3.1415927; //declaración y asignación de valor de constante PI
		double volumen; //declaración de variable real
							
		System.out.print( "Introduzca el RADIO de la esfera (número entero positivo): ");	//petición de radio
		
		radio = teclado.nextInt(); //asignación de lectura de teclado a radio
		
		teclado.close(); //cerramos introducción de datos por teclado
		
		volumen = 4 * PI * radio * radio * radio / 3; //asignamos resultado de la operación a volumen
				
		System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
		
		System.out.println( "Volumen: " + volumen ); //imprime volumen
	
	} //fin del método main

} //fin de la clase VolumenEsfera

