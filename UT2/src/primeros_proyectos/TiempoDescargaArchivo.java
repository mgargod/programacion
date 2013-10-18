package primeros_proyectos;

//ESTA APLICACIÓN CALCULA EL TIEMPO DE DESCARGA DE UN ARCHIVO
//PIDIENDO AL USUARIO QUE INTRODUZCA EL TAMAÑO DEL MISMO EN Mbytes
//Y LA VELOCIDAD DE TRANSMISIÓN EN Mbps.

//AUTOR: Miguel Ángel García Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para utilizarla en la aplicación

public class TiempoDescargaArchivo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos objeto teclado para introducción de datos
		
		int tamaño,
			velocidad; //declaración de variables enteras
		double tiempo; //declaración de variable real

		
		System.out.print( "Introduzca el tamaño del archivo en Mbytes: "); //petición de tamaño archivo
		
		tamaño = teclado.nextInt(); //asignación de lectura de teclado a tamaño
		
		System.out.print( "Introduzca la velocidad de descarga en Mbps: "); //petición de velocidad
		
		velocidad = teclado.nextInt(); //asignación de lectura de teclado a velocidad
		
		teclado.close(); //cerramos entradas por teclado.
		
		tiempo = tamaño * 8 * 1.048576 / velocidad; //asignación del resultado de la operación a tiempo
				
		System.out.println( "------RESULTADOS------"); //impresión de cabecera "Resultados"
		
		System.out.println( "Tiempo estimado de descarga: " + tiempo + " segundos." ); //imprime tiempo
				

	} //fin del método main

} //fin de la clase TiempoDescargaArchivo

