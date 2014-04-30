package ejerciciosString;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RotarCadena {
	
	public static Scanner teclado;
	public static String frase;
	
	/**
	 * METODO pedirFrase
	 * @return String (La frase introducida)
	 */
	
	public static String pedirFrase() {
		
		teclado = new Scanner(System.in);
		System.out.print("Introduzca la frase que desea rotar: ");
		frase = teclado.nextLine();
		return frase;
		
	}
	
	/**
	 * METODO pedirDesplazamiento 
	 * @return int (El número solicitado)
	 */
	
	public static int pedirDesplazamiento() {
		
		teclado = new Scanner(System.in);
		int desplazamiento = -1;
		String mensaje = "Debe introducir un número entero positivo.";
		boolean numeroIncorrecto;
		do {
			numeroIncorrecto = false;
			System.out.print("Introduzca desplazamiento para rotación: ");
			try {
				desplazamiento = teclado.nextInt();
				if(desplazamiento < 0) {
					System.out.println(mensaje);
					numeroIncorrecto = true;				
				}					
			} catch (InputMismatchException ime) {
				System.out.println(mensaje);
				teclado.nextLine();
				numeroIncorrecto = true;
			}			
		} while(numeroIncorrecto);

		return desplazamiento;
		
	}
	
	/**
	 * METODO rotarCadena (rota la cadena a la derecha el desplazamiento indicado y lo muestra)
	 * @param cadena: String
	 * @param desplazamiento: int
	 */
	
	public static void rotarCadena(String cadena, int desplazamiento) {
		
		StringBuilder aux = new StringBuilder(cadena);		
		
		String eliminado = aux.substring(frase.length()-(desplazamiento%frase.length()), frase.length());		
		aux.delete(frase.length()-(desplazamiento%frase.length()), frase.length());
		aux.insert(0, eliminado);		
		
		System.out.println("La frase rotada es: " + aux);
		
	}	


	public static void main(String[] args) {
		
		rotarCadena(pedirFrase(),pedirDesplazamiento());

	}

}
