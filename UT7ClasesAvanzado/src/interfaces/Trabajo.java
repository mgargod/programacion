package interfaces;

public class Trabajo implements Precio{
	
	private String tipo;
	private double horas;
	private double precioHora;
	public Trabajo(String tipo, double horas, double precioHora) {
		super();
		this.tipo = tipo;
		this.horas = horas;
		this.precioHora = precioHora;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	@Override
	public double getPrecio() {
		
		return horas*precioHora*recargo;
	}
	@Override
	public String toString() {
		return "Trabajo [tipo=" + tipo + ", horas=" + horas + ", precioHora="
				+ precioHora + "]";
	}	
	
}
