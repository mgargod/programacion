package utilizacion_objetos;

import java.util.Scanner;

//ESTA APLICACIÓN PIDE LOS DATOS DE TRES ALUMNOS Y LOS MUESTRA EN PANTALLA 
//TAMBIÉN CALCULA Y MUESTRA LA MEDIA DE EDAD DE LOS TRES ALUMNOS
//REALIZADO POR MÉTODO TRADICIONAL APRENDIDO EN CLASE (SIN CLASES-OBJETOS)

//SÓLO SE AÑADIRÁN COMENTARIOS DE LÍNEA A LOS TEMAS NUEVOS Y ACLARATORIOS

//AUTOR: Miguel Ángel García Godoy
//FECHA: 20/10/2013
//ASIGNATURA: Programación
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
		
		System.out.print( "Introduzca el NOMBRE del ALUMNO nº1: " );
		nombreAlumno1 = entradaPorTeclado.nextLine();
				
		System.out.print( "Introduzca el NOMBRE del ALUMNO nº2: " );
		nombreAlumno2 = entradaPorTeclado.nextLine();
		
		System.out.print( "Introduzca el NOMBRE del ALUMNO nº3: " );
		nombreAlumno3 = entradaPorTeclado.nextLine();
		
		System.out.print( "Introduzca la EDAD del ALUMNO nº1: " );
		edadAlumno1 = entradaPorTeclado.nextInt();
		
		System.out.print( "Introduzca la EDAD del ALUMNO nº2: " );
		edadAlumno2 = entradaPorTeclado.nextInt();
		
		System.out.print( "Introduzca la EDAD del ALUMNO nº3: " );
		edadAlumno3 = entradaPorTeclado.nextInt();
		
		entradaPorTeclado.close();
		
		System.out.println( "-------DATOS DE LOS ALUMNOS-------" );
		
		System.out.println( "ALUMNO Nº1: Nombre: " + nombreAlumno1 + " - Edad: " + edadAlumno1 );
		System.out.println( "ALUMNO Nº2: Nombre: " + nombreAlumno2 + " - Edad: " + edadAlumno2 );
		System.out.println( "ALUMNO Nº3: Nombre: " + nombreAlumno3 + " - Edad: " + edadAlumno3 );
		
		System.out.println( "-------EDAD MEDIA DE LOS ALUMNOS-------" );
		System.out.printf( "%.2f%s", ( (double)edadAlumno1 + edadAlumno2 + edadAlumno3 ) / 3, 
							" años");
		
	} 

}
