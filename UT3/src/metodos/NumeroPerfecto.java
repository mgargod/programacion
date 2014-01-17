package metodos;

public class NumeroPerfecto {
	
	public static boolean numeroPerfecto ( int numero ) {
		
		boolean esNumeroPerfecto = false;
		int numFactores = 0;
		
		for ( int i = 1; i < numero; ++i ) {
			
			if ( numero % i == 0 ) 
				++numFactores;
		}
		
		int[] factores = new int[numFactores];
		
		int j = 0;
		
		for ( int i = 1; i < numero; ++i ) {
			
			if ( numero % i == 0 ) {
				factores[j] = i;				
				++j;
			}
		}
		
		int suma = 0;	
		
		for ( int i = 0; i < factores.length; ++i ) {
			
			suma += factores[i];
		}
		
		if ( suma == numero ) {
			esNumeroPerfecto = true;
			System.out.print("Factores: suma de ( ");
			for ( int i = 0; i < factores.length; ++i ) {
				
				System.out.print(factores[i] + " ");
			}
		}
		
		return esNumeroPerfecto;		
	}
	public static void main(String[] args) {

		int numero = 10000;
		for ( int i = 1; i <= numero; ++i ) {
			
			if (numeroPerfecto(i))
				System.out.print(") = " + i + "\n");
		}
	}
}
