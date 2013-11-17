package buclesFor;

import java.util.Scanner;

//ESTA APLICACION PIDE AL USUARIO QUE ESCRIBA
//CINCO FRASES Y ESTAS SE VISUALIZAN
//UTILIZA ESTRUCTURA FOR.

//AUTOR: Miguel Ángel García Godoy
//FECHA: 15/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

public class CincoFrases {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escriba 5 frases: ");
		
		for ( int i = 1; i < 6; ++i ){
			
			String frase = teclado.nextLine();
			System.out.println( "Frase " + i + ": " + frase );
		}
		
		teclado.close();
		
		
		

	}

}
