package ejemplos;

//MEJORA Nº 1: Hacer que la cuenta guarde el número de movimientos.
//getMovimientos que devuelve el número de movimientos.

//MEJORA Nº 2: Hacer que la cuenta no tenga descubiertos.
//MEJORA Nº 3: Que pueda guardar el número de cuenta (Introducimos el concepto del constructor)

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
			
			System.out.println("No tiene crédito para números rojos");
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
