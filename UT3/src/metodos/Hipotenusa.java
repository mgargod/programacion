package metodos;

import java.util.Scanner;

public class Hipotenusa {
	
	public static double hipotenusa ( double ladoB, double ladoC ) {
		
		double hipotenusa = Math.sqrt((Math.pow(ladoB, 2)) + (Math.pow(ladoC, 2)));	
		
		return hipotenusa;
	}

	public static void main(String[] args) {
		
		double ladoB = 0.0;
		double ladoC = 0.0;	
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.print("Dame los dos catetos del triángulo [ > 0.0 ]: ");
			ladoB = teclado.nextInt();
			ladoC = teclado.nextInt();
			
		} while ( ladoB <= 0.0 || ladoC <= 0.0 );
		
		teclado.close();		
		
		System.out.printf("Dados los catetos %.2f y %.2f, la hipotenusa es igual a %.2f", ladoB, 
				ladoC, hipotenusa(ladoB, ladoC));
	}

}
