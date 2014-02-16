package ejercicios.actividad2.pruebas_actividad2;

import ejercicios.actividad2.conversores.Finanzas;

public class PruebaFinanzas {

	public static void main(String[] args) {
		
		double cantidadEuros = 125.45;
		double cantidadDolares = 98.34;
		double eurosEnDolares = 0;
		double dolaresEnEuros = 0;

		Finanzas cambio1 = new Finanzas();
		Finanzas cambio2 = new Finanzas(1.38);
		
		eurosEnDolares = cambio1.eurosToDolares(cantidadEuros);
		dolaresEnEuros = cambio1.dolaresToEuros(cantidadDolares);
		
		System.out.printf("--- APLICACION DEL CAMBIO 1 (1 euro = %.2f dolares) ---\n", cambio1.getCambioDolarEuro());
		System.out.printf("%.2f euros = %.2f dolares.\n", cantidadEuros, eurosEnDolares);
		System.out.printf("%.2f dolares = %.2f euros.\n", cantidadDolares, dolaresEnEuros);
		
		eurosEnDolares = cambio2.eurosToDolares(cantidadEuros);
		dolaresEnEuros = cambio2.dolaresToEuros(cantidadDolares);
		
		System.out.printf("--- APLICACION DEL CAMBIO 2 (1 euro = %.2f dolares) ---\n", cambio2.getCambioDolarEuro());
		System.out.printf("%.2f euros = %.2f dolares.\n", cantidadEuros, eurosEnDolares);
		System.out.printf("%.2f dolares = %.2f euros.\n", cantidadDolares, dolaresEnEuros);		

	}

}
