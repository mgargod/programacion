package ejerciciosString;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CifradoCesar {
	
	public static Scanner teclado;
	public static final String ABECEDARIO = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ";
	
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
	 * @return int (El n�mero solicitado)
	 */
	
	public static int pedirDesplazamiento() {
		
		teclado = new Scanner(System.in);
		int desplazamiento = -1;
		String mensaje = "Debe introducir un n�mero entero positivo.";
		boolean numeroIncorrecto;
		do {
			numeroIncorrecto = false;
			System.out.print("Introduzca desplazamiento para codificaci�n/decodificaci�n (n�mero entero positivo): ");
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
	 * METODO codCesar (codifica un car�cter con la codificaci�n C�sar)
	 * @param letra: char (un car�cter alfab�tico)
	 * @param desplazamiento: int (el desplazamiento)
	 * @return char (el car�cter codificado)
	 */
	
	public static char codCesar(char letra, int desplazamiento) {
		
		if(Character.isLowerCase(letra))
			return Character.toLowerCase(ABECEDARIO.charAt((ABECEDARIO.indexOf(Character.toUpperCase(letra))+desplazamiento)%ABECEDARIO.length()));
		else
			return ABECEDARIO.charAt((ABECEDARIO.indexOf(letra)+desplazamiento)%ABECEDARIO.length());		
	}
	
	/**
	 * METODO decodCesar (decodifica un car�cter con la codificaci�n C�sar)
	 * @param letra: char (un car�cter alfab�tico)
	 * @param desplazamiento: int (el desplazamiento)
	 * @return char (el car�cter decodificado)
	 */
	
	public static char decodCesar(char letra, int desplazamiento) {
		
		if(Character.isLowerCase(letra))
			return Character.toLowerCase(ABECEDARIO.charAt((ABECEDARIO.indexOf(Character.toUpperCase(letra))-desplazamiento)%ABECEDARIO.length()));
		else
			return ABECEDARIO.charAt((ABECEDARIO.indexOf(letra)-desplazamiento)%ABECEDARIO.length());		
	}
	
	/**
	 * METODO codificarFraseCesar (codifica una frase con la codificaci�n C�sar)
	 */
	
	public static void codificarFraseCesar() {
		
		StringBuilder aux = new StringBuilder(pedirFrase());
		int desplazamiento = pedirDesplazamiento();
		for(int i=0; i<aux.length();++i){			
			if(Character.toString(aux.charAt(i)).matches("[A-Za-z��]"))
				aux.setCharAt(i, codCesar(aux.charAt(i),desplazamiento));				
		}
		
		System.out.println("La frase codificada es: " + aux);
		
	}
	
	/**
	 * METODO decodificarFraseCesar (decodifica una frase con la codificaci�n C�sar)
	 */
	
	public static void decodificarFraseCesar() {
		
		StringBuilder aux = new StringBuilder(pedirFrase());
		int desplazamiento = pedirDesplazamiento();
		for(int i=0; i<aux.length();++i){			
			if(Character.toString(aux.charAt(i)).matches("[A-Za-z��]"))
				aux.setCharAt(i, decodCesar(aux.charAt(i),desplazamiento));				
		}
		
		System.out.println("La frase decodificada es: " + aux);
		
	}

	public static void main(String[] args) {		
		
		Menu menu = new Menu();		
		boolean salir = false;
		
		try {
			
			menu.a�adirOpcion("Codificar frase.");
			menu.a�adirOpcion("Decodificar frase.");
			menu.a�adirOpcion("Salir.");			

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
