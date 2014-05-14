package ejerciciosHerencia2;

public class Tableta extends Aparato {
	
	private double pulgadas;
	private double peso;

	public Tableta() {
		
	}

	public Tableta(String numProducto, String numSerie, String nombre,
			String sistemaOperativo, double precioBase, double pulgadas, double peso) {
		super(numProducto, numSerie, nombre, sistemaOperativo, precioBase);
		this.pulgadas = pulgadas;
		this.peso = peso;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String toString(){
		return String.format("%sPulgadas: %.2f\"\nPeso: %.2f gr.", super.toString(), this.pulgadas, this.peso);
	}

}
