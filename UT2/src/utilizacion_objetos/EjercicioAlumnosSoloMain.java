package utilizacion_objetos;

import java.util.Scanner;

//ESTA APLICACIÓN PIDE LOS DATOS DE TRES ALUMNOS Y LOS MUESTRA EN PANTALLA 
//LA EDAD SÓLO LA PIDE UNA VEZ PUESTO QUE ES LA MISMA
//REALIZADO POR MÉTODO TRADICIONAL APRENDIDO EN CLASE (SIN CLASES-OBJETOS)

//SÓLO SE AÑADIRÁN COMENTARIOS DE LÍNEA A LOS TEMAS NUEVOS Y ACLARATORIOS

//AUTOR: Miguel Ángel García Godoy
//FECHA: 20/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

public class EjercicioAlumnosSoloMain {

	public static void main(String[] args) {

		Scanner entradaPorTeclado = new Scanner( System.in );
		
		String nombreAlumno1,
			   nombreAlumno2,
			   nombreAlumno3;
		
		int edadTresAlumnos;
		
		System.out.print( "Introduzca el NOMBRE del ALUMNO nº1: " );
		nombreAlumno1 = entradaPorTeclado.nextLine();
				
		System.out.print( "Introduzca el NOMBRE del ALUMNO nº2: " );
		nombreAlumno2 = entradaPorTeclado.nextLine();
		
		System.out.print( "Introduzca el NOMBRE del ALUMNO nº3: " );
		nombreAlumno3 = entradaPorTeclado.nextLine();
		
		System.out.print( "Introduzca la EDAD de los tres alumnos: " );
		edadTresAlumnos = entradaPorTeclado.nextInt();
		
		entradaPorTeclado.close();
		
		System.out.println( "-------DATOS DE LOS ALUMNOS-------" );
		
		System.out.println( "ALUMNO Nº1: Nombre: " + nombreAlumno1 + " - Edad: " + edadTresAlumnos );
		System.out.println( "ALUMNO Nº2: Nombre: " + nombreAlumno2 + " - Edad: " + edadTresAlumnos );
		System.out.println( "ALUMNO Nº3: Nombre: " + nombreAlumno3 + " - Edad: " + edadTresAlumnos );

	}

}
