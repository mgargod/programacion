package ejerciciosVectoresMatrices;

/*
 * Ejercicio 8. Escribe un método que reciba una matriz de caracteres con el fin de visualizar su contenido.
 * 
 */
public class Ejercicio8 {
	
	public static void visualizar(char[][] matriz){
		
		for( char[] fila : matriz ) {
			System.out.print("[ ");
			for ( char caracter : fila ) {
				
				System.out.print(caracter);
				System.out.print(" ");
			}
			System.out.println("]");
		}
	}

	public static void main(String[] args) {

		char[][] caracteres = {{'a','b'},{'c','d','e'},{'f','g','@','*'}};
		
		visualizar(caracteres);

	}

}

