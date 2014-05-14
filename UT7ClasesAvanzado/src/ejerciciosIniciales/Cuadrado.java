package ejerciciosIniciales;

/*
 * Escribe una clase llamada Cuadrado, que posee un atributo de tipo entero llamado ancho.

La clase debe poseer los siguientes m�todos:
 �Un constructor que no recibe ning�n par�metro y que inicialice las dimensiones del cuadrado con un n�mero por defecto.
 �Otro m�todo constructor que reciba el ancho como par�metros. Se debe comprobar que el valor es positivo antes de asignarlo.
  En caso contrario, se asignar�n valores por defecto
 �M�todos get y set para la clase.
 �Un m�todo que calcule y retorne el �rea del cuadrado.
 �M�todo que calcule y retorne el per�metro del cuadrado.
 
Otro m�todo que dibuje en pantalla el cuadrado mediante asteriscos, utilizando tantas columnas y filas como valor tenga el ancho.
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
