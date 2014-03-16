package ejemplos;

import java.util.Scanner;

public class BibliotecaPersonal {
	
	private Libro[] libros;
	private int num_libros;
	
	public BibliotecaPersonal(int max_libros) {
		
		this.libros = new Libro[max_libros];
		this.num_libros = 0;
		
	}	
	
	//Accesadores
	
	public Libro getLibro (int orden) {
		
		return libros[orden];
	}
	
	
	public int getNumLibros() {
		return num_libros;
	}


	//Servicios
	public void añadirLibro(String nombre, String autor, String isbn) {
		
		Libro nuevoLibro;
		nuevoLibro = new Libro(nombre,autor,isbn);
		
		libros[num_libros] = nuevoLibro; //más ortodoxo utilizar el getNumLibros();
		num_libros++;
	}
	
	public void añadirLibro(Libro nuevo) {		
			
		libros[num_libros] = nuevo; 
		num_libros++;
	}
	
	public void eliminarLibro(int orden) {
		
		this.libros[orden] = null;
		for (int i=orden;i<num_libros;i++) {
			this.libros[i] = this.libros[i+1];
		}
		this.num_libros--;
	}
	
	public void eliminarLibroDesordenado(int orden) {
		
		this.libros[orden] = this.libros[num_libros - 1];
		this.libros[num_libros - 1] = null;
		this.num_libros--;
	}
	
	public String toString() {
		
		String cadena;
		cadena = "BibliotecaPersonal: " + num_libros + " ejemplares\n";
		
		for (int i=0;i<num_libros;i++) {
			cadena += libros[i] + "\n";
		}
		
		return cadena;
	}
	
	private int mostrarMenu() {
		
		System.out.println("Biblioteca Personal");
		System.out.println("1. Listar libros");
		System.out.println("2. Añadir libro");
		System.out.println("3. Eliminar libro");
		System.out.println("4. Salir");
		System.out.println(" Opción: ");
		Scanner teclado = new Scanner(System.in);
		
		return teclado.nextInt();
		
	}
	
	public void listarLibros() {
		
		System.out.println("Biblioteca (" + num_libros + " ejemplares)");
		
		for(int i = 0; i < this.getNumLibros(); ++i ) {
			
			System.out.println(this.getLibro(i));
		}
	}

	public static void main(String[] args) {
		
		BibliotecaPersonal miBiblioteca = new BibliotecaPersonal(100);
		int respuesta = miBiblioteca.mostrarMenu();
		
		while (respuesta <=3) {

			switch (respuesta) {
			
				case 1:
					//System.out.println(miBiblioteca);
					miBiblioteca.listarLibros();
					break;
				case 2:
					Libro l = crearNuevoLibro();
					miBiblioteca.añadirLibro(l);
					break;
				case 3:
					//miBiblioteca.eliminarLibro(ordenLibro());
					miBiblioteca.eliminarLibroDesordenado(ordenLibro());
					break;
			}
			
			respuesta = miBiblioteca.mostrarMenu();
		}		

	}
	
	public static Libro crearNuevoLibro() {
		Libro libroNuevo;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime el nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Dime el autor: ");
		String autor = teclado.nextLine();
		System.out.print("Dime el ISBN: ");
		String isbn = teclado.nextLine();
		
		libroNuevo = new Libro(nombre,autor,isbn);
		return libroNuevo;
		
	}
	
	public static int ordenLibro() {		
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime la posición: ");
		int posicion = teclado.nextInt();		
		return posicion;
	}

}
