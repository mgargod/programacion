package ejercicios.actividad4.pruebas;

import ejercicios.actividad4.Hora2;

public class PruebaHora2 {

	public static void main(String[] args) {

		Hora2 mihora = new Hora2(23,59,59);
		System.out.println("Hora inicial: " + mihora);
		
		mihora.tick();
		System.out.println("Hora + 1 segundo: " + mihora);
		
		mihora.incrementarMinuto();
		System.out.println("Hora + 1 minuto: " + mihora);
		
		mihora.incrementarHora();
		System.out.println("Hora + 1 hora: " + mihora);
		
		
	

	}

}
