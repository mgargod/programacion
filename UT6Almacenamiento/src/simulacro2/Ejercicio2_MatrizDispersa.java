package simulacro2;

import java.util.Arrays;

public class Ejercicio2_MatrizDispersa {
	
	public static double[][] dispersa( int orden, double porcentaje ) {
		
		double[][] dispersa = new double[orden][orden];
		int numDistintosCero = (int)(orden*orden*porcentaje/100);
		int fila;
		int columna;
		
		for (int i=0; i < dispersa.length; ++i) {
			dispersa[i][i] = 0.0;
		}
		
		while (numDistintosCero > 0){
			
			if (dispersa[fila=(int)(Math.random()*orden)][columna=(int)(Math.random()*orden)] == 0.0) {
				
				dispersa[fila][columna] = Math.random();
				--numDistintosCero;
			}							
		}		
		
		return dispersa;
	}

	public static void main(String[] args) {

		double[][] matriz;
		matriz = dispersa(4,10);
		
		for ( double[] fila : matriz )
			System.out.println(Arrays.toString(fila));		

	}

}
