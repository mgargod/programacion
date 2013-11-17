package buclesFor;

import java.util.Scanner;

//ESTA APLICACION PIDE AL USUARIO
//QUE INTRODUZCA DOS NUMEROS
//CON EL FIN DE VISUALIZAR LA SUMA DE
//TODOS LOS NUMEROS COMPRENDIDOS ENTRE
//AMBOS, INCLUIDOS LOS DOS INICIALES.
//SI EL PRIMER NUMERO INTRODUCIDO ES 
//MAYOR QUE EL SEGUNDO, SE VUELVEN A
//SOLICITAR OTROS DOS NUMEROS HASTA QUE
//EL PRIMER NUMERO INSERTADO SEA MENOR O
//IGUAL QUE EL SEGUNDO
//UTILIZA ESTRUCTURA FOR, IF, DO-WHILE

//AUTOR: Miguel Ángel García Godoy
//FECHA: 15/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

public class SumaNumEntreDosNumeros {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		int suma = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.print("Introduzca dos números: ");
			numero1 = teclado.nextInt();
			numero2 = teclado.nextInt();
			
		} while( numero1 > numero2 );
		
		teclado.close();
		
		for ( int i = numero1; i <= numero2; ++i ) {
			
			suma += i;
		}
		
		System.out.printf("La suma de los %d números que hay entre el %d y el %d, ambos incluidos, es: %d",
							(numero2 - numero1 + 1), numero1, numero2, suma );

	}

}
