package condicionalesSwitchIf;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA DOS NUMEROS
//ENTEROS Y LA OPERACION ARITMETICA QUE DESEA UTILIZANDO 
//DICHOS NUMEROS, Y MUESTRA EL RESULTADO DE LA OPERACION
//UTILIZA ESTRUCTURA IF-IF ELSE Y EL METODO "EQUALS" PARA
//COMPARAR OBJETOS (EN ESTE CASO DE LA CLASE STRING)

//AUTOR: Miguel Ángel García Godoy
//FECHA: 8/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class OperacionesConDosEnteros {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		String operacion;
		final String SUMA = "+";
		final String RESTA = "-";
		final String PRODUCTO = "*";
		final String DIVISION = "/";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println( "Introduzca el primer número, a continuación la operación ( +, -, *, / )"
				+ " y por último introduzca el segundo número: ");
		
		numero1 = teclado.nextInt();
		operacion = teclado.next();
		numero2 = teclado.nextInt();
		
		teclado.close();
		
				
		if ( SUMA.equals(operacion) ) {
			
			System.out.print( " = " + (numero1 + numero2) );
		
		}else if ( RESTA.equals(operacion) ) {
			
			System.out.print( " = " + (numero1 - numero2) );
			
		}else if ( PRODUCTO.equals(operacion) ) {
			
			System.out.print( " = " + (numero1 * numero2) );
		
		}else if ( DIVISION.equals(operacion) ) {
			
			System.out.print( " = " + ((double)numero1 / numero2) );
		
		}else {
			
			System.out.println( "ERROR: no ha solicitado una operación correcta ( +, -, *, / )" );
		}

	}

}
