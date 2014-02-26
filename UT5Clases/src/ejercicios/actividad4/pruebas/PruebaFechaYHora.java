package ejercicios.actividad4.pruebas;

import ejercicios.actividad4.FechaYHora;

public class PruebaFechaYHora {

	public static void main(String[] args) {
		
		FechaYHora fechaHora = new FechaYHora(24,2,2014,9,46,15);
		
		System.out.println("Fecha y hora fechaHora: " + fechaHora);
		
		
		FechaYHora fechaHora2 = new FechaYHora(24,2,2014,23,46,15);
		
		System.out.println("Fecha y hora fechaHora2: " + fechaHora2);
		
		fechaHora2.siguienteHora();
		
		System.out.println("Fecha y hora fechaHora2 + 1 hora: " + fechaHora2);
		
		
		FechaYHora fechaHora3 = new FechaYHora(29,2,2012,23,20,25);
		
		System.out.println("Fecha y hora fechaHora3: " + fechaHora3);
		
		fechaHora3.siguienteHora();
		
		System.out.println("Fecha y hora fechaHora3 + 1 hora: " + fechaHora3);
		
		FechaYHora fechaHora4 = new FechaYHora(29,2,2012,10,20,25);
		
		System.out.println("Fecha y hora fechaHora4: " + fechaHora4);
		
		fechaHora4.siguienteHora();
		
		System.out.println("Fecha y hora fechaHora4 + 1 hora: " + fechaHora4);
		
		FechaYHora fechaHora5 = new FechaYHora(31,12,2014,23,10,35);
		
		System.out.println("Fecha y hora fechaHora5: " + fechaHora5);
		
		fechaHora5.siguienteHora();
		
		System.out.println("Fecha y hora fechaHora5 + 1 hora: " + fechaHora5);
		
		

	}

}
