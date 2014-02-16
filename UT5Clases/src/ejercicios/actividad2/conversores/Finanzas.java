package ejercicios.actividad2.conversores;

public class Finanzas {
	
	private double cambioDolarEuro = 0;
	
	public Finanzas() {
		
		setCambioDolarEuro(1.36);
	}
	
	public Finanzas( double cambioDolarEuro ) {
		
		setCambioDolarEuro(cambioDolarEuro);
	}
	
	public double dolaresToEuros( double dolares ) {
		
		return dolares / cambioDolarEuro;
	}
	
	public double eurosToDolares( double euros ) {
		
		return euros * cambioDolarEuro;
	}

	public double getCambioDolarEuro() {
		return cambioDolarEuro;
	}

	public void setCambioDolarEuro(double cambioDolarEuro) {
		this.cambioDolarEuro = cambioDolarEuro;
	}
	

}
