package graficos;

import graphics.Color;
import graphics.Ellipse;

public class ColoresAleatorios {
	
	public static Color colorAleatorio() {
		
		int rojo = (int)(Math.random()*256);
		int verde = (int)(Math.random()*256);
		int azul = (int)(Math.random()*256);		
		Color color = new Color( rojo, verde, azul );
		return color;
	}

	public static void main(String[] args) throws InterruptedException {

		Color[] colores; // = {new Color(255,0,0), Color.CYAN, ... };
		
		colores = new Color[5];
		
		colores[0] = new Color(255,0,0);
		colores[1] = Color.CYAN;
		colores[2] = Color.GREEN;
		colores[3] = Color.YELLOW;
		colores[4] = new Color(125,255,0);
		
		String[] nombres = {"rojo", "cyan", "green", "yellow", "otroVerde"};
		
		Ellipse circulo = new Ellipse( 100, 100, 300, 300 );
		
		while ( true ){
			
			int color;
			//circulo.setColor(colores[color = (int)(Math.random()*5)]);
			circulo.setColor(colorAleatorio());
			circulo.fill();
			Thread.sleep(200);
			
			
		}
		

	}

}
