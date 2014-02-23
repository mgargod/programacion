package ejercicios.actividad2.pruebas_actividad2;

import ejercicios.actividad2.pesos.Peso;

public class PruebaPeso {

	public static void main(String[] args) {
		
		double peso1 = 3000;

		Peso peso = new Peso(peso1,"li");
		
		System.out.printf("Peso en libras: %,.2f\n", peso.getLibras());
		System.out.printf("Peso en lingotes: %,.2f\n", peso.getLingotes());
		System.out.printf("Peso en kilogramos: %,.2f\n", peso.getPeso("k"));

	}

}
