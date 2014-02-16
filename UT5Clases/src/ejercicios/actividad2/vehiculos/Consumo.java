package ejercicios.actividad2.vehiculos;

/*
 * Ejercicio 7. Implementa una clase Consumo, la cual forma parte de la centralita 
 * electr�nica de un coche y tiene las siguientes caracter�sticas:

    Atributos:
        kms. Kil�metros recorridos por el coche.
        litros. Litros de combustible consumido.
        vmed. Velocidad media.
        pgas. Precio de la gasolina.

    M�todos:
        getTiempo. Indicar� el tiempo empleado en realizar el viaje.
        consumoMedio. Consumo medio del veh�culo (en litros cada 100 kil�metros).
        consumoEuros. Consumo medio del veh�culo (en euros cada 100 kil�metros).
        setKms
        setLitros
        setVmed
        setPgas
 */

public class Consumo {
	
	private int kilometros;
	private int litros;
	private double vmed;
	private double pgas;
	
	public Consumo () {
		
		this.kilometros = 0;
		this.litros = 0;
		this.vmed = 0;
		this.pgas = 0;
	}
	
	public Consumo ( int kms, int litros, double vmed, double pgas ) {
		
		this.kilometros = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
	}
	
	public double getTiempo() {
		
		return (double)kilometros / vmed;
	}
	
	public double consumoMedio() {
		
		return (double)litros / kilometros * 100;
	}
	
	public double consumoEuros() {
		
		return pgas / kilometros * 100;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public void setVmed(double vmed) {
		this.vmed = vmed;
	}

	public void setPgas(double pgas) {
		this.pgas = pgas;
	}
	
	

}
