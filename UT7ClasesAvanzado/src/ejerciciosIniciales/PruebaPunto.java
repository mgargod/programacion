package ejerciciosIniciales;

public class PruebaPunto {

	public static void main(String[] args) {

		Punto3D miPunto = new Punto3D();
		miPunto.x = 12;
		miPunto.y = 20;
		miPunto.z = 2;
		
		System.out.printf("El punto miPunto tiene de coordenadas: (%d, %d, %d)\n",miPunto.x,miPunto.y,miPunto.z);
		
		Punto3DPrivado miPuntoPrivado = new Punto3DPrivado();
		miPuntoPrivado.setX(12);
		miPuntoPrivado.setY(20);
		miPuntoPrivado.setZ(2);
		
		
		System.out.println(miPuntoPrivado);
		
		

	}

}
