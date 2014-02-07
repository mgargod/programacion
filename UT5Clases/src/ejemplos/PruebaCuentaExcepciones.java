package ejemplos;

import java.util.Scanner;

public class PruebaCuentaExcepciones {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		CuentaConExcepciones cuenta1 = new CuentaConExcepciones();
		boolean continuar = true;
		String operacion = "";
		
		System.out.println("Bienvenido a su cuenta on-line");
		
		do {		
			
			System.out.print("Introduzca operaci�n [i (ingresar) r (retirar)]: ");
			operacion = teclado.next();
			
			if ( operacion.equalsIgnoreCase("i")) {
				
				System.out.printf("Saldo actual: %.2f �\n", cuenta1.getSaldo());
				System.out.print("Introduzca cantidad a ingresar: ");
				cuenta1.ingresar(teclado.nextDouble());
				System.out.printf("Saldo despu�s de ingreso: %.2f �\n", cuenta1.getSaldo());
				
			} else if ( operacion.equalsIgnoreCase("r")) {
				
				System.out.printf("Saldo actual: %.2f �\n", cuenta1.getSaldo());
				System.out.print("Introduzca cantidad a retirar: ");
				
				try {
					
					cuenta1.retirar(teclado.nextDouble());
					System.out.printf("Saldo despu�s de retirar: %.2f �\n", cuenta1.getSaldo());
				}
				
				catch ( SaldoInsuficiente si ) {
					
					System.out.println("Operaci�n no permitida.");
					
				}					
				
			} else {
				
				System.out.println("No ha introducido ninguna operaci�n v�lida");
			}
			
			System.out.print("�M�s movimientos [s/n]? ");
			
			if ( teclado.next().equalsIgnoreCase("n")) continuar = false;
		
		} while ( continuar );
		
		teclado.close();
		System.out.println("Movimientos realizados: " + cuenta1.getMovimientos());
	}

}
