package ejercicios;
//int(Math.random()*(maximo-minimo+1)+minimo);  // Valor entre minimo y maximo, ambos incluidos (minimo>=0, maximo>0)
//int(Math.random()*(maximo-minimo+2)+minimo-1);  // Valor entre minimo y maximo, ambos incluidos (minimo<0, maximo>=0)
//int(Math.random()*(maximo-minimo+1)+minimo-1);  // Valor entre minimo y maximo, ambos incluidos (minimo<0, maximo<=0)
public class Oculto {
	
	private int oculto;
	
	public Oculto() {
		
		oculto = (int)(Math.random()*(100-1+1)+1);  //Entre 1 y 100, ambos inclusive
	}
	
	public Oculto( int minimo, int maximo ) {
		
		int auxiliar = 0;
		
		if ( minimo > maximo ) {
			auxiliar = minimo;
			minimo = maximo;
			maximo = auxiliar;
		}
		
		if( minimo >= 0 && maximo > 0 )		
			oculto = (int)(Math.random()*(maximo-minimo+1)+minimo);
		else if ( minimo < 0 && maximo >= 0 )
			oculto = (int)(Math.random()*(maximo-minimo+2)+minimo-1);
		else if ( minimo < 0 && maximo <= 0)
			oculto = (int)(Math.random()*(maximo-minimo+1)+minimo-1);
	}
	
	public int getOculto() {
		
		return oculto;
	}
	
	public int pruebaNumero ( int n ) {
		
		if ( n == oculto )
			return 0;
		else if ( n > oculto ) 
			return 1;
		else
			return -1;
			
	}

}
