package condicionales;

//ESTA APLICACION PIDE AL USUARIO QUE ADIVINE EL NUMERO
//OCULTO, PREDEFINIDO EN LA CONSTANTE "OCULTO" 
//DE ENTRE NUMEROS ENTEROS COMPRENDIDOS ENTRE 1 Y 10
//UTILIZA ESTRUCTURA IF-ELSE

//AUTOR: Miguel Ángel García Godoy
//FECHA: 8/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class NumeroOculto {

	public static void main(String[] args) {

		
		int numeroUsuario;
		final int OCULTO = 4;
		String mensaje = "";

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escriba el número oculto (1-10): ");
		numeroUsuario = teclado.nextInt();
		teclado.close();
		
		if ( numeroUsuario == OCULTO ){
			
			mensaje = "¡ENHORABUENA!, ha acertado el número oculto";
		
		}
		
		else {
			
			mensaje = "Ha fallado, inténtelo de nuevo";
		}
		
		System.out.println( mensaje );
		

	}

}

