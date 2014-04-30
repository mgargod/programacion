package simulacro2.Ejercicio3;

public class MatrizDispersa2 {
	
	private ElementoMatriz[] elementos;
	private int filas,columnas;
	private int numElementosNoCero;
	
	public MatrizDispersa2 ( int columnas, int filas, double porcentaje ) {
		this.columnas = columnas;
		this.filas = filas;
		
		int tamaño;
		tamaño=columnas*filas;
		tamaño=(int)(tamaño*porcentaje/100);
		elementos = new ElementoMatriz[tamaño];
		numElementosNoCero=0;
	}
	
	public MatrizDispersa2 (double[][] matriz, double porcentaje) {
		this.columnas=matriz[0].length;
		this.filas=matriz.length;
		
		int tamaño;
		tamaño=columnas*filas;
		tamaño=(int)(tamaño*porcentaje/100);
		elementos = new ElementoMatriz[tamaño];
		numElementosNoCero=0;
		
		for(int i=0; i<matriz.length; ++i)
			for(int j=0; j<matriz[i].length;++j)
				if(matriz[i][j]!=0) setValor(j,i,matriz[i][j]);
	}
	
	public double getValor(int columna, int fila) {
		for(int i=0; i < numElementosNoCero; ++i) {
			if(elementos[i].getColumna()==columna && elementos[i].getFila()==fila)
				return elementos[i].getContenido();
		}
		
		return 0.0;
	}
	
	public void setValor(int columna, int fila, double valor) {
		boolean encontrado = false;
		for(int i=0; i < numElementosNoCero; ++i) {
			if(elementos[i].getColumna()==columna && elementos[i].getFila()==fila) {
				elementos[i].setContenido(valor);
				encontrado = true;				
			}				
		}
		
		if(!encontrado) {
			
			elementos[numElementosNoCero] = new ElementoMatriz(columna, fila, valor);
			++numElementosNoCero;
		}	
		
	}
	
	public void imprimir() {
		
		for(int i=0; i<filas;++i) {
			for(int j=0; j<columnas; ++j) {
				System.out.printf("%.2f ", getValor(j,i));
			}
			System.out.println();
		}
	}

}
