package ejercicios.actividad2.pruebas_actividad2;

import ejercicios.actividad2.numeros.Numero;

public class PruebaNumero {

	public static void main(String[] args) {

		Numero numero1 = new Numero();
		Numero numero2 = new Numero(29);
		
		int a = 3;
		int b = 1;
		
		
		System.out.printf("--- Números iniciales ---\nNúmero 1: %s\nNúmero 2: %s\nNúmero a: %d\nNúmero b: %d\n",
				           numero1, numero2, a, b);
		
		System.out.println("--- OPERACIONES CON Número 2 ---");
		numero2.añade(a);
		System.out.println("Añadir \"a\"---> Resultado: " + numero2);	
		numero2.resta(b);
		System.out.println("Restar \"b\"---> Resultado: " + numero2);
		
		numero2.resetNumero();
		System.out.println("Resetear ---> Resultado: " + numero2);

		System.out.println("Calcular el doble ---> Resultado: " + numero2.getDoble());
		System.out.println("Calcular el triple ---> Resultado: " + numero2.getTriple());

	}

}
