package graficos;

import graphics.Color;
import graphics.Rectangle;

public class TableroAjedrez {

	public static void main(String[] args) {

		final int LADO = 100;
		
		Rectangle tablero = new Rectangle ( LADO, LADO, 8 * LADO, 8 * LADO );
		tablero.draw();
		
		for ( int i = 1; i <= 8; ++i ) {
			
			for ( int j = 1; j <= 8; ++j ) {
				
				if ( (i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0) ) {
					
					Rectangle casilla = new Rectangle ( i * LADO, j * LADO, LADO, LADO );
					casilla.setColor(Color.BLACK);
					casilla.fill();
				}
			}
			
			
			
		}

	}

}
