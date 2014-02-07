package ejemplos;

import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		
		boolean continuar = true;
		String operacion = "";
		Cuenta cuenta1;
		
		System.out.println("Introduzca su n�mero de cuenta: ");
		cuenta1 = new Cuenta(teclado.next());
		
		System.out.println("Bienvenido a su cuenta on-line n� " + cuenta1.getNumCuenta());
		
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
				if (!(cuenta1.retirar(teclado.nextDouble())))
						System.out.println("Operaci�n no realizada");
				else				
					System.out.printf("Saldo despu�s de retirar: %.2f �\n", cuenta1.getSaldo());
				
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
