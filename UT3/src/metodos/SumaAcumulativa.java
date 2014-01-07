package metodos;

public class SumaAcumulativa {
	
	public static int[] vectorSumAcum ( int[] vector ) {		
				
		for ( int i = 1; i < vector.length; ++i ) {
			
			vector[i] += vector[i-1];			
		}		
		
		return vector; 
	}

	public static void main(String[] args) {

		int[] vector1 = {1,2,3,4,5};
		
		int[] vectorSumAcum = vectorSumAcum( vector1 );
		
		System.out.print("Vector Suma Acumulativa: ");
		
		for ( int i = 0; i < vectorSumAcum.length; ++i ) {
			
			System.out.print( vectorSumAcum[i] + " ");
		}

	}

}
