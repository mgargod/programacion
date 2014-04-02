package ejerciciosVectoresMatrices.ejercicio10;

import java.util.Arrays;

public class Pantalla {
	
	//ATRIBUTOS
	
	private final int ALTO = 15;
	private final int ANCHO = 15;
	private char caracter;
	private char[][] pixeles;	
	
	//CONSTRUCTOR
	
	public Pantalla() {
		
		this.pixeles = new char[this.ALTO][this.ANCHO];
		for ( int i = 0; i < this.pixeles.length; ++i ) {
			
			Arrays.fill(this.pixeles[i], '*');
		}
		this.caracter = '@';
	}
	
	//GETTERS Y SETTERS
	
	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	
	//SERVICIOS
	
	public void mostrar() {
		
		for (int i = 0; i < 100; ++i) {
			System.out.println();
		}
		
		for ( char[] fila : this.pixeles ) {
			for ( char pixel : fila ) {
				System.out.print(pixel + " ");
			}
			System.out.println();
		}
		

	}
	
	public void rectangulo( int oxUser, int oyUser, int altoUser, int anchoUser ) {
		
		int alto = altoUser - 1;
		int ancho = anchoUser - 1;
		int ox = oxUser - 1;
		int oy = oyUser - 1;
		
		for ( int i = ox; i <= ox + alto; ++i ) {
			for ( int j = oy; j <= oy + ancho; ++j ) {
				if ( i == ox || j == oy || i == ox + alto || j == oy + ancho ) {
					pixeles[i][j] = this.caracter;
				}
			}
		}
	}
	
	public void cuadrado( int oxUser, int oyUser, int altoUser ) {
		
		int alto = altoUser - 1;
		int ancho = altoUser - 1;
		int ox = oxUser - 1;
		int oy = oyUser - 1;
		
		for ( int i = ox; i <= ox + alto; ++i ) {
			for ( int j = oy; j <= oy + ancho; ++j ) {
				if ( i == ox || j == oy || i == ox + alto || j == oy + ancho ) {
					pixeles[i][j] = this.caracter;
				}
			}
		}
	}
	
	public void triangulo( int oxUser, int oyUser, int alturaUser ) {
		
		int ox = oxUser - 1;
		int oy = oyUser - 1;
		int altura = alturaUser - 1;
		pixeles[ox][oy] = this.caracter;
		for ( int i = ox + 1; i <= ox + altura; ++i ) {
			
			if ( i != ox + altura ) {
				
				for ( int j = oy - i; j <= oy + i; j += i*2 ) {
					pixeles[i][j] = this.caracter;
				}
			
			} else {
				
				for ( int j = oy - i; j <= oy + i; ++j ) {
					 pixeles[i][j] = this.caracter;
				}
			}		
			
		}
	}

	public static void main(String[] args) {
		
		Pantalla display = new Pantalla();
		display.mostrar();		
		//display.rectangulo(2, 2, 3, 6);
		display.triangulo(1, 7, 8);
		display.mostrar();	
		
	}

}
