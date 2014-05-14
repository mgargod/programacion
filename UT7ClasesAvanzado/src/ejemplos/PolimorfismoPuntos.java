package ejemplos;

public class PolimorfismoPuntos {
	
	public static void main(String[] args) {
		
		PuntoPrivado[] puntos;
		puntos = new PuntoPrivado[3];
		
		puntos[0] = new PuntoPrivado();
		puntos[1] = new Punto3DPrivado();
		puntos[2] = new PuntoPrivado();
		
		//for(int i=0; i<3; ++i) System.out.println(puntos[i]);
		
		for(PuntoPrivado punto : puntos)
			System.out.println(punto);
	}


}
