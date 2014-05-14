package ejerciciosIniciales;

/*
 * Escribe una clase llamada Cuadrado, que posee un atributo de tipo entero llamado ancho.

La clase debe poseer los siguientes métodos:
 •Un constructor que no recibe ningún parámetro y que inicialice las dimensiones del cuadrado con un número por defecto.
 •Otro método constructor que reciba el ancho como parámetros. Se debe comprobar que el valor es positivo antes de asignarlo.
  En caso contrario, se asignarán valores por defecto
 •Métodos get y set para la clase.
 •Un método que calcule y retorne el área del cuadrado.
 •Método que calcule y retorne el perímetro del cuadrado.
 
Otro método que dibuje en pantalla el cuadrado mediante asteriscos, utilizando tantas columnas y filas como valor tenga el ancho.
* * *

* * *

* * *

 */

public class Cuadrado {
	
	private int ancho;
	private static final int ANCHO_DEFECTO = 3;
	
	public Cuadrado() {
		this.ancho = ANCHO_DEFECTO;
	}
	
	public Cuadrado(int ancho){
		this.ancho = ancho > 0 ? ancho : ANCHO_DEFECTO;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public int area() {
		return this.ancho * this.ancho;
	}
	
	public int perimetro() {
		return this.ancho * 4;
	}
	
	protected void dibujar(int ancho, int alto) {
		for (int i = 0; i < alto; ++i) {
			for (int j = 0; j < ancho; ++j) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
	
	public void dibujar() {
		
		dibujar(ancho, ancho);
	}
	
	

}
