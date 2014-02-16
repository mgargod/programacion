package ejercicios.actividad2.numeros;

public class MiNumero {
	
	private int numero;
	
	public MiNumero ( int numero ) {
		
		setNumero(numero);
	}
	
	public int doble() {
		
		return getNumero()*2;
	}
	
	public int triple() {
		
		return getNumero()*3;
	}
	
	public int cuadruple() {
		
		return getNumero()*4;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		
		return String.format("--- Número: %d ---\nDoble de %d = %d\nTriple de %d = %d\nCuadruple de %d = %d\n", 
							  getNumero(), getNumero(), doble(), getNumero(), triple(), getNumero(), cuadruple());
	}

	public static void main(String[] args) {
		
		MiNumero numero = new MiNumero(29);
		System.out.println(numero);		

	}

}
