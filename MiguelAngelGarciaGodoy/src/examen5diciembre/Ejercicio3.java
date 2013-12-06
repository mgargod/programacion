package examen5diciembre;

//Miguel Ángel García Godoy

import graphics.Color;
import graphics.Rectangle;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int lado = 0;
		int[] colores = new int[3];
	

		Scanner teclado = new Scanner(System.in);
		
		do {
		
			System.out.print("Dame el lado del cuadrado ([100,200]): ");
			lado = teclado.nextInt();			
			
		} while ( lado < 100 || lado > 200 );
		
		Rectangle cuadrado = new Rectangle ( 0, 0, lado, lado);
		cuadrado.draw();
		
		
		boolean colorCorrecto;
		
		do {
			
			colorCorrecto = true;
			
			System.out.print("Dame los valores del color (R,G,B): ");
			
			for ( int i = 0; i < colores.length; ++i ) {
				
				colores[i] = teclado.nextInt();
				
				if ( colores[i] < 0 || colores[i] > 255 ) {
					
					colorCorrecto = false;
					i = colores.length;
				}
			}	
			
		} while ( !colorCorrecto );	
		
		teclado.close();
		
		Color color = new Color(colores[0], colores[1], colores[2]);
		
		cuadrado.setColor(color);
		cuadrado.fill();

	}

}
