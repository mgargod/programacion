package utilizacion_objetos;

//CREACI�N DE LA CLASE ALUMNO
//ATRIBUTOS: nombre, edad
//M�TODOS: ponerNombre, ponerEdad, obtenerEdad, imprimirNombre, imprimirEdad

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 20/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

public class Alumno {

	//Declaraci�n de atributos de la clase Alumno
	private String nombre;
	private int edad; 
	
	//M�todo ponerNombre
	public void ponerNombre( String name ){
		
		nombre = name;
		
	}//fin del m�todo ponerNombre
	
	//M�todo ponerEdad
	public void ponerEdad( int age ){
		
		edad = age;
		
	}//fin del m�todo ponerEdad
	

	//M�todo obtenerEdad
	public int obtenerEdad(){
		
		return edad;
		
	}//fin del m�todo obtenerEdad
		
	//M�todo imprimirNombre
	public void imprimirNombre(){
		
		System.out.print( "Nombre: " + nombre );
		
	}//fin del m�todo imprimirNombre
	
	//M�todo imprimirEdad
	public void imprimirEdad(){
		
		System.out.println( " - Edad: " + edad + " a�os" );
		
	}//fin del m�todo imprimirEdad
	

}
