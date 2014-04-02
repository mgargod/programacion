package ejerciciosVectoresMatrices;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejercicio 4. Escribe un m�todo que se encargue de crear y cargar un vector 
 * con n�meros decimales (con datos que se insertan por el teclado). El m�todo devolver� dicho vector.
 */

public class Ejercicio4 {
	
	public static double[] cargarVector() {
		
		int numElementos = 0;
		double[] decimales;
		boolean valorErroneo = true;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.print("Introduzca el n�mero de decimales que desea almacenar: ");
			
			try {
				
				numElementos = teclado.nextInt();
				valorErroneo = false;
			
			} catch ( InputMismatchException ime ) {
				
				System.out.println("Debe introducir un n�mero entero. Int�ntelo de nuevo.");
				teclado.nextLine();
			}
			
		
		} while (valorErroneo);		
		
		decimales = new double[numElementos];
		
		for ( int i = 0; i < decimales.length; ++i ) {
			
			valorErroneo = true;
			
			do {
				
				System.out.print("Introduzca un n�mero decimal para ser almacenado: ");
				
				try {
					
					decimales[i] = teclado.nextDouble();
					valorErroneo = false;
					
				} catch (InputMismatchException ime) {
					
					System.out.println("Debe introducir un n�mero decimal. Int�ntelo de nuevo.");
					teclado.nextLine();
					
				}
				
			} while (valorErroneo);		
			
		}
		
		teclado.close();
		
		return decimales;	
		
	}

	public static void main(String[] args) {

		double[] miVectorDeDecimales = Ejercicio4.cargarVector();
		
		System.out.println("=========================\n" + "miVectorDeDecimales: " + Arrays.toString(miVectorDeDecimales));

	}

}
