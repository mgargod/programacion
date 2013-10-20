package primeros_proyectos;

//ESTA APLICACIÓN CALCULA EL VOLUMEN DE UNA ESFERA PIDIENDO
//AL USUARIO QUE INTRODUZCA EL RADIO DE LA MISMA

//AUTOR: Miguel Ángel García Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

//18/10/2013-ACTUALIZACIÓN: Utilizamos la clase Math para la constante PI.
//20/10/2013-ACTUALIZACIÓN: Utilizamos Math.pow y printf.

import java.util.Scanner; //importamos la clase Scanner para usarla en la aplicación

public class VolumenEsfera {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducción de datos
		
		int radio; //declaración de variable entera;
		final double PI = Math.PI; //declaración y asignación de valor de constante PI
		double volumen; //declaración de variable real
							
		System.out.print( "Introduzca el RADIO de la esfera (número entero positivo): ");	//petición de radio
		
		radio = teclado.nextInt(); //asignación de lectura de teclado a radio
		
		teclado.close(); //cerramos introducción de datos por teclado
		
		volumen = 4 * PI * Math.pow(radio, 3) / 3; //asignamos resultado de la operación a volumen
		//Podríamos haber utilizado el Math.pow(radio, 3) para elevar el radio al cubo		
		System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
		
		System.out.printf( "Volumen: %.2f", volumen); //imprime volumen con formato coma flotante redondeo 2 decimales.
	
	} //fin del método main

} //fin de la clase VolumenEsfera

