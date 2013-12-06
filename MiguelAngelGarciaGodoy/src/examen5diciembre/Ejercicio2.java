package examen5diciembre;

import java.util.Scanner;

//Miguel �ngel Garc�a Godoy

public class Ejercicio2 {

	public static void main(String[] args) {
		
		double temperatura;
		double histeresis;
		double temperaturaActual;
		boolean encendido;
		boolean apagado;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Controlador de termostato\n" +
						   "-------------------------");
		System.out.print("�A qu� temperatura quieres estar?: ");
		temperatura = teclado.nextDouble();
		
		System.out.print("�Con qu� hist�resis trabajamos?: ");
		histeresis = teclado.nextDouble();
		
		apagado = true;
		encendido = false;
		
		while ( true ) {
						
			System.out.print("�Temperatura actual?: ");
			temperaturaActual = teclado.nextDouble();		
			
			if ( temperaturaActual < (temperatura - histeresis) && apagado ) {
				
				encendido = true;
				apagado = false;
			
			} else if ( temperaturaActual >= (temperatura + histeresis) && encendido ){
				
				encendido = false;
				apagado = true;
				
			} else if ( temperaturaActual >= (temperatura - histeresis) && temperaturaActual < (temperatura - histeresis) && encendido) {
				
				encendido = true;
				apagado = false;
			
			} else if ( temperaturaActual >= (temperatura - histeresis) && temperaturaActual < (temperatura - histeresis) && apagado) {
			
			encendido = false;
			apagado = true;
			
			}
			
			if (encendido) {
				
				System.out.println("-----------------\n" +
						           "--  ENCENDIDO  --\n" +
								   "-----------------");
			}
			
			if (apagado) {
				
				System.out.println("-----------------\n" +
				                   "--    APAGADO  --\n" +
						           "-----------------");
			}		
			
		}

	}

}
