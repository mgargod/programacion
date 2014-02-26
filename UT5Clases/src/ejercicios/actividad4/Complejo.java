package ejercicios.actividad4;

/*
 * Ejercicio 3 Cree una clase llamada Complejo para realizar operaciones 
 * aritméticas con números complejos. Estos números tienen la forma:

parteReal + parteImaginaria * i

donde i representa la raiz de -1.

Escribe un programa para probar tu clase. 
Usa variables reales para almacenar los datos privados de la clase. 
Crea un constructor por defecto que inicialice el número a (0,0) y otro 
que permita inicializar los dos valores al crearlo.

Crea métodos públicos para realizar las siguientes operaciones:

Suma: (a,b)+(c,d)=(a+c,b+d)
Resta: (a,b)-(c,d)=(a-c,b-d)
Producto: (a,b)*(c,d)=(ac-bd,ad+bc)
Cociente: (a,b)/(c,d)=((ac+bd)/(c2+d2),(bc-ad)/(c2+d2))

Crea un método para imprimir un número complejo de la forma (a,b), 
donde a es la parte real y b es la parte imaginaria.
 */

public class Complejo {
	
	private double real;
	private double imaginario;
	
	public Complejo() {
		
		this.real = 0;
		this.imaginario = 0;
	}
	
	public Complejo(double real, double imaginario) {
		
		this.real = real;
		this.imaginario = imaginario;
	}
	

	public void suma (Complejo a) {
		
		this.setReal(this.getReal() + a.getReal());
		this.setImaginario(this.getImaginario() + a.getImaginario());
	}
	
	public static Complejo suma ( Complejo a, Complejo b) {
		
		Complejo resultado = new Complejo (a.getReal(),a.getImaginario());
		resultado.suma(b);
		return resultado;
		
	}
	
	public void resta (Complejo a) {
		
		this.setReal(this.getReal() - a.getReal());
		this.setImaginario(this.getImaginario() - a.getImaginario());
	}
	
	public static Complejo resta ( Complejo a, Complejo b) {
		
		Complejo resultado = new Complejo (a.getReal(),a.getImaginario());
		resultado.resta(b);
		return resultado;
		
	}
	
	//Producto: (a,b)*(c,d)=(ac-bd,ad+bc)
	
	public void producto (Complejo a) {
		
		double real = (this.getReal()*a.getReal() - this.getImaginario()*a.getImaginario());
		double imaginario =(this.getReal()*a.getImaginario() + this.getImaginario()*a.getReal());
		this.setReal(real);
		this.setImaginario(imaginario);
	}
	
	public static Complejo producto ( Complejo a, Complejo b) {
		
		Complejo resultado = new Complejo (a.getReal(),a.getImaginario());
		resultado.producto(b);
		return resultado;
		
	}
	
	//Cociente: (a,b)/(c,d)=((ac+bd)/(c2+d2),(bc-ad)/(c2+d2))
	
	public void cociente (Complejo a) {
		
		double real = ((this.getReal()*a.getReal() + this.getImaginario()*a.getImaginario()) /
				    (Math.pow(a.getReal(), 2) + Math.pow(a.getImaginario(),2)));
		
		double imaginario = ((this.getImaginario()*a.getReal() - this.getReal()*a.getImaginario()) /
				          (Math.pow(a.getReal(), 2) + Math.pow(a.getImaginario(),2)));
		
		this.setReal(real);
		this.setImaginario(imaginario);
	}
	
	public static Complejo cociente ( Complejo a, Complejo b) {
		
		Complejo resultado = new Complejo (a.getReal(),a.getImaginario());
		resultado.cociente(b);
		return resultado;
		
	}
	
	public String toString() {
		
		return String.format("(%.2f%s%.2fi)", this.getReal(), this.getImaginario()<0?"-":"+", 
				                            Math.abs(this.getImaginario()));
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginario() {
		return imaginario;
	}

	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}	

}
