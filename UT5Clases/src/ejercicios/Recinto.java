package ejercicios;

import graphics2.*;

public class Recinto {
	
	private int x = 0;
	private int y = 0;
	private int ancho = 0;
	private int alto = 0;
	
	public Recinto() {		
		x = 0;
		y = 0;
		ancho = 100;
		alto = 100;			
	}
	
	public Recinto( int x, int y, int ancho, int alto) {
		setX(x);
		setY(y);
		setAncho(ancho);
		setAlto(alto);		
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public void dibujar() {
		
		Rectangle recinto = new Rectangle(getX(), getY(), getAncho(), getAlto());		
		recinto.draw();		
	}
	
	public int ladoCorto() {
		
		return getAncho() >= getAlto() ? getAlto() : getAncho();
	}

}
