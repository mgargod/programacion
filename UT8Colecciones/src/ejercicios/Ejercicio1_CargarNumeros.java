package ejercicios;

import java.util.*;


/*
 * 1.Crea una colecci�n de tipo ArrayList que cargue 10 n�meros por teclado. 
Despu�s recorrer� la colecci�n y devolver� la cantidad de n�meros positivos,
cero, y negativos.
 */

public class Ejercicio1_CargarNumeros {
	
	public static void imprimir( List<Integer> vector) {
		
		int cuentaPositivos = 0;
		int cuentaNegativos = 0;
		int cuentaCeros = 0;
		
		for(int i=0; i < vector.size(); ++i){			
			
			if(vector.get(i) > 0)
				++cuentaPositivos;
			else if(vector.get(i) < 0)
				++cuentaNegativos;
			else
				++cuentaCeros;
		}
		
		System.out.printf("N�mero de POSITIVOS: %d\nN�mero de NEGATIVOS: %d\nN�mero de CEROS: %d\n",
				          cuentaPositivos, cuentaNegativos, cuentaCeros);
		
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for(int i=0; i < 10; ++i){
			//Lo implemento sin controlar excepciones.
			System.out.print("Introduzca n�mero: ");
			numeros.add(teclado.nextInt());
		}
	
	imprimir(numeros);
		
		teclado.close();
	}

}
