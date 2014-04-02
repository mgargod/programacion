package ejerciciosVectoresMatrices;

/*
 * Ejercicio 9. Necesitamos crear una matriz unitaria de orden 8. 
 * Crea un método que lo haga. Una matriz unitaria es aquella que 
 * tiene todos sus componentes a 0, excepto las de la diagonal principal, que están a 1.
 * 
 */

public class Ejercicio9 {
	
	public static int[][] matrizUnitaria( int orden ) {
		
		int[][] matrizUnitaria = new int[orden][orden];
		
		for ( int i = 0; i < matrizUnitaria.length; ++i ) {
			
			for ( int j = 0; j < matrizUnitaria[i].length; ++j ) {
				
				if ( j == i ) matrizUnitaria[i][j] = 1;
				else matrizUnitaria[i][j] = 0; //aunque por defecto ya son ceros, los ponenos nosotros.
			}			
		}
		
		return matrizUnitaria;
	}
	
	public static void visualizar(int[][] matriz){
		
		for( int[] fila : matriz ) {
			System.out.print("[ ");
			for ( int elemento : fila ) {
				
				System.out.print(elemento);
				System.out.print(" ");
			}
			System.out.println("]");
		}
	}

	public static void main(String[] args) {
		
		int[][] miMatriz = matrizUnitaria(10);
		
		visualizar(miMatriz);		

	}

}

