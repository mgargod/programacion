package condicionalesSwitchIf;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA DOS NUMEROS
//ENTEROS Y LA OPERACION ARITMETICA QUE DESEA UTILIZANDO 
//DICHOS NUMEROS, Y MUESTRA EL RESULTADO DE LA OPERACION
//UTILIZA ESTRUCTURA SWITCH-CASE

//AUTOR: Miguel Ángel García Godoy
//FECHA: 8/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class OperacionesConDosEnterosSwitch {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		String operacion;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print( "Introduzca el primer número: ");
		numero1 = teclado.nextInt();
		
		System.out.print( "Introduzca el primer número: ");
		numero2 = teclado.nextInt();
		
		System.out.print( "Introduzca la operación a realizar ( +, -, *, / ): ");
		operacion = teclado.next();
		
		teclado.close();
					

		switch ( operacion ) {
		
		case "+":
			
			System.out.printf( "La SUMA de %d y de %d es igual a: %d", numero1, numero2, numero1 + numero2 );
			break;
		
		case "-":
			
			System.out.printf( "La RESTA de %d y de %d es igual a: %d", numero1, numero2, numero1 - numero2 );
			break;
		
		case "*":
			System.out.printf( "El PRODUCTO de %d y de %d es igual a: %d", numero1, numero2, numero1 * numero2 );
			break;
		
		case "/":
			System.out.printf( "La DIVISION de %d entre %d es igual a: %.2f", numero1, numero2, (double)numero1 / numero2 );
			break;
		
		default:
			System.out.println( "ERROR: no ha solicitado una operación correcta ( +, -, *, / )" );
			break;
			
		}

	}

}

