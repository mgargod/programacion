package ejercicios;

public class PruebaCoche {

	public static void main(String[] args) {

		Coche coche1 = new Coche();
		
		System.out.println("Velocidad inicial: " + coche1.getVelocidad() + " km/h.\n...acelerando...");
		
		coche1.acelera(50);
		
		System.out.println("Velocidad después de acelerar: " + coche1.getVelocidad() + " km/h.");

	}

}
