package ejerciciosArrays;

import java.util.Scanner;

public class Decodificador {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		char[] caracteres;
		int[] valores;		
		
		System.out.print("Escriba una palabra para su decodificación [minúsculas y/o números]: ");
		caracteres = teclado.next().toCharArray();
		valores = new int[caracteres.length];
		
		
		//Decodificador//------------------------
		
		for(int i = caracteres.length - 1 ; i >= 0; --i) {			
			
			if ( i == caracteres.length - 1 ) valores[i] = caracteres[i] - 7;		
				
			else valores[i] = caracteres[i] - 3;					
		}
		
		for(int i = caracteres.length - 2 ; i >= 0; --i) {			
			
			valores[i] = valores[i] - caracteres[i + 1];					
		}
		
		System.out.println("====== PALABRA DECODIFICADA ======");
		
		for (int valor : valores) System.out.print((char)valor);
		
		teclado.close();
		
		

	}

}

