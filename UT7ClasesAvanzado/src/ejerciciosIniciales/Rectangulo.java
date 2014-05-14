package ejerciciosIniciales;

/*
 * Crea la clase Rectángulo, que hereda de la clase Cuadrado, y posee dos atributos de tipo entero llamados largo y ancho.

La clase debe tener los siguientes métodos:
 •
Un método constructor que reciba el ancho y el largo como parámetros. Debe comrpobar que ambos valores sean positivos antes 
de asignárselos a los atributos correspondientes. En caso contrario, se asignarán valores por defecto.

 •
Métodos get y set para la clase.

 •Un método que calcule y retorne el área del rectángulo.
 •Método que calcule y retorne el perímetro del rectángulo.
 •Otro método que determine si el rectángulo es horizontal o vertical. Decimos que el rectángulo es horizontal si el valor 
 del ancho es mayor que el del alto. En caso contrario, decimos que el rectángulo es vertical.
 
Otro método que dibuje en pantalla el rectángulo mediante asteriscos, utilizando tantas columnas como valor tenga el 
ancho y tantas filas como valor tenga el alto. Por ejemplo, si el alto valiera 3 y el ancho valiera 12, se debería desplegar así:
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
