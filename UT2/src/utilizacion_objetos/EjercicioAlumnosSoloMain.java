package utilizacion_objetos;

import java.util.Scanner;

//ESTA APLICACI�N PIDE LOS DATOS DE TRES ALUMNOS Y LOS MUESTRA EN PANTALLA 
//LA EDAD S�LO LA PIDE UNA VEZ PUESTO QUE ES LA MISMA
//REALIZADO POR M�TODO TRADICIONAL APRENDIDO EN CLASE (SIN CLASES-OBJETOS)

//S�LO SE A�ADIR�N COMENTARIOS DE L�NEA A LOS TEMAS NUEVOS Y ACLARATORIOS

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 20/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

public class EjercicioAlumnosSoloMain {

	public static void main(String[] args) {

		Scanner entradaPorTeclado = new Scanner( System.in );
		
		String nombreAlumno1,
			   nombreAlumno2,
			   nombreAlumno3;
		
		int edadTresAlumnos;
		
		System.out.print( "Introduzca el NOMBRE del ALUMNO n�1: " );
		nombreAlumno1 = entradaPorTeclado.nextLine();
				
		System.out.print( "Introduzca el NOMBRE del ALUMNO n�2: " );
		nombreAlumno2 = entradaPorTeclado.nextLine();
		
		System.out.print( "Introduzca el NOMBRE del ALUMNO n�3: " );
		nombreAlumno3 = entradaPorTeclado.nextLine();
		
		System.out.print( "Introduzca la EDAD de los tres alumnos: " );
		edadTresAlumnos = entradaPorTeclado.nextInt();
		
		entradaPorTeclado.close();
		
		System.out.println( "-------DATOS DE LOS ALUMNOS-------" );
		
		System.out.println( "ALUMNO N�1: Nombre: " + nombreAlumno1 + " - Edad: " + edadTresAlumnos );
		System.out.println( "ALUMNO N�2: Nombre: " + nombreAlumno2 + " - Edad: " + edadTresAlumnos );
		System.out.println( "ALUMNO N�3: Nombre: " + nombreAlumno3 + " - Edad: " + edadTresAlumnos );

	}

}
