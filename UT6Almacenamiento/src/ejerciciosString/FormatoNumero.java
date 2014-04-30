package ejerciciosString;

/*
 * Escribe un m�todo que reciba un n�mero double y devuelva una cadena con comas y punto decimal. 
 * Por ejemplo, pas�ndole 1235689,45 dar� "1.235.689,45".
 */

public class FormatoNumero {
	
	/**
	 * METODO formatDouble (da formato a un n�mero real, con separador de miles y coma decimal)
	 * @param numero: double
	 * @return String (el n�mero formateado)
	 */
	
	public static String formatDouble(double numero) {
		return String.format("%,.2f", numero);
	}

	public static void main(String[] args) {

		System.out.println(formatDouble(1235689.45));
	}

}

