package ejercicios.actividad2.pruebas_actividad2;

import ejercicios.actividad2.vehiculos.Consumo;

public class PruebaConsumo {

	public static void main(String[] args) {
		
		Consumo viaje1 = new Consumo(640,40,110,50);
		Consumo viaje2 = new Consumo();
		
		System.out.println("--- Viaje nº1 pasando datos al constructor ---");
		
		System.out.printf("Consumo medio (cada 100 km.): %.2f litros.\n", viaje1.consumoMedio());
		System.out.printf("Gasto medio (cada 100 km.): %.2f euros.\n", viaje1.consumoEuros());
		System.out.printf("Tiempo empleado: %.2f horas.\n", viaje1.getTiempo());
		
		System.out.println("--- Viaje nº2 constructor sin parámetros usando setters ---");
		viaje2.setKilometros(790);
		viaje2.setLitros(60);
		viaje2.setVmed(115);
		viaje2.setPgas(70);
		
		System.out.printf("Consumo medio (cada 100 km.): %.2f litros.\n", viaje2.consumoMedio());
		System.out.printf("Gasto medio (cada 100 km.): %.2f euros.\n", viaje2.consumoEuros());
		System.out.printf("Tiempo empleado: %.2f horas.\n", viaje2.getTiempo());
		
		
		
		
		

	}

}
