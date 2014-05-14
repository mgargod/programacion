package ejerciciosIniciales;

import java.util.Date;

/*
 * Crea una clase de prueba que cree un objeto Publicación, otro Revista y otro Libro. 
 * Da valores a todos los atributos de cada uno de los objetos y posteriormente muestralos.
 */

public class PruebaPublicacion {

	public static void main(String[] args) {
		
				
		Publicacion publicacion = new Publicacion();
		Revista revista = new Revista();
		Libro libro = new Libro();
		
		publicacion.setEditor("Ediciones Azarquiel");
		publicacion.setFecha("1987");
		
		revista.setEditor("Lupulo");
		revista.setFecha("1970");
		revista.setNumero(12);
		
		libro.setAutor("Miguel de Cervantes");
		libro.setEditor("Medieval");
		libro.setFecha("1950");
		libro.setISBN("888-111-222");
		
		System.out.println("-----PUBLICACION-----");
		System.out.println(publicacion);
		
		System.out.println("-----REVISTA-----");
		System.out.println(revista);
		
		System.out.println("-----LIBRO-----");
		System.out.println(libro);
	
		
		

	}

}
