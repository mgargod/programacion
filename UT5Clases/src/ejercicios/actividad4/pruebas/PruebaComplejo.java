package ejercicios.actividad4.pruebas;

import ejercicios.actividad4.Complejo;

public class PruebaComplejo {

	public static void main(String[] args) {

		Complejo complejo1 = new Complejo(8,3);
		Complejo complejo2 = new Complejo(-2,-4);
		
		System.out.println(complejo1 + " + " + complejo2 + " = " + Complejo.suma(complejo1, complejo2));
		System.out.println(complejo1 + " - " + complejo2 + " = " + Complejo.resta(complejo1, complejo2));
		System.out.println(complejo1 + " x " + complejo2 + " = " + Complejo.producto(complejo1, complejo2));
		System.out.println(complejo1 + " / " + complejo2 + " = " + Complejo.cociente(complejo1, complejo2));

	}

}
