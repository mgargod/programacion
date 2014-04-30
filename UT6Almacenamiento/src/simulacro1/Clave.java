package simulacro1;

import java.util.Scanner;

public class Clave {
	
	//Atributos
	
	private String clave;
	
	//Constructor
	
	public Clave() {
		
		this.clave = "";
	}
	
	//Accesadores	
	
	public String getClave() {
		return clave;
	}
	
	//Servicios

	public void introducirClave() throws ClaveErronea {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);		
		String clave2;
		
		System.out.print("Introduce una clave: ");
		this.clave = teclado.next();
		
		if ( this.clave.length() != 6) 
			throw new ClaveErronea("Formato incorrecto, debe tener 6 caracteres alfanuméricos.");
		
		else {
			
			for ( int i = 0; i < this.clave.length(); ++i ) {
			
				if ( !(Character.isAlphabetic(this.clave.charAt(i)) || Character.isDigit(this.clave.charAt(i))))					
					throw new ClaveErronea("Formato incorrecto, debe tener 6 caracteres alfanuméricos.");													
			}
			
			System.out.print("Vuelva a introducir la clave: ");
			clave2 = teclado.next();
			
			if ( !this.clave.equals(clave2))				
				throw new ClaveErronea("Las claves no se corresponden. El proceso volverá a empezar.");
			else
				System.out.println("Clave OK. Proceso terminado.");			
		}		
	}

	public static void main(String[] args) {
		
		Clave clave = new Clave();
		
		boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
		
			clave.introducirClave();
		
			} catch (ClaveErronea ce) {
				
				System.out.println(ce.getMessage());
				continuar = true;
			}		
		
		} while (continuar);
		
		System.out.println("Clave almacenada: " + clave.getClave());		

	}

}
