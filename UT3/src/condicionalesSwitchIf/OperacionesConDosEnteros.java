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
		
		System.out.print( "Introduzca el primer número: ");
		numero1 = teclado.nextInt();
		
		System.out.print( "Introduzca el primer número: ");
		numero2 = teclado.nextInt();
		
		System.out.print( "Introduzca la operación a realizar ( +, -, *, / ): ");
		operacion = teclado.next();
		
		teclado.close();
		
				
		if ( SUMA.equals(operacion) ) {
			
			System.out.printf( "La SUMA de %d y de %d es igual a: %d", numero1, numero2, numero1 + numero2 );
		
		}else if ( RESTA.equals(operacion) ) {
			
			System.out.printf( "La RESTA de %d y de %d es igual a: %d", numero1, numero2, numero1 - numero2 );
			
		}else if ( PRODUCTO.equals(operacion) ) {
			
			System.out.printf( "El PRODUCTO de %d y de %d es igual a: %d", numero1, numero2, numero1 * numero2 );
		
		}else if ( DIVISION.equals(operacion) ) {
			
			System.out.printf( "La DIVISION de %d entre %d es igual a: %.2f", numero1, numero2, (double)numero1 / numero2 );
		
		}else {
			
			System.out.println( "ERROR: no ha solicitado una operación correcta ( +, -, *, / )" );
		}

	}

}
