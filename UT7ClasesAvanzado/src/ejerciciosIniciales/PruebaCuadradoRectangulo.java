package ejerciciosIniciales;

public class PruebaCuadradoRectangulo {

	public static void main(String[] args) {
		
		Cuadrado cuadrado1 = new Cuadrado();
		Cuadrado cuadrado2 = new Cuadrado(5);
		Cuadrado cuadrado3 = new Cuadrado(-10);
		Rectangulo rectangulo1 = new Rectangulo(10, 5);
		Rectangulo rectangulo2 = new Rectangulo(-1,-1);
		
		cuadrado1.dibujar();
		System.out.println();
		
		cuadrado2.dibujar();
		System.out.println();
		
		cuadrado3.dibujar();
		System.out.println();
		
		rectangulo1.dibujar();
		System.out.println();
		
		rectangulo2.dibujar();
		System.out.println();
		
		if(rectangulo1.esHorizontal())
			System.out.println("El rectangulo1 es horizontal");
		else
			System.out.println("El rectangulo1 es vertical");		

	}

}
