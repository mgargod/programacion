package ejercicios.actividad2.numeros;

public class Numero {
	
	private int numero;
	private int numeroInicial;
	
	public Numero() {
		
		setNumero(0);
		setNumeroInicial(0);
	}
	
	public Numero( int numero ) {
		
		setNumero(numero);
		setNumeroInicial(numero);
	}
	
	public int getNumeroInicial() {
		return numeroInicial;
	}

	public void setNumeroInicial(int numeroInicial) {
		this.numeroInicial = numeroInicial;
	}

	public void añade( int numero ) {
		
		setNumero(getValor() + numero);		
	}
	
	public void resta( int numero ) {
		
		setNumero(getValor() - numero);		
	}
	
	public int getDoble() {
		
		return getValor()*2;
	}
	
	public int getTriple() {
		
		return getValor()*3;
	}

	public int getValor() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void resetNumero() {
		
		setNumero(getNumeroInicial());
	}
	
	public String toString() {
		
		return String.format("%d", getValor());
	}

}
