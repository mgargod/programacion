package buclesWhileDoWhile;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA DOS NUMEROS
//ENTEROS Y LA OPERACION ARITMETICA QUE DESEA UTILIZANDO 
//DICHOS NUMEROS, Y MUESTRA EL RESULTADO DE LA OPERACION.
//DESPUES DA LA OPCION DE REPETIR OTRA OPERACION CON LOS
//NUMEROS INTRODUCIDOS ANTERIORMENTE, Y ESTO SE HACE HASTA QUE 
//INTRODUCE UNA OPERACION INCORRECTA
//UTILIZA ESTRUCTURA SWITCH-CASE, IF, DO-WHILE

//AUTOR: Miguel Ángel García Godoy
//FECHA: 14/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class OperacionesDosEnteros {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		String operacion;
		boolean condicion = true;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println( "Introduzca el primer número, a continuación la operación ( +, -, *, / )"
				+ " y por último introduzca el segundo número: ");
		
		numero1 = teclado.nextInt();
		operacion = teclado.next();
		numero2 = teclado.nextInt();
			
		
		do {
			

			switch ( operacion ) {
			
			case "+":
				
				System.out.print( "\r = " + (numero1 + numero2) );
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
				
				condicion = false;
				break;
				
			}
			
			if ( condicion ){
			
			System.out.println("\nAhora introduzca otra operación ( +, -, *, / ): ");
			operacion = teclado.next();
			
			}
				
		
		} while ( condicion = operacion.equals("+") || operacion.equals("-") || operacion.equals("*") || 
				operacion.equals("/"));
		
		if ( !condicion ) {
			
			System.out.println( "Fin por introducción de operación incorrecta." );
		
		}
		
		teclado.close();

	}

}
