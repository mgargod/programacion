package ejemplos;

import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		
		boolean continuar = true;
		String operacion = "";
		Cuenta cuenta1;
		
		System.out.println("Introduzca su número de cuenta: ");
		cuenta1 = new Cuenta(teclado.next());
		
		System.out.println("Bienvenido a su cuenta on-line nº " + cuenta1.getNumCuenta());
		
		do {		
			
			System.out.print("Introduzca operación [i (ingresar) r (retirar)]: ");
			operacion = teclado.next();
			
			if ( operacion.equalsIgnoreCase("i")) {
				
				System.out.printf("Saldo actual: %.2f €\n", cuenta1.getSaldo());
				System.out.print("Introduzca cantidad a ingresar: ");
				cuenta1.ingresar(teclado.nextDouble());
				System.out.printf("Saldo después de ingreso: %.2f €\n", cuenta1.getSaldo());
				
			} else if ( operacion.equalsIgnoreCase("r")) {
				
				System.out.printf("Saldo actual: %.2f €\n", cuenta1.getSaldo());
				System.out.print("Introduzca cantidad a retirar: ");
				if (!(cuenta1.retirar(teclado.nextDouble())))
						System.out.println("Operación no realizada");
				else				
					System.out.printf("Saldo después de retirar: %.2f €\n", cuenta1.getSaldo());
				
			} else {
				
				System.out.println("No ha introducido ninguna operación válida");
			}
			
			System.out.print("¿Más movimientos [s/n]? ");
			if ( teclado.next().equalsIgnoreCase("n")) continuar = false;
		
		} while ( continuar );
		
		teclado.close();
		System.out.println("Movimientos realizados: " + cuenta1.getMovimientos());
	}

}
