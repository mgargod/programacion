package ejercicios;

public class PruebaRacional {

	public static void main(String[] args) {
		
		Racional a = new Racional(2,7);
		Racional b = new Racional(3,14);		
		
		System.out.print(a + " + " + b + " = " + Racional.suma(a, b) + " ~ " +(Racional.suma(a, b)).toFloatString());
		System.out.println();
		System.out.print(a + " - " + b + " = " + Racional.resta(a, b));
		System.out.println();
		System.out.print(a + " x " + b + " = " + Racional.producto(a, b));
		System.out.println();
		System.out.print(a + " : " + b + " = " + Racional.division(a, b));
		System.out.println();
		System.out.println(a.toFloatString());

	}

}
