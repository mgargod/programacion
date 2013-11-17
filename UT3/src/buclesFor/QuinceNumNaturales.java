package buclesFor;

//ESTA APLICACION VISUALIZA LOS
//15 PRIMEROS NUMEROS NATURALES
//DEL 15 AL 1
//PRIMERO UTILIZA ESTRUCTURA WHILE,
//Y DESPUES FOR.

//AUTOR: Miguel Ángel García Godoy
//FECHA: 15/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

public class QuinceNumNaturales {

	public static void main(String[] args) {

		int numero = 15;
		
		while( numero > 0 ) {
			
			System.out.print( numero + "\t");
			
			--numero;
		}
		
		System.out.println();
		
		for ( numero = 15; numero > 0; --numero ) {
			
			System.out.print( numero + "\t");
		
		}

	}

}
