package ejercicios;

import java.util.*;


/*
 * 1.Crea una colección de tipo ArrayList que cargue 10 números por teclado. 
Después recorrerá la colección y devolverá la cantidad de números positivos,
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
		
		System.out.printf("Número de POSITIVOS: %d\nNúmero de NEGATIVOS: %d\nNúmero de CEROS: %d\n",
				          cuentaPositivos, cuentaNegativos, cuentaCeros);
		
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for(int i=0; i < 10; ++i){
			//Lo implemento sin controlar excepciones.
			System.out.print("Introduzca número: ");
			numeros.add(teclado.nextInt());
		}
	
	imprimir(numeros);
		
		teclado.close();
	}

}
