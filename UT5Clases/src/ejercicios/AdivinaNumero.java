package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		Oculto numeroSecreto = new Oculto();
		int minimo = 0;
		int maximo = 0;
		boolean continuar = true;
		int numUsuario = 0;
		int intentos = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("BIENVENIDO A -- ADIVINA EL N�MERO -- ");
		
		do {
		
			System.out.print("�Desea introducir los valores m�nimo y m�ximo? [s/n]: ");
			
			String respuesta = teclado.next();
			
			if(respuesta.equalsIgnoreCase("n")) {
				
				System.out.println("El n�mero secreto est� entre 1 y 100 (ambos inclusive)");
				numeroSecreto = new Oculto();
				continuar = false;
			}
			
			else if (respuesta.equalsIgnoreCase("s")) {
				
				continuar = true;
				
				do {
				
					System.out.print("Introduzca valores m�nimo y m�ximo: ");					
					
					try {
						minimo = teclado.nextInt();
						maximo = teclado.nextInt();
						continuar = false;
					} catch ( InputMismatchException ime ) {
						
						teclado.nextLine();						
						System.out.println("ERROR. Debe introducir n�meros enteros. Int�ntelo de nuevo.");
					}
				
				} while ( continuar );				
				
				
				System.out.printf("El n�mero secreto est� entre %d y %d (ambos inclusive)\n",
						          minimo, maximo);
				
				numeroSecreto = new Oculto(minimo, maximo);
				continuar = false;				
			}
			
			else {
				
				System.out.println("Debe introducir \"s\" o \"n\"");				
			}
		
		} while (continuar);
		
		System.out.println("------COMIENZA EL JUEGO-----");
		
		continuar = true;
		
		do {
			
			do {				
			
				System.out.print("Adivine el n�mero: ");
				
				try {
					
					numUsuario = teclado.nextInt();
					continuar = false;
					
				} catch ( InputMismatchException ime ) {
					
					teclado.nextLine();						
					System.out.println("ERROR. Debe introducir n�meros enteros. Int�ntelo de nuevo.");
				}				
			
			} while (continuar);
			
			continuar = true;
			
			intentos++;
			
			switch(numeroSecreto.pruebaNumero(numUsuario)) {
				
			case -1:
				System.out.println("ES MAYOR");
				break;
			case 1:
				System.out.println("ES MENOR");
				break;
			case 0:
				System.out.printf("�Enhorabuena! Ha acertado el n�mero, que era el %d, en %d intentos.", 
								  numeroSecreto.getOculto(), intentos);
				continuar = false;
				break;
			}
			
		} while ( continuar );
		
		teclado.close();

	}

}
