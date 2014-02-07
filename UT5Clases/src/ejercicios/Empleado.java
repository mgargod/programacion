package ejercicios;

/*
 * Clase Empleado, tiene:
	// Atributos
	Nombre
	Apellido 1
	Apellido 2
	DNI
	SueldoBase
	
	// Constructores
	Empleado()
	Empleado(Nombre,Apellido1)
	
	// Métodos
	calculaSueldo(horasExtra, precioHora)
	  // sueldo = sueldoBase+horasExtra*precioHora;
 */

public class Empleado {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private double sueldoBase;
	private double sueldo;
	
	public Empleado () {
		
	}
	
	public Empleado ( String nombre, String apellido1 ) {
		
		setNombre(nombre);
		setApellido1(apellido1);
	}
	
	public double calculaSueldo( int horasExtra, double precioHora ) {		
		
		sueldo = getSueldoBase() + horasExtra * precioHora;		
		
		return sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public String toString() {
		
		return String.format("Nombre: %s\nApellido1: %s\nApellido2: %s\nDNI: %s\nSueldo Base: %.2f\nSueldo: %.2f\n",
								getNombre(), getApellido1(), getApellido2(), getDni(), getSueldoBase(), getSueldo());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
