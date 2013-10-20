package utilizacion_objetos;

//CREACI�N DE LA CLASE CUENTA
//ATRIBUTOS: saldo
//CONSTRUCTOR: si el valor de saldoInicial introducido es positivo, se le 
//asigna a saldo, pero si no, la variable se inicializa de modo predeterminado --> 0.0
//M�TODOS: ingresar, retirar, obtenerSaldo

//AUTOR: Miguel �ngel Garc�a Godoy (Obtenido en parte del libro Deitel)
//FECHA: 20/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

public class Cuenta {
	
	private double saldo;
	
	//Constructor de la clase Cuenta
	public Cuenta ( double saldoInicial ){
		
		if ( saldoInicial > 0.0 )
			
			saldo = saldoInicial;
			
	}//fin del constructor de la clase Cuenta
	
	//M�todo ingresar
	public void ingresar( double cantidadIngreso ){
		
		saldo = saldo + cantidadIngreso;
		
	}//fin del m�todo ingresar
	
	//M�todo retirar
	public void retirar( double cantidadRetiro ){
		
		saldo = saldo - cantidadRetiro;
		
	}//fin del m�todo retirar
	
	//M�todo obtenerSaldo
	public double obtenerSaldo(){
		
		return saldo;
		
	}//fin del m�todo obtenerSaldo
	
	
}//fin de la clase Cuenta
