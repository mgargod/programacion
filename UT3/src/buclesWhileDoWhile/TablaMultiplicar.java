package buclesWhileDoWhile;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA UN
//NUMERO Y GENERA SU CORRESPONDIENTE TABLA DE 
//MULTIPLICAR
//UTILIZA ESTRUCTURA WHILE

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 14/11/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {

		int numero;
				
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el n�mero para el que desea su tabla de multiplicar: ");
		numero = teclado.nextInt();
		teclado.close();
		
		System.out.printf("===TABLA DEL %d===\n", numero);
				
		int contador = 1;
		
		while( contador < 11 ) {
			
			System.out.printf("%d x %d = %d\n", numero, contador, numero * contador);
			++contador;
		}
		
	}

}
