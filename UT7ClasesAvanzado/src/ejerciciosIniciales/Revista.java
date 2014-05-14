package ejerciciosIniciales;

/*
 * Crea la clase Revista, que heredar� de Publicaci�n. Tendr� adem�s el atributo n�mero, 
con el que almacena los n�meros al a�o que publica la revista, por ejemplo 12 si es mensual. 
Tendr� los m�todos set/get asociados a este atributo.
 */

public class Revista extends Publicacion {
	
	private int numeros;

	public int getNumero() {
		return numeros;
	}

	public void setNumero(int numeros) {
		this.numeros = numeros;
	}
	
	public String toString() {
		return String.format("%sN�meros por a�o: %d\n", super.toString(), this.numeros);
	}

}
