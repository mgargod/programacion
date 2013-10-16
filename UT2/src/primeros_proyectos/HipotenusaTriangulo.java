package primeros_proyectos;

//ESTA APLICACI�N CALCULA LA HIPOTENUSA DE UN TRI�NGULO RECT�NGULO PIDIENDO
//AL USUARIO QUE INTRODUZCA LOS DOS CATETOS DEL MISMO.

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para usarla en la aplicaci�n

public class HipotenusaTriangulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducci�n de datos
		
		int cateto1,
			cateto2; //declaraci�n de variables enteras
		double hipotenusa; //declaraci�n de variable real
				
		System.out.print( "Introduzca el primer CATETO (n�mero entero positivo): "); //petici�n de cateto1
		
		cateto1 = teclado.nextInt(); //asignaci�n de lectura de teclado a cateto1
		
		System.out.print( "Introduzca el segundo CATETO (n�mero entero positivo): "); //petici�n de cateto2
		
		cateto2 = teclado.nextInt(); //asignaci�n de lectura de teclado a cateto2
		
		teclado.close(); //cerramos introducci�n de datos por teclado
		
		hipotenusa = Math.sqrt( cateto1 * cateto1 + cateto2 * cateto2); //asignamos resultado de la operaci�n a hipotenusa
			
		System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
		
		System.out.println( "Hipotenusa: " + hipotenusa ); //imprime hipotenusa
		
	} //fin del m�todo main


} //fin de la clase HipotenusaTriangulo

