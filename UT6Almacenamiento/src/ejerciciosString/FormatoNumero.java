package ejerciciosString;

/*
 * Escribe un método que reciba un número double y devuelva una cadena con comas y punto decimal. 
 * Por ejemplo, pasándole 1235689,45 dará "1.235.689,45".
 */

public class FormatoNumero {
	
	/**
	 * METODO formatDouble (da formato a un número real, con separador de miles y coma decimal)
	 * @param numero: double
	 * @return String (el número formateado)
	 */
	
	public static String formatDouble(double numero) {
		return String.format("%,.2f", numero);
	}

	public static void main(String[] args) {

		System.out.println(formatDouble(1235689.45));
	}

}

