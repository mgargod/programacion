package ejercicios.actividad2.vehiculos;

public class Coche {
	
	private String marca;
	private String modelo;
	
	public Coche(){
		
		setMarca("Marca por defecto");
		setModelo("Modelo por defecto");
		
	}
	
	public Coche ( String marca, String modelo ) {
		
		setMarca(marca);
		setModelo(modelo);
	}
	
	public String toString(){
		
		return String.format("Marca: %s\nModelo: %s\n", getMarca(), getModelo());
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
