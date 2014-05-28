package interfaces.ejercicio1;

import java.util.Scanner;

public class Empleado implements Persona{

	private String nombre;
	private String apellidos;
	private String NIF;
	private String departamento;

	@Override
	public void pedirDatos() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Solicitando datos de EMPLEADO: ");
		System.out.print("Introduzca nombre: ");
		this.nombre = teclado.nextLine();		
		System.out.print("Introduzca apellidos: ");
		this.apellidos = teclado.nextLine();
		System.out.print("Introduzca NIF: ");
		this.NIF = teclado.nextLine();		
		System.out.print("Introduzca departamento: ");
		this.departamento = teclado.nextLine();		
	}

	@Override
	public void visualizarDatos() {
		System.out.println("===== DATOS DEL EMPLEADO =====");
		System.out.printf("Nombre: %s\nApellidos: %s\nNIF: %s\nDepartamento: %s\nEmpresa: %s\n",
				           this.nombre, this.apellidos, this.NIF, this.departamento,this.nombreEmpresa);
		
	}

}
