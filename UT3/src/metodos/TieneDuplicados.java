package metodos;

public class TieneDuplicados {
	
	public static boolean tieneDuplicados ( String[] vector ) {
		
		boolean tieneDuplicados = false;
		
		for ( int i = 1; i < vector.length; ++i ) {
			
			for ( int j = 0; j < i; ++j ) {
				
				if ( vector[j].equals(vector[i]) ) {
					
					tieneDuplicados = true;
					j = i;
					i = vector.length;
				}
			}				
		}
		
		
		return tieneDuplicados;
	}

	public static void main(String[] args) {

		String[] vectorPrueba1 = {"hola", "adios", "perfecto"};
		String[] vectorPrueba2 = {"hola", "adios", "hola"};		
		boolean tieneDuplicados;
		
		tieneDuplicados = tieneDuplicados(vectorPrueba1);
		System.out.println("¿Tiene duplicados vector 1? " + tieneDuplicados);
		tieneDuplicados = tieneDuplicados(vectorPrueba2);
		System.out.println("¿Tiene duplicados vector 2? " + tieneDuplicados);
		
		

	}

}
