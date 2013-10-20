package utilizacion_objetos;

import java.util.Scanner;

//MAIN UTILIZANDO LA CLASE ALUMNO PARA ESTABLECER DATOS DE ALUMNOS,
//IMPRIMIR DATOS POR PANTALLA Y CALCULAR E IMPRIMIR EDAD MEDIA

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 20/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

public class AlumnoMain {

	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner( System.in );
		
		Alumno alumno1 = new Alumno(); //Creaci�n objeto alumno1 de la clase Alumno
		Alumno alumno2 = new Alumno(); //Creaci�n objeto alumno2 de la clase Alumno
		Alumno alumno3 = new Alumno(); //Creaci�n objeto alumno3 de la clase Alumno
		
		System.out.print( "Introduzca el NOMBRE del Alumno n�1: ");
		alumno1.ponerNombre( entradaPorTeclado.nextLine() ); //Utilizamos el m�todo ponerNombre,
		//pas�ndole como par�metro la entrada por teclado.
		
		System.out.print( "Introduzca el NOMBRE del Alumno n�2: ");
		alumno2.ponerNombre( entradaPorTeclado.nextLine() );
		
		System.out.print( "Introduzca el NOMBRE del Alumno n�3: ");
		alumno3.ponerNombre( entradaPorTeclado.nextLine() );
		
		System.out.print( "Introduzca la EDAD del Alumno n�1: ");
		alumno1.ponerEdad( entradaPorTeclado.nextInt() ); //Utilizamos el m�todo ponerEdad,
		//pas�ndole como par�metro la entrada por teclado.
		
		System.out.print( "Introduzca la EDAD del Alumno n�2: ");
		alumno2.ponerEdad( entradaPorTeclado.nextInt() );
		
		System.out.print( "Introduzca la EDAD del Alumno n�3: ");
		alumno3.ponerEdad( entradaPorTeclado.nextInt() );
		
		entradaPorTeclado.close();
		
		System.out.println( "-------DATOS DE LOS ALUMNOS-------" );
		
		System.out.println( "ALUMNO N� 1" );
		alumno1.imprimirNombre(); alumno1.imprimirEdad(); //Utilizamos los m�todos imprimir
		
		System.out.println( "ALUMNO N� 2" );
		alumno2.imprimirNombre(); alumno2.imprimirEdad();
		
		System.out.println( "ALUMNO N� 3" );
		alumno3.imprimirNombre(); alumno3.imprimirEdad();
		
		System.out.println( "-------EDAD MEDIA DE LOS ALUMNOS-------" );

		System.out.printf( "%.2f%s", 
							( (double)alumno1.obtenerEdad() + 
									  alumno2.obtenerEdad() +
									  alumno3.obtenerEdad() ) / 3, " a�os" );

	}

}
