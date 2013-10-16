package primeros_proyectos;

//ESTA APLICACIÓN PIDE AL USUARIO INTRODUCIR DOS NÚMEROS ENTEROS Y LUEGO
//IMPRIME LA SUMA, EL PRODUCTO Y LA MEDIA DE LOS MISMOS.

//AUTOR: Miguel Ángel García Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para utilizarla en la aplicación

public class SumaProductoMediaDosEnteros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para entrada de datos
		
		int numero1,
			numero2,
			suma,
			producto; //declaración de variables (enteros)
		
		double media; //declaración de la variable media (número real)
		
		System.out.print( "Introduzca el primer número entero: "); //petición de numero1
		
		numero1 = teclado.nextInt(); //asignación de lectura del teclado a numero1;
		
		System.out.print( "Introduzca el segundo número entero: "); //petición de numero2
		
		numero2 = teclado.nextInt(); //asignación de lectura del teclado a numero1;
		
		teclado.close();
		
		suma = numero1 + numero2; //asignación de la suma de los números a la variable suma
		producto = numero1 * numero2; //asignación del producto de los números a la variable producto
		media = (double)suma / 2; //convertimos la suma en double por si la división no es exacta
		
		System.out.println( "-----RESULTADOS-----" ); //imprime cabecera "Resultados"
		
		System.out.println( "Suma: " + suma ); //imprime la suma
		System.out.println( "Producto: " + producto ); //imprime el producto
		System.out.println( "Media: " + media ); //imprime la media
		

	} //fin del método main

} //fin de la clase SumaProductoMediaDosEnteros

