package ejercicios;

import java.util.Scanner;

public class Menu {
	
	private String[] opciones;
	private int numOpciones;
	private final int MAX_OPCIONES = 10;
	
	public Menu() {
		
		this.opciones = new String[this.MAX_OPCIONES];
		this.numOpciones = 0;
	}
	
	public Menu ( String[] opciones ) {
		
		this.opciones = opciones;
		this.numOpciones = opciones.length;
	}
	
	public void añadirOpcion ( String opcion ) {
		
		this.opciones[this.numOpciones] = opcion;
		this.numOpciones++;
	}
	
	public void eliminarOpcion ( int posicion ) {
		
		this.opciones[posicion] = null;
		for (int i = posicion; i < this.opciones.length - 1; ++i ) {
			this.opciones[i] = this.opciones[i+1];			
		}
		this.numOpciones--;
	}
	
	public int mostrarMenu( String cabecera ) {		
		
		System.out.println("====== " + cabecera + " ======");
		for(int i = 0; i < numOpciones; ++i) {
			System.out.println((i + 1) + ". " + this.opciones[i]);
		}
		
		return this.opcionElegida();
		
	}
	
	private int opcionElegida() {
		
		int elegida = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("----> Elija una opción: ");
		elegida = teclado.nextInt();
		System.out.println("Ha elegido la opción \"" + this.opciones[elegida - 1] + "\"");		
		return elegida - 1;		
	}

	public static void main(String[] args) {

		Menu menu = new Menu();
		menu.añadirOpcion("Abrir archivo");
		menu.añadirOpcion("Copiar archivo");
		menu.añadirOpcion("Buscar");
		menu.añadirOpcion("Salir");
		
		int elegida = menu.mostrarMenu("MI PRIMER MENU");
		System.out.println("Posición del menú elegida: " + elegida);
		
		menu.eliminarOpcion(0);
		
		elegida = menu.mostrarMenu("MI SEGUNDO MENU");		
		System.out.println("Posición del menú elegida: " + elegida);

	}

}
