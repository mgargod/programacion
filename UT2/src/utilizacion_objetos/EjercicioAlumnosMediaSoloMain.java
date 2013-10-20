package utilizacion_objetos;

import java.util.Scanner;

//ESTA APLICACI�N PIDE LOS DATOS DE TRES ALUMNOS Y LOS MUESTRA EN PANTALLA 
//TAMBI�N CALCULA Y MUESTRA LA MEDIA DE EDAD DE LOS TRES ALUMNOS
//REALIZADO POR M�TODO TRADICIONAL APRENDIDO EN CLASE (SIN CLASES-OBJETOS)

//S�LO SE A�ADIR�N COMENTARIOS DE L�NEA A LOS TEMAS NUEVOS Y ACLARATORIOS

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 20/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

public class EjercicioAlumnosMediaSoloMain {

	public static void main(String[] args) {

		Scanner entradaPorTeclado = new Scanner( System.in );
		
		String nombreAlumno1,
			   nombreAlumno2,
			   nombreAlumno3;
		
		int edadAlumno1,
			edadAlumno2,
			edadAlumno3;
		
		System.out.print( "Introduzca el NOMBRE del ALUMNO n�1: " );
		nombreAlumno1 = entradaPorTeclado.nextLine();
				
		System.out.print( "Introduzca el NOMBRE del ALUMNO n�2: " );
		nombreAlumno2 = entradaPorTeclado.nextLine();
		
		System.out.print( "Introduzca el NOMBRE del ALUMNO n�3: " );
		nombreAlumno3 = entradaPorTeclado.nextLine();
		
		System.out.print( "Introduzca la EDAD del ALUMNO n�1: " );
		edadAlumno1 = entradaPorTeclado.nextInt();
		
		System.out.print( "Introduzca la EDAD del ALUMNO n�2: " );
		edadAlumno2 = entradaPorTeclado.nextInt();
		
		System.out.print( "Introduzca la EDAD del ALUMNO n�3: " );
		edadAlumno3 = entradaPorTeclado.nextInt();
		
		entradaPorTeclado.close();
		
		System.out.println( "-------DATOS DE LOS ALUMNOS-------" );
		
		System.out.println( "ALUMNO N�1: Nombre: " + nombreAlumno1 + " - Edad: " + edadAlumno1 );
		System.out.println( "ALUMNO N�2: Nombre: " + nombreAlumno2 + " - Edad: " + edadAlumno2 );
		System.out.println( "ALUMNO N�3: Nombre: " + nombreAlumno3 + " - Edad: " + edadAlumno3 );
		
		System.out.println( "-------EDAD MEDIA DE LOS ALUMNOS-------" );
		System.out.printf( "%.2f%s", ( (double)edadAlumno1 + edadAlumno2 + edadAlumno3 ) / 3, 
							" a�os");
		
	} 

}
