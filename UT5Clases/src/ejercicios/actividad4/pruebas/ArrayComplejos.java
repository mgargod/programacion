package ejercicios.actividad4.pruebas;

import ejercicios.actividad4.Complejo;

//array de 40 complejos, aleatorios tanto la parte real como imaginaria del 0 al 10
//calcular el sumatorio de todos los complejos

public class ArrayComplejos {

	public static void main(String[] args) {

		Complejo[] complejos = new Complejo[40];
		Complejo suma = new Complejo();
		
		for ( Complejo c : complejos) {
			
			c = new Complejo();
			c.setReal(Math.random()*11);
			c.setImaginario(Math.random()*11);
			suma.suma(c);
			
		}
		
		System.out.println(suma);

	}

}
