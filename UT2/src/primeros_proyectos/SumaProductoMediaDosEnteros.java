package primeros_proyectos;

//ESTA APLICACI�N PIDE AL USUARIO INTRODUCIR DOS N�MEROS ENTEROS Y LUEGO
//IMPRIME LA SUMA, EL PRODUCTO Y LA MEDIA DE LOS MISMOS.

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 13/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner; //importamos la clase Scanner para utilizarla en la aplicaci�n

public class SumaProductoMediaDosEnteros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); //creamos el objeto teclado para entrada de datos
		
		int numero1,
			numero2,
			suma,
			producto; //declaraci�n de variables (enteros)
		
		double media; //declaraci�n de la variable media (n�mero real)
		
		System.out.print( "Introduzca el primer n�mero entero: "); //petici�n de numero1
		
		numero1 = teclado.nextInt(); //asignaci�n de lectura del teclado a numero1;
		
		System.out.print( "Introduzca el segundo n�mero entero: "); //petici�n de numero2
		
		numero2 = teclado.nextInt(); //asignaci�n de lectura del teclado a numero1;
		
		teclado.close();
		
		suma = numero1 + numero2; //asignaci�n de la suma de los n�meros a la variable suma
		producto = numero1 * numero2; //asignaci�n del producto de los n�meros a la variable producto
		media = (double)suma / 2; //convertimos la suma en double por si la divisi�n no es exacta
		
		System.out.println( "-----RESULTADOS-----" ); //imprime cabecera "Resultados"
		
		System.out.println( "Suma: " + suma ); //imprime la suma
		System.out.println( "Producto: " + producto ); //imprime el producto
		System.out.println( "Media: " + media ); //imprime la media
		

	} //fin del m�todo main

} //fin de la clase SumaProductoMediaDosEnteros

