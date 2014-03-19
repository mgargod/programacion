package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio5_Encriptacion {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		char[] caracteres;
		int[] valores;		
		
		System.out.print("Escriba una palabra para su encriptación [minúsculas y/o números]: ");
		caracteres = teclado.next().toCharArray();
		valores = new int[caracteres.length];
		
		for(int i = 0; i < caracteres.length; ++i) {
			
			if ( i < caracteres.length - 1) valores[i] = caracteres[i] + caracteres[i+1] + 3;		
				
			else valores[i] = caracteres[i] + 4 + 3;					
		}
		
		System.out.println("====== PALABRA ENCRIPTADA ======");
		
		for (int valor : valores) System.out.print((char)valor);
		
		teclado.close();

	}

}
