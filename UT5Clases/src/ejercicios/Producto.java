package ejercicios;

public class Producto {
	
	private int codigo;
	private double precio;
	private int descuento;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	public double getPrecioTotal() {
		
		return (getPrecio() - getPrecio() * (double)getDescuento() / 100);
	}
	
	public double getPrecioTotal( double nuevoPrecio ) {
		
		return (nuevoPrecio - nuevoPrecio * (double)getDescuento() / 100);
	}
	
	

}
