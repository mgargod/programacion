package ejerciciosIniciales;

/*
 * Crea la clase Libro, que heredará de Publicación. La clase Libro tiene los atributos autor e ISBN. 
Crea los métodos get/set asociados a estos atributos.
 */

public class Libro extends Publicacion {
	
	String autor;
	String ISBN;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public String toString() {
		return String.format("%sAutor: %s\nISBN: %s\n", super.toString(), this.autor, this.ISBN);
	}

}
