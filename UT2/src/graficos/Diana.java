package graficos;

//ESTA APLICACION GENERA UNA DIANA DE DIEZ CIRCULOS
//CONCENTRICOS CON COLORES ALEATORIOS

//Se utilizan las librerías "Simple Java Graphics"
//de Mr.Cay S. Horstmann (http://horstmann.com/sjsu/graphics/)
//a quien desde aquí agradezco su valioso trabajo

//AUTOR: Miguel Ángel García Godoy
//FECHA: 23/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import graphics.Color;
import graphics.Ellipse;

public class Diana {

	public static void main(String[] args) throws InterruptedException {
		
		//GEOMETRIA	
		
		int centroX = 400;
		int centroY = 400;		
		int radio = 40;
		int separacion = 40;
		
		//INTERVALO TEMPORAL
		
		final long INTERVALO = 800;
		
		//BUCLE "FOR" MULTIPROPOSITO
		
		for ( int i = 10; i > 0; --i ) {
			
			//CREACION DE CIRCULOS
			
			Ellipse circulo = new Ellipse( centroX - radio - separacion * ( i - 1 ), 
								           centroY - radio - separacion * ( i - 1 ), 
								           2 * (radio + separacion * ( i - 1 ) ), 
					                       2 * (radio + separacion * ( i - 1 ) ) );
			
			//CREACION DE COLORES ALEATORIOS
			
			int rojo = (int)(Math.random() * 255);
			int verde = (int)(Math.random() * 255);
			int azul = (int)(Math.random() * 255);			
			
			Color colorCirculo = new Color( rojo, verde, azul );
			
			//ESTABLECER COLOR DE CIRCULOS
			
			circulo.setColor(colorCirculo);
			
			//DIBUJAR CIRCULOS CON COLOR DE RELLENO
			
			circulo.fill();				
			
			Thread.sleep(INTERVALO);
			
			
		} // fin for		

	}

}
