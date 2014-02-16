package ejercicios.actividad2.pruebas_actividad2;

import ejercicios.actividad2.vehiculos.Coche;

public class PruebaCoche {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche();
		Coche coche2 = new Coche("Volkswagen","Golf");
		
		System.out.println("--- Coche 1 ---\n" + coche1);
		System.out.println("--- Coche 2 ---\n" + coche2);

	}

}
