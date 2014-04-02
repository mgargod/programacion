package ordenacionBusqueda;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejercicio 2. Escribe un programa que pida la estatura de una serie de alumnos, 
 * de tantos como indique el usuario del programa. Posteriormente, el programa ordenar� 
 * dichos datos de forma ascendente. Una vez ordenados, el programa visualizar� los datos * 
 * en el orden que se insertaron y ordenados de forma ascendente.
 * 
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		int numeroAlumnos;
		double[] estatura;
		double[] estaturaOrdenada;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("N�mero de alumnos: ");
		
		numeroAlumnos = teclado.nextInt();
		estatura = new double[numeroAlumnos];
		
		for(int i=0; i < estatura.length; ++i){
			
			System.out.printf("Estatura alumno n� %d: ", (i+1));
			estatura[i] = teclado.nextDouble();
		}
		
		Arrays.sort(estaturaOrdenada=Arrays.copyOf(estatura, estatura.length));
		
		
		System.out.printf("Estatura ordenada ascendente: %s\n",Arrays.toString(estaturaOrdenada));
		System.out.printf("Estatura por orden de inserci�n: %s\n",Arrays.toString(estatura));
		
		teclado.close();
		
		

	}

}

