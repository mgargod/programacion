package ejerciciosString;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CifradoCesar {
	
	public static Scanner teclado;
	public static final String ABECEDARIO = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	
	/**
	 * METODO pedirFrase
	 * @return String (La frase introducida)
	 */
	
	public static String pedirFrase() {
		
		teclado = new Scanner(System.in);
		System.out.print("Introduzca la frase que desea codificar/decodificar: ");
		return teclado.nextLine();
		
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
			System.out.print("Introduzca desplazamiento para codificación/decodificación (número entero positivo): ");
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
	 * METODO codCesar (codifica un carácter con la codificación César)
	 * @param letra: char (un carácter alfabético)
	 * @param desplazamiento: int (el desplazamiento)
	 * @return char (el carácter codificado)
	 */
	
	public static char codCesar(char letra, int desplazamiento) {
		
		if(Character.isLowerCase(letra))
			return Character.toLowerCase(ABECEDARIO.charAt((ABECEDARIO.indexOf(Character.toUpperCase(letra))+desplazamiento)%ABECEDARIO.length()));
		else
			return ABECEDARIO.charAt((ABECEDARIO.indexOf(letra)+desplazamiento)%ABECEDARIO.length());		
	}
	
	/**
	 * METODO decodCesar (decodifica un carácter con la codificación César)
	 * @param letra: char (un carácter alfabético)
	 * @param desplazamiento: int (el desplazamiento)
	 * @return char (el carácter decodificado)
	 */
	
	public static char decodCesar(char letra, int desplazamiento) {
		
		if(Character.isLowerCase(letra))
			return Character.toLowerCase(ABECEDARIO.charAt((ABECEDARIO.indexOf(Character.toUpperCase(letra))-desplazamiento)%ABECEDARIO.length()));
		else
			return ABECEDARIO.charAt((ABECEDARIO.indexOf(letra)-desplazamiento)%ABECEDARIO.length());		
	}
	
	/**
	 * METODO codificarFraseCesar (codifica una frase con la codificación César)
	 */
	
	public static void codificarFraseCesar() {
		
		StringBuilder aux = new StringBuilder(pedirFrase());
		int desplazamiento = pedirDesplazamiento();
		for(int i=0; i<aux.length();++i){			
			if(Character.toString(aux.charAt(i)).matches("[A-Za-zÑñ]"))
				aux.setCharAt(i, codCesar(aux.charAt(i),desplazamiento));				
		}
		
		System.out.println("La frase codificada es: " + aux);
		
	}
	
	/**
	 * METODO decodificarFraseCesar (decodifica una frase con la codificación César)
	 */
	
	public static void decodificarFraseCesar() {
		
		StringBuilder aux = new StringBuilder(pedirFrase());
		int desplazamiento = pedirDesplazamiento();
		for(int i=0; i<aux.length();++i){			
			if(Character.toString(aux.charAt(i)).matches("[A-Za-zÑñ]"))
				aux.setCharAt(i, decodCesar(aux.charAt(i),desplazamiento));				
		}
		
		System.out.println("La frase decodificada es: " + aux);
		
	}

	public static void main(String[] args) {		
		
		Menu menu = new Menu();		
		boolean salir = false;
		
		try {
			
			menu.añadirOpcion("Codificar frase.");
			menu.añadirOpcion("Decodificar frase.");
			menu.añadirOpcion("Salir.");			

		} catch (MaxOpcionesSuperado e) {
			
			e.printStackTrace();
		}
		
		do {
			
			switch(menu.mostrarMenu("CODIGO CESAR")) {
				
				case 1: codificarFraseCesar();						
						break;				
				case 2: decodificarFraseCesar();						
						break;
				case 3: salir = true;						
			}			
			
		} while(!salir);		

	}

}
