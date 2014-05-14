package ejerciciosIniciales;

/*
 * Crea la clase Revista, que heredará de Publicación. Tendrá además el atributo número, 
con el que almacena los números al año que publica la revista, por ejemplo 12 si es mensual. 
Tendrá los métodos set/get asociados a este atributo.
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
		return String.format("%sNúmeros por año: %d\n", super.toString(), this.numeros);
	}

}
