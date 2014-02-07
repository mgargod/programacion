package ejemplos;

//MEJORA N� 1: Hacer que la cuenta guarde el n�mero de movimientos.
//getMovimientos que devuelve el n�mero de movimientos.

//MEJORA N� 2: Hacer que la cuenta no tenga descubiertos.
//MEJORA N� 3: Que pueda guardar el n�mero de cuenta (Introducimos el concepto del constructor)

public class Cuenta {
	
	private double saldo;
	private int movimientos;
	private String numCuenta;
	
	public Cuenta ( String numCuenta ) {
		
		this.numCuenta = numCuenta;
		this.saldo = 0;
		this.movimientos = 0;
		
	}
	
	public Cuenta ( String numCuenta, double saldo ) {
		
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.movimientos = 1;
		
	}
	
	public String getNumCuenta() {
		
		return numCuenta;
	}

	public void ingresar( double cantidad ) {
		
		saldo += cantidad;
		movimientos++;
	}
	
	public boolean retirar( double cantidad ) {		
		
		if (cantidad > saldo ) {			
			
			System.out.println("No tiene cr�dito para n�meros rojos");
			return false;
		
		} else {
			
			saldo -= cantidad;
			movimientos++;
			return true;
		}
			
	}
	
	public double getSaldo() {
		
		return saldo;
		
	}
	
	public int getMovimientos() {
		return movimientos;
	}

}
