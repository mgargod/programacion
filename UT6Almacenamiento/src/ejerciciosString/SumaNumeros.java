package ejerciciosString;

import java.util.Scanner;

/*
 * Escribe un programa que encuentre los n�meros es una cadena y los sume. 
 * Por ejemplo, si le damos la cadena "en programaci�n 2 m�s 2 no son siempre 4, 
 * 24 de Abril de 2014." deber� devolver 2046.
 */

public class SumaNumeros {
	
	public static Scanner teclado;
	
	/**
	 * METODO pedirCadena
	 * @return String (La cadena introducida)
	 */
	
	public static String pedirCadena() {
		
		teclado = new Scanner(System.in);
		System.out.print("Introduzca cadena: ");
		String frase = teclado.nextLine();
		return frase;
		
	}
	
	
	/**
	 * METODO sumaNumerosCadena (suma los n�meros contenidos en una cadena)
	 * @param cadena: String
	 * @return int (la suma)
	 */
	
	public static int sumaNumerosCadena(String cadena) {
		String numero = "";
		int suma = 0;
		
		for(int i=0; i < cadena.length(); ++i){
			if(Character.toString(cadena.charAt(i)).matches("[0-9]")) {
				while(i < cadena.length() && Character.toString(cadena.charAt(i)).matches("[0-9]")) {
					numero+=cadena.charAt(i);
					++i;
				}
				
				suma+=Integer.parseInt(numero);
				numero = "";				
			}				
		}
		
		return suma;		
	}

	public static void main(String[] args) {

		String cadena = pedirCadena();
		int suma = sumaNumerosCadena(cadena);
		
		System.out.println("La suma de los n�meros contenidos en la cadena es: " + suma);
		

	}

}

