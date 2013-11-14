package condicionalesSwitchIf;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA DOS NUMEROS
//ENTEROS Y LA OPERACION ARITMETICA QUE DESEA UTILIZANDO 
//DICHOS NUMEROS, Y MUESTRA EL RESULTADO DE LA OPERACION
//UTILIZA ESTRUCTURA SWITCH-CASE

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 8/11/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import java.util.Scanner;

public class OperacionesConDosEnterosSwitch {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		String operacion;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println( "Introduzca el primer n�mero, a continuaci�n la operaci�n ( +, -, *, / )"
				+ " y por �ltimo introduzca el segundo n�mero: ");
		
		numero1 = teclado.nextInt();
		operacion = teclado.next();
		numero2 = teclado.nextInt();
		
		
		teclado.close();
					

		switch ( operacion ) {
		
		case "+":
			
			System.out.print( " = " + (numero1 + numero2) );
			break;
		
		case "-":
			
			System.out.print( " = " + (numero1 - numero2) );
			break;
		
		case "*":
			System.out.print( " = " + (numero1 * numero2) );
			break;
		
		case "/":
			System.out.print( " = " + ((double)numero1 / numero2) );
			break;
		
		default:
			System.out.println( "ERROR: no ha solicitado una operaci�n correcta ( +, -, *, / )" );
			break;
			
		}

	}

}

