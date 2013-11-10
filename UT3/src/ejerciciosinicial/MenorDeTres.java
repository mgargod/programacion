package ejerciciosinicial;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA TRES NUMEROS
//ENTEROS Y MUESTRA EL MENOR DE ELLOS
//UTILIZA ESTRUCTURA IF-ELSE IF

//AUTOR: Miguel Ángel García Godoy
//FECHA: 7/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class MenorDeTres {

	public static void main(String[] args) {

		int numero1,
			numero2,
			numero3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
		numero1 = teclado.nextInt();
		
		System.out.print("Introduzca el segundo número: ");
		numero2 = teclado.nextInt();
		
		System.out.print("Introduzca el tercer número: ");
		numero3 = teclado.nextInt();
		
		teclado.close();
		
		if ( numero1 <= numero2 && numero1 <= numero3 ) {
			
			System.out.println("El primer número es el MENOR.");
		}
		
		else if ( numero2 <= numero3 ) {
			
			System.out.println("El segundo número es el MENOR.");
		}
		
		else {
			
			System.out.println("El tercer número es el MENOR.");
		}

	}

}
