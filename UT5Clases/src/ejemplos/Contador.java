package ejemplos;

public class Contador {
	
	private long acumulador = 1;	
	
	
	public long getContador() {
		
		return acumulador;
	}
	
	public void setContador( long contador ) {
		
		acumulador = contador;
	}
	
	public void incrementar() {
		
		acumulador++;
	}

}
