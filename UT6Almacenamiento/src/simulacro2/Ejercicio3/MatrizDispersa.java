package simulacro2.Ejercicio3;

public class MatrizDispersa {
	
	//Atributos	

	private ElementoMatriz elemento;
	private double[][] dispersa;
	private int columnas;
	private int filas;
	private double porcentaje;
	private int numDistintosCero;
	
	//Constructor
	
	public MatrizDispersa( int filas, int columnas, double porcentaje) {
		
		this.dispersa = new double[filas][columnas];
		for(int i=0; i < this.dispersa.length; i++)
			this.dispersa[i][i] = 0.0;
		this.columnas = columnas;
		this.filas = filas;
		this.porcentaje = porcentaje;
		this.numDistintosCero = (int)(this.columnas*this.filas*this.porcentaje);
		
	}
	
	public MatrizDispersa(double[][] matriz, double porcentaje) {
		
		this.dispersa = matriz;
		this.porcentaje = porcentaje;
		this.filas = matriz.length;
		this.columnas = matriz[0].length;
		this.porcentaje = porcentaje;
		this.numDistintosCero = (int)(this.columnas*this.filas*this.porcentaje);
		
	}
	
	public double getValor(int x, int y) {
		
		return this.dispersa[x][y];		
	}
	
	public void setValor(int x, int y, double z) throws SuperadoNumeroMaximoElementosDistintosCero {		
				
		if(this.numDistintosCero > 0) {
			
			this.elemento = new ElementoMatriz(y,x,z);
			this.dispersa[x][y] = z;
			--this.numDistintosCero;
			
		} else 
			throw new SuperadoNumeroMaximoElementosDistintosCero("Máximo de elementos distintos de cero "+
		                                                         "en elemento " + this.elemento);
			
	}
	
	public void imprimir() {
		
		System.out.println();
		
		for (double[] fila : this.dispersa) {
			for ( double elemento : fila) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}
}
