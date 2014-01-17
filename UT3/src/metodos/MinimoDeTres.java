package metodos;

import java.util.Scanner;

public class MinimoDeTres {
	
	public static int minimoDeTres ( int num1, int num2, int num3 ) {
		
		int minimo;
		
		minimo = Math.min( Math.min(num1, num2), num3 );	
		
		return minimo;
	}

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame 3 números enteros: ");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();
		
		teclado.close();
		
		System.out.printf("El mínimo de [ %d, %d, %d ] = %d", num1, num2, num3, 
				minimoDeTres(num1, num2, num3));
	}

}
