package ejercicios2;

import java.util.*;

/*
 * La llamada Paradoja del Cumplea�os consiste en que:

   Si hay 23 pesonas en una clase, �cu�l es la probabilidad de que algunas personas 
   cumplan a�os el mismo d�a?.

   Estima la probabilidad generando ejemplos aleatorios de 23 cumplea�os y 
   comprobando si coinciden (utiliza la funci�n del ejercicio anterior).

 */

public class Ejercicio5_Paradoja {
	
	public static double probabilidadCumple(int cantidad){
		double p=1;
		  
		for(int i=1; i<=cantidad;++i){
		   p=p*(367-i)/366;
		}
		p=100*(1-p);
		
		return p;
	}

	public static void main(String[] args) {
		//System.out.printf("%.10f %%", probabilidadCumple(23));		
		
		int repeticiones = 100000;
		int contador = 0;
		double porcentaje;
			
		for(int j=0; j<repeticiones; ++j) {
			List<Object> lista = new ArrayList<Object>();
			for(int i=1; i<=23; ++i){
				Integer aleatorio = new Integer((int)(Math.random()*367+1));
				lista.add(aleatorio);
			}
			//System.out.println(lista);
			if(Ejercicio4_Duplicados.tieneDuplicados(lista))
				++contador;			
		}
		
		porcentaje = 100*((double)contador / repeticiones);
		
		System.out.printf("En %d repeticiones, han coincidido cumplea�os el %.10f %%.",
				           repeticiones, porcentaje);		
	}

}
