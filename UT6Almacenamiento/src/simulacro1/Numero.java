package simulacro1;

public class Numero {
	
	//Atributos
	
	private int numAtendiendo;
	private int numDado;
	
	//Constructor

	public Numero() {
		
		this.numAtendiendo = 0;
		this.numDado = 0;
	}
	
	//Accesadores

	public int getNumAtendiendo() {
		return numAtendiendo;
	}

	public void setNumAtendiendo(int numAtendiendo) {
		this.numAtendiendo = numAtendiendo;
	}

	public int getNumDado() {
		return numDado;
	}

	public void setNumDado(int numDado) {
		this.numDado = numDado;
	}
	
	//Servicios
	
	public void darNumero() {
		
		this.numDado++;
		System.out.printf("*****\n* %d *\n*****\n", this.getNumDado());
		
	}
	
	public void atender() {
		
		if (this.numDado == 0 || this.numDado == this.numAtendiendo)
			System.out.println("Nadie para atender.");
		else {
			this.numAtendiendo++;
			System.out.printf("*Nº %d* pásese por el mostrador.\n", this.numAtendiendo);
		}
	}
	
	public void mostrarCola() {
		
		System.out.printf("Clientes sin atender: %d\n", this.numDado - this.numAtendiendo);
		for (int i = this.numAtendiendo + 1; i <= this.numDado; ++i )
			System.out.println(i);		
		
	}

}
