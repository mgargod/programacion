package utilizacion_objetos;

import javax.swing.JOptionPane;

//APLICACI�N BASADA EN LA CLASE CUENTA, CREA DOS OBJETOS CUENTA INICIALIZADOS
//CON SALDO INICIAL, PERMITE INGRESAR, RETIRAR Y CONOCER EL SALDO
//ESTA VERSI�N UTILIZA JOPTIONPANE (VENTANAS) PARA LA INTRODUCCI�N Y SALIDA DE DATOS POR PARTE
//DEL USUARIO

//NOTA: Para introducir los decimales en las ventanas de di�logo, hay que hacerlo con "." y no con ","
//como ocurre al utilizar Scanner.

//AUTOR: Miguel �ngel Garc�a Godoy (Obtenido en parte del libro Deitel)
//FECHA: 20/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

public class CuentaMainVentanas {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta( 0.0 );
		Cuenta cuenta2 = new Cuenta( 0.0 );
		
		JOptionPane.showMessageDialog( null, "�BIENVENIDO A SUBANCO ONLINE!" );
		
		String saldoInicial = String.format( "-------SALDO INICIAL DE CUENTAS-------"
				+ "\nCuenta n�1: %.2f euros\nCuenta n� 2: %.2f euros", 
				cuenta1.obtenerSaldo(), cuenta2.obtenerSaldo() );
		JOptionPane.showMessageDialog( null, saldoInicial );
		
		JOptionPane.showMessageDialog( null, "-------PROCEDIMIENTO DE INGRESO EN CUENTAS------" );
		
		cuenta1.ingresar( Double.parseDouble( JOptionPane.showInputDialog("Cantidad a ingresar en Cuenta n� 1:")));
		cuenta2.ingresar( Double.parseDouble( JOptionPane.showInputDialog("Cantidad a ingresar en Cuenta n� 2:")));

		String saldoIngreso = String.format( "-------SALDO DE CUENTAS DESPU�S DE INGRESO-------"
				+ "\nCuenta n�1: %.2f euros\nCuenta n� 2: %.2f euros", 
				cuenta1.obtenerSaldo(), cuenta2.obtenerSaldo() );
		JOptionPane.showMessageDialog( null, saldoIngreso );
	
		
		JOptionPane.showMessageDialog( null, "-------PROCEDIMIENTO DE RETIRO DE CUENTAS------" );
		
		cuenta1.retirar( Double.parseDouble( JOptionPane.showInputDialog("Cantidad a retirar de Cuenta n� 1:")));
		cuenta2.retirar( Double.parseDouble( JOptionPane.showInputDialog("Cantidad a retirar de Cuenta n� 2:")));
		

		String saldoRetiro = String.format( "-------SALDO DE CUENTAS DESPU�S DE RETIRO-------"
				+ "\nCuenta n�1: %.2f euros\nCuenta n� 2: %.2f euros", 
				cuenta1.obtenerSaldo(), cuenta2.obtenerSaldo() );
		JOptionPane.showMessageDialog( null, saldoRetiro );
		
		
	}

}
