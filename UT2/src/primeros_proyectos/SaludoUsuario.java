package primeros_proyectos;

//ESTA APLICACIÓN PIDE POR TECLADO EL NOMBRE DEL USUARIO Y LUEGO IMPRIME
//UN SALUDO PERSONALIZADO.

//AUTOR: Miguel Ángel García Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para utilizarla en la aplicación

public class SaludoUsuario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado
				
		String nombreUsuario; //declaración de la variable "nombreUsuario"
		
		System.out.print( "Introduzca el nombre de usuario: "); //imprime petición de inserción del nombre de usuario
		
		nombreUsuario = teclado.nextLine(); //asignamos el valor de lo que se lee del teclado a "nombreUsuario"
				
		System.out.print( "¡Hola, " + nombreUsuario + "!"); //imprime saludo personalizado
				
		teclado.close(); //cerramos la entrada de datos por teclado
		

	} //fin del método main

} //fin de la clase SaludoUsuario

