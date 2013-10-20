package utilizacion_objetos;

//CREACIÓN DE LA CLASE CUENTA
//ATRIBUTOS: saldo
//CONSTRUCTOR: si el valor de saldoInicial introducido es positivo, se le 
//asigna a saldo, pero si no, la variable se inicializa de modo predeterminado --> 0.0
//MÉTODOS: ingresar, retirar, obtenerSaldo

//AUTOR: Miguel Ángel García Godoy (Obtenido en parte del libro Deitel)
//FECHA: 20/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

public class Cuenta {
	
	private double saldo;
	
	//Constructor de la clase Cuenta
	public Cuenta ( double saldoInicial ){
		
		if ( saldoInicial > 0.0 )
			
			saldo = saldoInicial;
			
	}//fin del constructor de la clase Cuenta
	
	//Método ingresar
	public void ingresar( double cantidadIngreso ){
		
		saldo = saldo + cantidadIngreso;
		
	}//fin del método ingresar
	
	//Método retirar
	public void retirar( double cantidadRetiro ){
		
		saldo = saldo - cantidadRetiro;
		
	}//fin del método retirar
	
	//Método obtenerSaldo
	public double obtenerSaldo(){
		
		return saldo;
		
	}//fin del método obtenerSaldo
	
	
}//fin de la clase Cuenta
