package buclesFor;

import java.util.Scanner;

//ESTA APLICACION PIDE AL USUARIO
//QUE INTRODUZCA 6 NUMEROS
//Y MUESTRA SU SUMA
//UTILIZA ESTRUCTURA FOR, SWITCH-CASE

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 15/11/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

public class SumaSeisNumeros {

	public static void main(String[] args) {
		
		int numero;
		int suma = 0;
		String orden = null;
		
		Scanner teclado = new Scanner(System.in);

		for ( int i = 1; i < 7; ++i ) {
			
			switch ( i ) {
			
			case 1:
				orden = "primer";
				break;
			case 2:
				orden = "segundo";
				break;
			case 3:
				orden = "tercer";
				break;
			case 4:
				orden = "cuarto";
				break;
			case 5:
				orden = "quinto";
				break;
			case 6:
				orden = "sexto y �ltimo";
				break;
			default:
				System.out.println("Error en la ejecuci�n");
				break;
			}
			
			
			System.out.print("Introduzca el " + orden + " n�mero: ");
			numero = teclado.nextInt();
			
			suma += numero;
		}
		
		teclado.close();
		
		System.out.print( "Suma ==> " + suma );
		
	}

}
