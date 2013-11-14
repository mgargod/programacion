package condicionales;

import java.util.Scanner;

public class BisiestoSimplificado {

	public static void main(String[] args) {
		
		int year;
		String mensaje = "no es";

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el año para evaluar si es bisiesto o no: ");
		year = teclado.nextInt();
		teclado.close();
		
		if( year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ) mensaje = "es";
			
		System.out.printf("El año %d %s bisiesto.", year, mensaje);

	}

}

