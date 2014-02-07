package ejemplos;

//MEJORA Nº 1: Hacer que la cuenta guarde el número de movimientos.
//getMovimientos que devuelve el número de movimientos.

//MEJORA Nº 2: Hacer que la cuenta no tenga descubiertos.

public class CuentaConExcepciones {
	
	private double saldo = 0;
	private int movimientos = 0;
	
	public void ingresar( double cantidad ) {
		
		saldo += cantidad;
		movimientos++;
	}
	
	public void retirar( double cantidad ) throws SaldoInsuficiente {		
		
		if (cantidad > saldo ) {			
			
			throw new SaldoInsuficiente();
		
		} else {
			
			saldo -= cantidad;
			movimientos++;
		}
			
	}
	
	public double getSaldo() {
		
		return saldo;
		
	}
	
	public int getMovimientos() {
		return movimientos;
	}

}
