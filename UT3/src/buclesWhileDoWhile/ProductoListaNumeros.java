package buclesWhileDoWhile;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA NUMEROS
//HASTA QUE EL INTRODUCIDO SEA 0.  
//SE MUESTRA LA CANTIDAD DE NUMEROS INTRODUCIDOS (SIN
//CONTAR EL 0, Y EL PRODUCTO DE DICHOS NUMEROS)
//UTILIZA ESTRUCTURA WHILE E IF-ELSE

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 14/11/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner;

public class ProductoListaNumeros {

	public static void main(String[] args) {

		int numero;
		int producto = 1;
		int contador = 0;
		
		Scanner teclado = new Scanner(System.in);
			
		System.out.print("Introduzca n�mero: ");
		numero = teclado.nextInt();
			
		if( numero == 0 ){
				
			System.out.println("Se ha introducido s�lo un n�mero y ha sido el 0");
				
		}
		
		else {
			
			while( numero != 0 ){
				
				producto *= numero;
				++contador;
				System.out.print("Introduzca n�mero: ");
				numero = teclado.nextInt();
			
			}
			
			System.out.println("Cantidad de n�meros introducidos: " + contador);
			System.out.println("Producto de n�meros introducidos: " + producto);
		}
		
		teclado.close();
	}

}

