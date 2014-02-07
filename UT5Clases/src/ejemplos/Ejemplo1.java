package ejemplos;

public class Ejemplo1 {

	public static void main(String[] args) {

		Persona angel;
		Persona manolo;
		
		angel = new Persona();
		angel.nombre = "Angel";
		angel.edad = 23;
		
		angel.imprimirNombre();
		
		manolo = new Persona();
		manolo.nombre = "Manolo";
		manolo.edad = angel.edad;
		
		manolo.imprimirNombre();
		
		

	}

}
