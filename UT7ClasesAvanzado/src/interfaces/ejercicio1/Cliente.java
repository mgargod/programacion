package interfaces.ejercicio1;

import java.util.Scanner;

public class Cliente implements Persona {
	
	private String nombre;
	private String apellidos;
	private String NIF;

	@Override
	public void pedirDatos() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Solicitando datos de CLIENTE: ");
		System.out.print("Introduzca nombre: ");
		this.nombre = teclado.nextLine();		
		System.out.print("Introduzca apellidos: ");
		this.apellidos = teclado.nextLine();
		System.out.print("Introduzca NIF: ");
		this.NIF = teclado.nextLine();		
	}

	@Override
	public void visualizarDatos() {
		System.out.println("===== DATOS DEL CLIENTE =====");
		System.out.printf("Nombre: %s\nApellidos: %s\nNIF: %s\nEmpresa: %s\n",
				           this.nombre, this.apellidos, this.NIF, nombreEmpresa);
		
	}

}
