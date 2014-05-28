package interfaces.ejercicio1;

/*
 * Crear una interfaz llamada Persona, con los datos y métodos mínimos para las clases que la 
 * implementen, que serán:

    método: pedirDatos();
    método: visualizarDatos();
    dato: nombre de la empresa a la que pertenecen (con un valor asignado).

Crea dos clases, Cliente y Empleado que implementen la interfaz, añadiendo 
además los datos que estimes oportunos. Prueba a crear objetos Cliente y Empleado, 
dale valores y visualiza sus datos. Intenta también cambiar el nombre de la empresa (dato de la interfaz).
 */

public interface Persona {
	
	public void pedirDatos();
	public void visualizarDatos();
	public String nombreEmpresa = "SIEMENS";

}
