package simulacro2.Ejercicio3;

public class ElementoMatriz {
	
	//Atributos
	
	private int columna;
	private int fila;
	private double contenido;
	
	//Constructor
	
	public ElementoMatriz( int columna, int fila, double contenido) {
		
		this.columna = columna;
		this.fila = fila;
		this.contenido = contenido;
		
	}
	
	//Accesadores;	

	public int getColumna() {
		return columna;
	}

	public int getFila() {
		return fila;
	}

	public double getContenido() {
		return contenido;
	}

	public void setContenido(double contenido) {
		this.contenido = contenido;
	}
	

	@Override
	public String toString() {
		return "(" + columna + "," + fila
				+ "," + contenido + ")";
	}

}
