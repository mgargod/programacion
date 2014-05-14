package ejemplos;

public class Jefe extends Empleado {
	
	private double complemento;
	private String departamento;

	public Jefe(String nombre, double sueldo, double complemento, String departamento) {
		super(nombre, sueldo);
		this.complemento = complemento;
		this.departamento = departamento;
		
	}
	
	public double getSueldo() {
		double sueldo_total;
		sueldo_total = super.getSueldo() + this.complemento;
		return sueldo_total;
	}

}
