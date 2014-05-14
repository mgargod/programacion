package ejerciciosHerencia2;

import java.util.Scanner;

public class DeseaContinuar {
	
	public static boolean deseaContinuar(String pregunta, String error) {	
		
		String respuesta;
		boolean continuar;
		boolean devolver = false;
		Scanner teclado = new Scanner(System.in);
		
		do {			
			continuar = false;			
			
			System.out.print(pregunta);
			respuesta = teclado.next();
			
			if(respuesta.equalsIgnoreCase("s"))	devolver = true;
			else if(respuesta.equalsIgnoreCase("n")) devolver = false;
			else {
				System.out.println(error);
				continuar = true;
			}				
				
		} while(continuar);		
		
		return devolver;		
	}

	public static void main(String[] args) {

		if(deseaContinuar("¿Desea continuar [s/n]? ","Debe introducir \"s\" o \"n\"."))
			System.out.println("El usuario desea continuar.");
		else
			System.out.println("El usuario no desea continuar.");

	}

}
