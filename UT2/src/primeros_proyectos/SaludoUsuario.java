package primeros_proyectos;

//ESTA APLICACI�N PIDE POR TECLADO EL NOMBRE DEL USUARIO Y LUEGO IMPRIME
//UN SALUDO PERSONALIZADO.

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para utilizarla en la aplicaci�n

public class SaludoUsuario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado
				
		String nombreUsuario; //declaraci�n de la variable "nombreUsuario"
		
		System.out.print( "Introduzca el nombre de usuario: "); //imprime petici�n de inserci�n del nombre de usuario
		
		nombreUsuario = teclado.nextLine(); //asignamos el valor de lo que se lee del teclado a "nombreUsuario"
				
		System.out.print( "�Hola, " + nombreUsuario + "!"); //imprime saludo personalizado
				
		teclado.close(); //cerramos la entrada de datos por teclado
		

	} //fin del m�todo main

} //fin de la clase SaludoUsuario

