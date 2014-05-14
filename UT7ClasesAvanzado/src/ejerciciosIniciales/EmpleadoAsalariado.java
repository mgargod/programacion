package ejerciciosIniciales;

/*
 * Dise�a una jerarquia de clases con la superclase Empleado, que incluye subclases para EmpleadoPorHoras y 
EmpleadoAsalariado. Los atributos que comparten son el nombre y ocupaci�n del empleado, m�s los get/set 
apropiados para estos atributos. Los empleados asalariados tienen un salario semanal, y los m�todos 
correspondientes get/set. 
El empleado por horas tiene un precio por hora y las horas trabajadas. Debe haber un m�todo 
calculaSalarioSemanal que se puede aplicar a ambos.

 */

public class EmpleadoAsalariado extends Empleado {
	
	private double sueldo;

	public double getSalarioSemanal() {
		return sueldo;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.sueldo = salarioSemanal;
	}
	
	public double calculaSalarioSemanal() {
		return this.sueldo;
	}	

}
