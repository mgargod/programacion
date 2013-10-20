package utilizacion_objetos;

import java.util.Scanner;

//APLICACI�N BASADA EN LA CLASE CUENTA, CREA DOS OBJETOS CUENTA INICIALIZADOS
//CON SALDO INICIAL, PERMITE INGRESAR, RETIRAR Y CONOCER EL SALDO
//ESTA VERSI�N UTILIZA SCANNER PARA LA INTRODUCCI�N DE DATOS POR PARTE
//DEL USUARIO

//AUTOR: Miguel �ngel Garc�a Godoy (Obtenido en parte del libro Deitel)
//FECHA: 20/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

public class CuentaMain {

	public static void main(String[] args) {

		Scanner entradaTeclado = new Scanner( System.in );
		
		Cuenta cuenta1 = new Cuenta( -200.15 );
		Cuenta cuenta2 = new Cuenta( 100.55 );
		
		System.out.println( "�BIENVENIDO A SUBANCO ONLINE!");
		System.out.println( "--------SALDO INICIAL DE CUENTAS--------");
		
		System.out.printf("Cuenta n� 1: %.2f euros\n", cuenta1.obtenerSaldo() );
		System.out.printf("Cuenta n� 2: %.2f euros\n", cuenta2.obtenerSaldo() );
		
		System.out.println( "--------PROCEDIMIENTO DE INGRESO EN CUENTAS--------");
		
		System.out.print("Introduzca la cantidad a ingresar en Cuenta n� 1: ");
		cuenta1.ingresar( entradaTeclado.nextDouble() );

		System.out.print("Introduzca la cantidad a ingresar en Cuenta n� 2: ");
		cuenta2.ingresar( entradaTeclado.nextDouble() );
		
		System.out.println( "--------SALDO DE CUENTAS DESPU�S DE INGRESO--------");
		
		System.out.printf("Cuenta n� 1: %.2f euros\n", cuenta1.obtenerSaldo() );
		System.out.printf("Cuenta n� 2: %.2f euros\n", cuenta2.obtenerSaldo() );
		
		System.out.println( "--------PROCEDIMIENTO DE RETIRO DE CUENTAS--------");
		
		System.out.print("Introduzca la cantidad a retirar de Cuenta n� 1: ");
		cuenta1.retirar( entradaTeclado.nextDouble() );

		System.out.print("Introduzca la cantidad a retirar de Cuenta n� 2: ");
		cuenta2.retirar( entradaTeclado.nextDouble() );
		
		entradaTeclado.close();
		
		System.out.println( "--------SALDO DE CUENTAS DESPU�S DE RETIRO--------");
		
		System.out.printf("Cuenta n� 1: %.2f euros\n", cuenta1.obtenerSaldo() );
		System.out.printf("Cuenta n� 2: %.2f euros\n", cuenta2.obtenerSaldo() );
		
		
	}

}
