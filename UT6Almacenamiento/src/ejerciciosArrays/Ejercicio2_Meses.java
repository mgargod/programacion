package ejerciciosArrays;

import java.util.Scanner;

/*
 * Ejercicio 2 Crea un programa que almacene los meses del a�o 
 * (los nombres de cada mes). Se pedir� al usuario el n�mero de mes y se visualizar� su nombre.
 */

public class Ejercicio2_Meses {

	public static void main(String[] args) {

		String[] meses = {"-","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
				          "Octubre", "Noviembre", "Diciembre"};
		
		int numMes;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el n�mero de mes [1-12]: ");
		
		numMes = teclado.nextInt();
		teclado.close();
		
		System.out.printf("Ha introducido %d, que corresponde al mes de %s.", numMes, meses[numMes]);
		

	}

}
