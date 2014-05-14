package ejerciciosHerencia2;

public class Aparato {
	
	private String numProducto;
	private String numSerie;
	private String nombre;
	private String sistemaOperativo;
	private double precioBase;
	
	public Aparato(){
		
	}
	
	public Aparato(String numProducto, String numSerie, String nombre,
			String sistemaOperativo, double precioBase) {

		this.numProducto = numProducto;
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.sistemaOperativo = sistemaOperativo;
		this.precioBase = precioBase;
	}

	public String getNumProducto() {
		return numProducto;
	}

	public void setNumProducto(String numProducto) {
		this.numProducto = numProducto;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public String toString(){
		return String.format("Nº producto: %s\nNº serie: %s\nNombre: %s\nSistema Operativo: %s\nPrecio Base: %.2f €.\n",
				              this.numProducto, this.numSerie, this.nombre, this.sistemaOperativo, this.precioBase);
	}
	
	public double precioPVP(){
		double precio = this.precioBase*1.10;
		precio*=1.21;
		return precio;
	}
	
	public double precioPVPRebajado(double rebaja){
		return this.precioPVP() - this.precioPVP()*rebaja/100;
	}	

}
