package ejerciciosinicial;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA TRES NUMEROS
//ENTEROS Y MUESTRA EL MENOR DE ELLOS
//UTILIZA ESTRUCTURA IF-ELSE IF

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 7/11/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner;

public class MenorDeTres {

	public static void main(String[] args) {

		int numero1,
			numero2,
			numero3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el primer n�mero: ");
		numero1 = teclado.nextInt();
		
		System.out.print("Introduzca el segundo n�mero: ");
		numero2 = teclado.nextInt();
		
		System.out.print("Introduzca el tercer n�mero: ");
		numero3 = teclado.nextInt();
		
		teclado.close();
		
		if ( numero1 <= numero2 && numero1 <= numero3 ) {
			
			System.out.println("El primer n�mero es el MENOR.");
		}
		
		else if ( numero2 <= numero3 ) {
			
			System.out.println("El segundo n�mero es el MENOR.");
		}
		
		else {
			
			System.out.println("El tercer n�mero es el MENOR.");
		}

	}

}
