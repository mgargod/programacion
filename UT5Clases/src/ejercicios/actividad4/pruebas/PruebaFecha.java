package ejercicios.actividad4.pruebas;

import ejercicios.actividad4.Fecha;

public class PruebaFecha {

	public static void main(String[] args) {

		Fecha fecha1 = new Fecha(24,2,2014);
		
		System.out.println("Fecha1: " + fecha1);
		
		fecha1.siguienteDia();
		
		System.out.println("Día siguiente a fecha1: " + fecha1);
		
		Fecha fecha2 = new Fecha(29,2,2012);
		
		System.out.println("Fecha2: " + fecha2);
		
		fecha2.siguienteDia();
		
		System.out.println("Día siguiente a fecha2: " + fecha2);
		
		Fecha fecha3 = new Fecha(31,12,2014);
		
		System.out.println("Fecha3: " + fecha3);
		
		fecha3.siguienteDia();
		
		System.out.println("Día siguiente a fecha3: " + fecha3);
		
		Fecha fecha4 = new Fecha(31,7,2014);
		
		System.out.println("Fecha4: " + fecha4);
		
		fecha4.siguienteDia();
		
		System.out.println("Día siguiente a fecha4: " + fecha4);	

	}

}
