package primeros_proyectos;

//ESTA APLICACIÓN CALCULA LA HIPOTENUSA DE UN TRIÁNGULO RECTÁNGULO PIDIENDO
//AL USUARIO QUE INTRODUZCA LOS DOS CATETOS DEL MISMO.

//AUTOR: Miguel Ángel García Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para usarla en la aplicación

public class HipotenusaTriangulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducción de datos
		
		int cateto1,
			cateto2; //declaración de variables enteras
		double hipotenusa; //declaración de variable real
				
		System.out.print( "Introduzca el primer CATETO (número entero positivo): "); //petición de cateto1
		
		cateto1 = teclado.nextInt(); //asignación de lectura de teclado a cateto1
		
		System.out.print( "Introduzca el segundo CATETO (número entero positivo): "); //petición de cateto2
		
		cateto2 = teclado.nextInt(); //asignación de lectura de teclado a cateto2
		
		teclado.close(); //cerramos introducción de datos por teclado
		
		hipotenusa = Math.sqrt( cateto1 * cateto1 + cateto2 * cateto2); //asignamos resultado de la operación a hipotenusa
			
		System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
		
		System.out.println( "Hipotenusa: " + hipotenusa ); //imprime hipotenusa
		
	} //fin del método main


} //fin de la clase HipotenusaTriangulo

