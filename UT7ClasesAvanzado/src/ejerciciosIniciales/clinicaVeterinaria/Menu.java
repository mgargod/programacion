package ejerciciosIniciales.clinicaVeterinaria;

import java.util.InputMismatchException;
import java.util.Scanner;

class MaxOpcionesSuperado extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1522015024413485906L;

	public MaxOpcionesSuperado() {
		// TODO Auto-generated constructor stub
	}

	public MaxOpcionesSuperado(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MaxOpcionesSuperado(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MaxOpcionesSuperado(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public MaxOpcionesSuperado(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}

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
	
	public void añadirOpcion ( String opcion ) throws MaxOpcionesSuperado {
		
		if (this.numOpciones < MAX_OPCIONES) {			
			this.opciones[this.numOpciones] = opcion;
			this.numOpciones++;			
		} else
			throw new MaxOpcionesSuperado("Máximo de opciones ("+ this.MAX_OPCIONES + ") superado.");
		
	}
	
	public void eliminarOpcion ( int posicion ) {
		
		if(this.numOpciones == 0) {
			System.out.println("No hay opciones para eliminar.");
			System.exit(0);
		} else {
			if(posicion >= this.numOpciones) {
				System.out.println("No hay opciones que eliminar en la posición elegida.");
				System.exit(0);
			}
			this.opciones[posicion] = null;
			for (int i = posicion; i < this.opciones.length - 1; ++i ) {
				this.opciones[i] = this.opciones[i+1];			
			}
			this.numOpciones--;
		}	

	}
	
	public int mostrarMenu( String cabecera ) {	
		
		if(this.numOpciones == 0) {
			System.out.println("No hay opciones que mostrar.");
			System.exit(0);
		} else {
			
			System.out.println("====== " + cabecera + " ======");
			for(int i = 0; i < numOpciones; ++i) {
				System.out.println((i + 1) + ". " + this.opciones[i]);
			}
			
		}		
		
		return this.opcionElegida();		
	}
	
	private int opcionElegida() {
		
		int elegida = 0;
		boolean valido;
		do {
			valido = true;
			
			Scanner teclado = new Scanner(System.in);
			System.out.print("----> Elija una opción: ");
			try {
				elegida = teclado.nextInt();
				if(elegida <= 0 || elegida > this.opciones.length) {
					System.out.println("La opción no existe.");
					valido = false;					
				} else {
					if(this.opciones[elegida-1] == null || elegida > this.opciones.length) {
						System.out.println("La opción no existe.");
						valido = false;				
					} else 				
						System.out.println("Ha elegido la opción \"" + this.opciones[elegida - 1] + "\"");					
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Debe introducir una opción válida.");
				valido = false;
			}
			
		} while (!valido);
				
		return elegida;		
	}

}

