package metodos;

import java.util.Scanner;

public class A�osEntreFechas {
	
	public static int a�osEntre ( int dia, int mes, int a�o, int dia_final, int mes_final, int a�o_final ) {
		
		int a�osEntre = a�o_final - a�o;		
		
		if ( mes - mes_final > 0 || mes == mes_final && dia - dia_final > 0 && !(dia == 29 && mes == 2)) 
			--a�osEntre;
		
		return a�osEntre;
	}

	public static void main(String[] args) {
		
		int a�os;
		int dia_actual;
		int mes_actual;
		int a�o_actual;
		int dia_anterior;
		int mes_anterior;
		int a�o_anterior;		

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca fecha actual [d�a mes a�o]: ");
		
		dia_actual = teclado.nextInt();
		mes_actual = teclado.nextInt();
		a�o_actual = teclado.nextInt();
		
		System.out.print("Introduzca fecha anterior [d�a mes a�o]: ");
		
		dia_anterior = teclado.nextInt();
		mes_anterior = teclado.nextInt();
		a�o_anterior = teclado.nextInt();
		
		teclado.close();
		
		a�os = a�osEntre ( dia_anterior, mes_anterior, a�o_anterior, dia_actual, mes_actual, a�o_actual );
		
		System.out.printf("\nDesde el %d/%d/%d hasta el %d/%d/%d han pasado %d a�os.",
				           dia_anterior, mes_anterior, a�o_anterior, dia_actual, mes_actual, a�o_actual, a�os);
	
	}

}
