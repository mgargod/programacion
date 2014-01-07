package metodos;

import java.util.Scanner;

public class NumeroAleatorio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el tama�o del cuadrado: ");
		
		int tama�o = teclado.nextInt();
		
		teclado.close();
		
		for ( int i = 0; i < tama�o; ++i ) {
			
				lineaAleatorios(tama�o);
				
		}		

	}
	
	public static void lineaAleatorios(int tam) {
		
		for ( int i = 0; i < tam; ++i ) {
			
			numeroAleatorio();
		}
		
		System.out.println();
	}
	
	public static void numeroAleatorio() {
		
		int aleatorio = (int)(Math.random()*10);
		
		System.out.print(aleatorio);
	}

}
