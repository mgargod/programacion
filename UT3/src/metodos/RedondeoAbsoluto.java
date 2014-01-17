package metodos;

public class RedondeoAbsoluto {

	public static int redondea ( double numero ) {
		
		int numeroRedondeado = (int)(Math.floor( numero + 0.5));		
		
		return numeroRedondeado;
	}
	
	public static double redondeaConDecimales ( double numero, int numDecimales ) {
		
		double numeroRedondeado = (Math.floor( numero * Math.pow(10, numDecimales) + 0.5 ))/Math.pow(10, numDecimales);
		
		return numeroRedondeado;
		
	}
	
	public static void main(String[] args) {

		double num1 = 1.3;
		int num1Red = 0;
		double num2 = 1.6678;
		double num2Red = 0.0;
		
		num1Red = redondea (num1);
		num2Red = redondeaConDecimales ( num2, 2 );
		
		System.out.printf("Número original: %.2f\nNúmero redondeado: %d\n", num1, num1Red);
		System.out.printf("Número original: %f\nNúmero redondeado: %.2f", num2, num2Red);

	}

}
