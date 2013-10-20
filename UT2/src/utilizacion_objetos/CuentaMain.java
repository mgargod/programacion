package utilizacion_objetos;

import java.util.Scanner;

//APLICACIÓN BASADA EN LA CLASE CUENTA, CREA DOS OBJETOS CUENTA INICIALIZADOS
//CON SALDO INICIAL, PERMITE INGRESAR, RETIRAR Y CONOCER EL SALDO
//ESTA VERSIÓN UTILIZA SCANNER PARA LA INTRODUCCIÓN DE DATOS POR PARTE
//DEL USUARIO

//AUTOR: Miguel Ángel García Godoy (Obtenido en parte del libro Deitel)
//FECHA: 20/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

public class CuentaMain {

	public static void main(String[] args) {

		Scanner entradaTeclado = new Scanner( System.in );
		
		Cuenta cuenta1 = new Cuenta( -200.15 );
		Cuenta cuenta2 = new Cuenta( 100.55 );
		
		System.out.println( "¡BIENVENIDO A SUBANCO ONLINE!");
		System.out.println( "--------SALDO INICIAL DE CUENTAS--------");
		
		System.out.printf("Cuenta nº 1: %.2f euros\n", cuenta1.obtenerSaldo() );
		System.out.printf("Cuenta nº 2: %.2f euros\n", cuenta2.obtenerSaldo() );
		
		System.out.println( "--------PROCEDIMIENTO DE INGRESO EN CUENTAS--------");
		
		System.out.print("Introduzca la cantidad a ingresar en Cuenta nº 1: ");
		cuenta1.ingresar( entradaTeclado.nextDouble() );

		System.out.print("Introduzca la cantidad a ingresar en Cuenta nº 2: ");
		cuenta2.ingresar( entradaTeclado.nextDouble() );
		
		System.out.println( "--------SALDO DE CUENTAS DESPUÉS DE INGRESO--------");
		
		System.out.printf("Cuenta nº 1: %.2f euros\n", cuenta1.obtenerSaldo() );
		System.out.printf("Cuenta nº 2: %.2f euros\n", cuenta2.obtenerSaldo() );
		
		System.out.println( "--------PROCEDIMIENTO DE RETIRO DE CUENTAS--------");
		
		System.out.print("Introduzca la cantidad a retirar de Cuenta nº 1: ");
		cuenta1.retirar( entradaTeclado.nextDouble() );

		System.out.print("Introduzca la cantidad a retirar de Cuenta nº 2: ");
		cuenta2.retirar( entradaTeclado.nextDouble() );
		
		entradaTeclado.close();
		
		System.out.println( "--------SALDO DE CUENTAS DESPUÉS DE RETIRO--------");
		
		System.out.printf("Cuenta nº 1: %.2f euros\n", cuenta1.obtenerSaldo() );
		System.out.printf("Cuenta nº 2: %.2f euros\n", cuenta2.obtenerSaldo() );
		
		
	}

}
