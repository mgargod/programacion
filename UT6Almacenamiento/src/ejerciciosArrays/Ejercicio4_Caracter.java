package ejerciciosArrays;

import java.util.Scanner;

/*
 * Ejercicio 4. Realiza un programa que pida al usuario la introducción 
 * de un carácter hasta que este pulse el carácter @. 
 * El programa debe mostrar las veces que se ha escrito cada carácter. 
 * Recordad que los caracteres tienen asociado un número (código) que comienza por cero. 
 * Ten en cuenta que se pueden hacer cosas como esta:

int c;
String qp="qp";
c=qp.charAt(0);
System.out.println(c);

Este programa imprimiría "113", el código de q. Si quisiera imprimir un número también puedo hacerlo así:

System.out.println((char)65);

Utiliza arrays para hacer el ejercicio.
 */

public class Ejercicio4_Caracter {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[] numCaracter = new int[20];
		int buscado = "@".charAt(0);
		int limite = 0;
		boolean repetido;
		int[] contador;
		
		for(int i = 0; i < numCaracter.length; ++i) {	
			
			System.out.print("Escriba un caracter [ pulse '@' para terminar ]: ");
			numCaracter[i] = teclado.next().charAt(0);
			if(numCaracter[i] == buscado && i != 0) {
				limite = i;
				i = numCaracter.length;		
				
			} else if(numCaracter[i] == buscado && i == 0) {
				System.out.println("No ha escrito ningún caracter.");
				System.exit(-1);
			}
			
		}
		
		contador = new int[limite];
		
		for (int i=0; i < limite; ++i) {
			
			contador[i] = 0;

			for (int j=0; j < limite; ++j) {
				
				if(numCaracter[i] == numCaracter[j]) contador[i]++;
			}
					
		}
		
		System.out.println("====== RESULTADOS =====");
		
		System.out.printf("El caracter \"%s\" se ha escrito %d %s.\n",
				(char)numCaracter[0], contador[0], contador[0] > 1 ? "veces" : "vez");		
		
		for(int i=1;i<limite;++i){
			
			repetido = false;
			
			for(int j=0;j<i;++j)
				if(numCaracter[j] == numCaracter[i]) repetido = true; 
			
			if(!repetido) System.out.printf("El caracter \"%s\" se ha escrito %d %s.\n",
					(char)numCaracter[i], contador[i], contador[i] > 1 ? "veces" : "vez");			
			
		}
		
		teclado.close();

	}

}
