package primeros_proyectos;

//ESTA APLICACI�N CALCULA EL TIEMPO DE DESCARGA DE UN ARCHIVO
//PIDIENDO AL USUARIO QUE INTRODUZCA EL TAMA�O DEL MISMO EN Mbytes
//Y LA VELOCIDAD DE TRANSMISI�N EN Mbps.

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para utilizarla en la aplicaci�n

public class TiempoDescargaArchivo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos objeto teclado para introducci�n de datos
		
		int tama�o,
			velocidad; //declaraci�n de variables enteras
		double tiempo; //declaraci�n de variable real

		
		System.out.print( "Introduzca el tama�o del archivo en Mbytes: "); //petici�n de tama�o archivo
		
		tama�o = teclado.nextInt(); //asignaci�n de lectura de teclado a tama�o
		
		System.out.print( "Introduzca la velocidad de descarga en Mbps: "); //petici�n de velocidad
		
		velocidad = teclado.nextInt(); //asignaci�n de lectura de teclado a velocidad
		
		teclado.close(); //cerramos entradas por teclado.
		
		tiempo = tama�o * 8 * 1.048576 / velocidad; //asignaci�n del resultado de la operaci�n a tiempo
				
		System.out.println( "------RESULTADOS------"); //impresi�n de cabecera "Resultados"
		
		System.out.println( "Tiempo estimado de descarga: " + tiempo + " segundos." ); //imprime tiempo
				

	} //fin del m�todo main

} //fin de la clase TiempoDescargaArchivo

