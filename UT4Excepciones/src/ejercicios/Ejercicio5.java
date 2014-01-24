package ejercicios;

//import java.io.IOException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {		
		
		Scanner teclado = new Scanner(System.in);
		String nomAlumno1;
		String nomAlumno2;
		int edadAlumno1 = 0;
		int edadAlumno2 = 0;
		float altAlumno1 = 0f;
		float altAlumno2 = 0f;		
		boolean hayDatosErroneos;
		
		hayDatosErroneos = true;
		
		System.out.print("Introduzca Nombre de Alumno n�1: ");				
		nomAlumno1 = teclado.next();
		
		do {			
			
			try {				
				
				System.out.print("Introduzca Edad de Alumno n�1: ");				
				edadAlumno1 = teclado.nextInt();
				hayDatosErroneos = false;
			}
			
//			catch ( IOException e ){
				
//			}
			
			catch ( InputMismatchException entradaInvalida ) {
				
				System.out.println("Error al escribir la edad. Int�ntelo de nuevo.");
				teclado.nextLine();
			}
		
		} while ( hayDatosErroneos );
		
		hayDatosErroneos = true;
		
		do {			
			
			try {				
				
				System.out.print("Introduzca Altura de Alumno n�1: ");				
				altAlumno1 = teclado.nextFloat();
				hayDatosErroneos = false;
			}			
			
			catch ( InputMismatchException entradaInvalida ) {
				
				System.out.println("Error al escribir la altura. Int�ntelo de nuevo.");
				teclado.nextLine();
			}
		
		} while ( hayDatosErroneos );
		
		System.out.print("Introduzca Nombre de Alumno n�2: ");				
		nomAlumno2 = teclado.next();
		
		hayDatosErroneos = true;
		
		do {			
			
			try {				
				
				System.out.print("Introduzca Edad de Alumno n�2: ");				
				edadAlumno2 = teclado.nextInt();
				hayDatosErroneos = false;
			}			
			
			catch ( InputMismatchException entradaInvalida ) {
				
				System.out.println("Error al escribir la edad. Int�ntelo de nuevo.");
				teclado.nextLine();
			}
		
		} while ( hayDatosErroneos );
		
		hayDatosErroneos = true;
		
		do {			
			
			try {				
				
				System.out.print("Introduzca Altura de Alumno n�2: ");				
				altAlumno2 = teclado.nextFloat();
				hayDatosErroneos = false;
			}			
			
			catch ( InputMismatchException entradaInvalida ) {
				
				System.out.println("Error al escribir la altura. Int�ntelo de nuevo.");
				teclado.nextLine();
			}
		
		} while ( hayDatosErroneos );
		
		teclado.close();
		
		int mayor = Math.max(edadAlumno1, edadAlumno2);
		
		System.out.printf("\n%10s%10s%10s%10s\n", "NOMBRE", "EDAD", "ALTURA", "MAYOR");
		System.out.printf("\n%10s%10d%10.2f%10s\n", nomAlumno1, edadAlumno1, altAlumno1, 
				edadAlumno1 == mayor ? "X" : "");
		System.out.printf("\n%10s%10d%10.2f%10s\n", nomAlumno2, edadAlumno2, altAlumno2, 
				edadAlumno2 == mayor ? "X" : "");	

	}

}
