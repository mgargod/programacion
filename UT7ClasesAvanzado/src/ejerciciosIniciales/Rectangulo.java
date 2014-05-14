package ejerciciosIniciales;

/*
 * Crea la clase Rect�ngulo, que hereda de la clase Cuadrado, y posee dos atributos de tipo entero llamados largo y ancho.

La clase debe tener los siguientes m�todos:
 �
Un m�todo constructor que reciba el ancho y el largo como par�metros. Debe comrpobar que ambos valores sean positivos antes 
de asign�rselos a los atributos correspondientes. En caso contrario, se asignar�n valores por defecto.

 �
M�todos get y set para la clase.

 �Un m�todo que calcule y retorne el �rea del rect�ngulo.
 �M�todo que calcule y retorne el per�metro del rect�ngulo.
 �Otro m�todo que determine si el rect�ngulo es horizontal o vertical. Decimos que el rect�ngulo es horizontal si el valor 
 del ancho es mayor que el del alto. En caso contrario, decimos que el rect�ngulo es vertical.
 
Otro m�todo que dibuje en pantalla el rect�ngulo mediante asteriscos, utilizando tantas columnas como valor tenga el 
ancho y tantas filas como valor tenga el alto. Por ejemplo, si el alto valiera 3 y el ancho valiera 12, se deber�a desplegar as�:
* * * * * * * * * * * *

* * * * * * * * * * * *

* * * * * * * * * * * *

 */

public class Rectangulo extends Cuadrado {
	
	private int alto;
	private static final int ALTO_DEFECTO = 6;
	
	public Rectangulo (int ancho, int alto) {
		super(ancho);
		this.alto = alto > 0 ? alto : ALTO_DEFECTO; 
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int largo) {
		this.alto = largo;
	}

	
	public int area() {
		return this.getAncho() * this.alto;
	}
	
	public int perimetro() {
		return this.getAncho() * 2 + this.alto * 2;
	}
	
	public boolean esHorizontal() {
		return this.getAncho() >= this.alto ? true : false;
	}
	
	public void dibujar() {
		dibujar(getAncho(), this.alto);
	}

}
