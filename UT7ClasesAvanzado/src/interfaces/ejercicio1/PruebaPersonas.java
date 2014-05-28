package interfaces.ejercicio1;

public class PruebaPersonas {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Empleado empleado = new Empleado();
		
		cliente.pedirDatos();
		cliente.visualizarDatos();
		empleado.pedirDatos();
		empleado.visualizarDatos();		

	}

}
