package utilizacion_objetos;

//CREACIÓN DE LA CLASE ALUMNO
//ATRIBUTOS: nombre, edad
//MÉTODOS: ponerNombre, ponerEdad, obtenerEdad, imprimirNombre, imprimirEdad

//AUTOR: Miguel Ángel García Godoy
//FECHA: 20/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

public class Alumno {

	//Declaración de atributos de la clase Alumno
	private String nombre;
	private int edad; 
	
	//Método ponerNombre
	public void ponerNombre( String name ){
		
		nombre = name;
		
	}//fin del método ponerNombre
	
	//Método ponerEdad
	public void ponerEdad( int age ){
		
		edad = age;
		
	}//fin del método ponerEdad
	

	//Método obtenerEdad
	public int obtenerEdad(){
		
		return edad;
		
	}//fin del método obtenerEdad
		
	//Método imprimirNombre
	public void imprimirNombre(){
		
		System.out.print( "Nombre: " + nombre );
		
	}//fin del método imprimirNombre
	
	//Método imprimirEdad
	public void imprimirEdad(){
		
		System.out.println( " - Edad: " + edad + " años" );
		
	}//fin del método imprimirEdad
	

}
