package ejerciciosVectoresMatrices;

import java.util.Arrays;

/*
 * Ejercicio 2. Declara y crea un tipo de variable que sea capaz de contener la nota que 
 * han obtenido 4 alumnos en los diferentes módulos en los que están matriculados. 
 * Sabemos que el primer alumno está matriculado en 4 módulos; el segundo, en 7 módulos; 
 * el tercero, en 3 módulos, y el cuarto, en 2 módulos.
 * 
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		double[][] notasAlumnos = new double[4][];
		
		notasAlumnos[0] = new double[4];
		notasAlumnos[1] = new double[7];
		notasAlumnos[2] = new double[3];
		notasAlumnos[3] = new double[2];
		
		
		//PARA QUE SALGA IMPRESA LA INFORMACION PODEMOS PONER
		
		for ( double[] notas : notasAlumnos )
		
			System.out.println(Arrays.toString(notas));
		
			/*
			
			[0.0, 0.0, 0.0, 0.0]
			[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
			[0.0, 0.0, 0.0]
			[0.0, 0.0]
			
			*/		

	}

}

