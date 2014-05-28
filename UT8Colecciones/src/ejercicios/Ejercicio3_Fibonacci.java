package ejercicios;

/*
 * 3.Crea una colecci�n con los primeros X n�meros de la serie Fibonacci, donde
X es un n�mero que pedir�s al usuario. Despu�s pregunta n�meros y di si est�
o no en la colecci�n. El programa terminar� cuando el usuario introduzca un
0.
 */

import java.util.*;

public class Ejercicio3_Fibonacci {

	public static void main(String[] args) {

		int numero;
		int numero2;
		boolean primerNumero;
				
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("�Cu�ntos n�meros de la serie de Fibonacci? ");
		numero = teclado.nextInt();
		
		ArrayList<Integer> serie = new ArrayList<Integer>();
		
		serie.add(1);
		serie.add(1);
		
		for(int i=2; i<numero; ++i)
			serie.add(serie.get(i-2) + serie.get(i-1));	
		
		System.out.println("Serie Fibonacci generada: ");
	
		for (int i=0; i<numero; ++i)
			System.out.print(serie.get(i) + " ");		
		
		boolean condicion;
		
		do {
			
			condicion = true;
			
			String mensaje = "NO EST�";
			
			System.out.print("\nIntroduzca un n�mero: ");
			numero2 = teclado.nextInt();
			
			if ( numero2 == 0 )				
				condicion = false;	
			
			if(serie.contains(numero2))
				mensaje = "EST�";			
			
			System.out.println("El n�mero " + numero2 + " " + mensaje + " en la serie dada.");
			
		} while ( condicion );
		
		System.out.println("Gracias por utilizar esta maravillosa aplicaci�n.");
		
		teclado.close();
	}
}


