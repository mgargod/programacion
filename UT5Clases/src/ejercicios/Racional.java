package ejercicios;

/*
 * Constructores: por defecto: 1/1;
 * Otro constructor que le pase los parámetros.
 * 
 * métodos:
 * get/set
 * static Racional.sumar(Racional a, Racional b)
 * minumero.sumar(Racional otro)
 * restar
 * dividir
 * multiplicar
 * toString "1/2"
 * toFloatString "0.5"
 * 
 * Método privado: simplificar()
 * 
 * Clase para probarlo
 * leer dos números racionales, mostrar un menú para (sumar, restar, multiplicar, dividir)
 * hacer la operación y mostrarla.
 */



public class Racional {
	
	//ATRIBUTOS
	
	private int numerador;
	private int denominador;	
	


	public Racional() {
		
		this.numerador = 1;
		this.denominador = 1;
		
	}
	
	public Racional( int numerador, int denominador) {
		
		this.numerador = numerador;
		this.denominador = denominador;	
		
	}
	
	public void suma(Racional numero){
		
		this.setNumerador(this.getNumerador() * numero.getDenominador() + numero.getNumerador() * this.getDenominador());
		this.setDenominador(this.getDenominador() * numero.getDenominador());
		this.simplificar();
	
	}
	
	public static Racional suma( Racional a, Racional b) {
		
		Racional resultado = new Racional(a.getNumerador(),a.getDenominador());
		resultado.suma(b);
		resultado.simplificar();
		return resultado;		
		
	}
	
	public void resta(Racional numero){
		
		this.setNumerador(this.getNumerador() * numero.getDenominador() - numero.getNumerador() * this.getDenominador());
		this.setDenominador(this.getDenominador() * numero.getDenominador());
		this.simplificar();
		
	}
	
	public static Racional resta( Racional a, Racional b) {
		
		Racional resultado = new Racional(a.getNumerador(),a.getDenominador());
		resultado.resta(b);
		resultado.simplificar();
		return resultado;		
		
	}
	
	public void producto(Racional numero){
		
		this.setNumerador(this.getNumerador() * numero.getNumerador());
		this.setDenominador(this.getDenominador() * numero.getDenominador());
	}
	
	public static Racional producto( Racional a, Racional b) {
		
		Racional resultado = new Racional(a.getNumerador(),a.getDenominador());
		resultado.producto(b);
		resultado.simplificar();
		return resultado;		
	}
	
	public void division(Racional numero){
		
		this.setNumerador(this.getNumerador() * numero.getDenominador());
		this.setDenominador(this.getDenominador() * numero.getNumerador());
		simplificar();
	}
	
	public static Racional division( Racional a, Racional b) {
		
		Racional resultado = new Racional(a.getNumerador(),a.getDenominador());
		resultado.division(b);
		resultado.simplificar();
		return resultado;		
		
	}
	
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public String toString() {
		
		return String.format("%d/%d", this.getNumerador(), this.getDenominador());
	}
	
	public String toFloatString() {
		
		return String.format("%.2f", ((double)this.getNumerador() / this.getDenominador()));
	}
	
	private int maximoComunDivisor ( int numerador, int denominador ) {
		
		int menor = Math.min(denominador, numerador);
		int divisor = menor;
		
		
		//if ( numerador % denominador == 0) return denominador;
		while ( denominador % divisor != 0 || numerador % divisor != 0 ) {
			--divisor;
		}
		
		return divisor;
	}
	
	private void simplificar() {
		
		int mcd = maximoComunDivisor(this.getNumerador(), this.getDenominador());
		
		this.setDenominador(this.getDenominador()/mcd);
		this.setNumerador(this.getNumerador()/mcd);
				
	}

}
