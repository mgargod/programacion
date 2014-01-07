package metodos;

//método que le pase como parámetro el número inicial y el final
//devuelve un valor aleatorio entre el número inicial y el final

public class Ejemplo3 {

	public static void main(String[] args) {
		
		int minimo, maximo;
		minimo = 10;
		maximo = 100;
		
		for(int i = 0; i<10000; ++i){
			int aleatorio = getAleatorio(minimo, maximo);
			if ( aleatorio < minimo || aleatorio > maximo )
				System.out.print("aleatorio() se ha ido de rango!!");
		}

	}
	
	public static int getAleatorio( int min, int max ) {
		
		int aleatorio =  (int)(Math.random() * ((max - min) + 1)) + min;
		
		return aleatorio; // "return" devuelve el valor y termina el método.
	}

}
