package ejerciciosinicial;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA DOS NUMEROS
//ENTEROS Y MUESTRA EL MAYOR DE ELLOS
//UTILIZA ESTRUCTURA IF-ELSE

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 7/11/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner;

public class MayorDeDos {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el primer n�mero: ");
		numero1 = teclado.nextInt();
		
		System.out.print("Introduzca el primer n�mero: ");
		numero2 = teclado.nextInt();
		
		teclado.close();
		
		if ( numero1 >= numero2 ) {
			
			System.out.println("El n�mero mayor es el " + numero1);
		}
		
		else {
			
			System.out.println("El n�mero mayor es el " + numero2);
			
		}

	}

}
