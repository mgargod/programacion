package primeros_proyectos;

//ESTA APLICACI�N CALCULA EL VOLUMEN DE UNA ESFERA PIDIENDO
//AL USUARIO QUE INTRODUZCA EL RADIO DE LA MISMA

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

//18/10/2013-ACTUALIZACI�N: Utilizamos la clase Math para la constante PI.

import java.util.Scanner; //importamos la clase Scanner para usarla en la aplicaci�n

public class VolumenEsfera {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para introducci�n de datos
		
		int radio; //declaraci�n de variable entera;
		final double PI = Math.PI; //declaraci�n y asignaci�n de valor de constante PI
		double volumen; //declaraci�n de variable real
							
		System.out.print( "Introduzca el RADIO de la esfera (n�mero entero positivo): ");	//petici�n de radio
		
		radio = teclado.nextInt(); //asignaci�n de lectura de teclado a radio
		
		teclado.close(); //cerramos introducci�n de datos por teclado
		
		volumen = 4 * PI * radio * radio * radio / 3; //asignamos resultado de la operaci�n a volumen
		//Podr�amos haber utilizado el Math.pow(radio, 3) para elevar el radio al cubo		
		System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
		
		System.out.println( "Volumen: " + volumen ); //imprime volumen
	
	} //fin del m�todo main

} //fin de la clase VolumenEsfera

