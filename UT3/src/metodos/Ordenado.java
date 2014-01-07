package metodos;

public class Ordenado {
	
	public static boolean ordenado( int[] vector ) {
		
		boolean ordenado = false;		
		
		for ( int i = 1; i < vector.length; ++i ) {
			
			ordenado = false;
			
			if ( vector[i] > vector[i-1] )
				ordenado = true;
			
			else 
				i = vector.length;
		}
		
		return ordenado;
	}
	
	public static void main(String[] args) {

		int[] vectorPrueba1 = {1,2,3,4,3,7};
		int[] vectorPrueba2 = {1,2,3,4,6,5};
		boolean estaOrdenado;
		
		estaOrdenado = ordenado( vectorPrueba1 );
		System.out.println("El vector 1 está ordenado: " + estaOrdenado );
		estaOrdenado = ordenado( vectorPrueba2 );
		System.out.println("El vector 2 está ordenado: " + estaOrdenado );
	}

}
