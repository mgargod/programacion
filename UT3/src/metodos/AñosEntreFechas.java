package metodos;

import java.util.Scanner;

public class AñosEntreFechas {
	
	public static int añosEntre ( int dia, int mes, int año, int dia_final, int mes_final, int año_final ) {
		
		int añosEntre = año_final - año;		
		
		if ( mes - mes_final > 0 || mes == mes_final && dia - dia_final > 0 && !(dia == 29 && mes == 2)) 
			--añosEntre;
		
		return añosEntre;
	}

	public static void main(String[] args) {
		
		int años;
		int dia_actual;
		int mes_actual;
		int año_actual;
		int dia_anterior;
		int mes_anterior;
		int año_anterior;		

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca fecha actual [día mes año]: ");
		
		dia_actual = teclado.nextInt();
		mes_actual = teclado.nextInt();
		año_actual = teclado.nextInt();
		
		System.out.print("Introduzca fecha anterior [día mes año]: ");
		
		dia_anterior = teclado.nextInt();
		mes_anterior = teclado.nextInt();
		año_anterior = teclado.nextInt();
		
		teclado.close();
		
		años = añosEntre ( dia_anterior, mes_anterior, año_anterior, dia_actual, mes_actual, año_actual );
		
		System.out.printf("\nDesde el %d/%d/%d hasta el %d/%d/%d han pasado %d años.",
				           dia_anterior, mes_anterior, año_anterior, dia_actual, mes_actual, año_actual, años);
	
	}

}
