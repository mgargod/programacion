package ejerciciosIniciales;


/*
 * Diseña una jerarquia de clases con la superclase Empleado, que incluye subclases para EmpleadoPorHoras y 
EmpleadoAsalariado. Los atributos que comparten son el nombre y ocupación del empleado, más los get/set 
apropiados para estos atributos. Los empleados asalariados tienen un salario semanal, y los métodos correspondientes get/set. 
El empleado por horas tiene un precio por hora y las horas trabajadas. Debe haber un método calculaSalarioSemanal que se 
puede aplicar a ambos.

 */

public class EmpleadoPorHoras extends Empleado {
	
	private int horas;
	private double precioHora;
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	
	public double calculaSalarioSemanal() {
		return this.precioHora * this.horas;
	}
	
	

}
