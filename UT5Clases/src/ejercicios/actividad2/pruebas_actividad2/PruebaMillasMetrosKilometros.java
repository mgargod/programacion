package ejercicios.actividad2.pruebas_actividad2;

import ejercicios.actividad2.conversores.MillasKmMts;

public class PruebaMillasMetrosKilometros {

	public static void main(String[] args) {

		double millas = 2.56;
		double metros = 0;
		double kilometros = 0;
		
		metros = MillasKmMts.millas_mts(millas);
		kilometros = MillasKmMts.millas_km(millas);
		
		System.out.printf("%.2f millas equivalen a %,.2f metros, y a %.2f kilometros.",
							millas, metros, kilometros);
		
		
		
		

	}

}
