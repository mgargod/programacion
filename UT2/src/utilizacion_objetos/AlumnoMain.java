package utilizacion_objetos;

import java.util.Scanner;

//MAIN UTILIZANDO LA CLASE ALUMNO PARA ESTABLECER DATOS DE ALUMNOS,
//IMPRIMIR DATOS POR PANTALLA Y CALCULAR E IMPRIMIR EDAD MEDIA

//AUTOR: Miguel Ángel García Godoy
//FECHA: 20/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

public class AlumnoMain {

	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner( System.in );
		
		Alumno alumno1 = new Alumno(); //Creación objeto alumno1 de la clase Alumno
		Alumno alumno2 = new Alumno(); //Creación objeto alumno2 de la clase Alumno
		Alumno alumno3 = new Alumno(); //Creación objeto alumno3 de la clase Alumno
		
		System.out.print( "Introduzca el NOMBRE del Alumno nº1: ");
		alumno1.ponerNombre( entradaPorTeclado.nextLine() ); //Utilizamos el método ponerNombre,
		//pasándole como parámetro la entrada por teclado.
		
		System.out.print( "Introduzca el NOMBRE del Alumno nº2: ");
		alumno2.ponerNombre( entradaPorTeclado.nextLine() );
		
		System.out.print( "Introduzca el NOMBRE del Alumno nº3: ");
		alumno3.ponerNombre( entradaPorTeclado.nextLine() );
		
		System.out.print( "Introduzca la EDAD del Alumno nº1: ");
		alumno1.ponerEdad( entradaPorTeclado.nextInt() ); //Utilizamos el método ponerEdad,
		//pasándole como parámetro la entrada por teclado.
		
		System.out.print( "Introduzca la EDAD del Alumno nº2: ");
		alumno2.ponerEdad( entradaPorTeclado.nextInt() );
		
		System.out.print( "Introduzca la EDAD del Alumno nº3: ");
		alumno3.ponerEdad( entradaPorTeclado.nextInt() );
		
		entradaPorTeclado.close();
		
		System.out.println( "-------DATOS DE LOS ALUMNOS-------" );
		
		System.out.println( "ALUMNO Nº 1" );
		alumno1.imprimirNombre(); alumno1.imprimirEdad(); //Utilizamos los métodos imprimir
		
		System.out.println( "ALUMNO Nº 2" );
		alumno2.imprimirNombre(); alumno2.imprimirEdad();
		
		System.out.println( "ALUMNO Nº 3" );
		alumno3.imprimirNombre(); alumno3.imprimirEdad();
		
		System.out.println( "-------EDAD MEDIA DE LOS ALUMNOS-------" );

		System.out.printf( "%.2f%s", 
							( (double)alumno1.obtenerEdad() + 
									  alumno2.obtenerEdad() +
									  alumno3.obtenerEdad() ) / 3, " años" );

	}

}
