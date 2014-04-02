package ejerciciosVectoresMatrices;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejercicio 4. Escribe un método que se encargue de crear y cargar un vector 
 * con números decimales (con datos que se insertan por el teclado). El método devolverá dicho vector.
 */

public class Ejercicio4 {
	
	public static double[] cargarVector() {
		
		int numElementos = 0;
		double[] decimales;
		boolean valorErroneo = true;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.print("Introduzca el número de decimales que desea almacenar: ");
			
			try {
				
				numElementos = teclado.nextInt();
				valorErroneo = false;
			
			} catch ( InputMismatchException ime ) {
				
				System.out.println("Debe introducir un número entero. Inténtelo de nuevo.");
				teclado.nextLine();
			}
			
		
		} while (valorErroneo);		
		
		decimales = new double[numElementos];
		
		for ( int i = 0; i < decimales.length; ++i ) {
			
			valorErroneo = true;
			
			do {
				
				System.out.print("Introduzca un número decimal para ser almacenado: ");
				
				try {
					
					decimales[i] = teclado.nextDouble();
					valorErroneo = false;
					
				} catch (InputMismatchException ime) {
					
					System.out.println("Debe introducir un número decimal. Inténtelo de nuevo.");
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
