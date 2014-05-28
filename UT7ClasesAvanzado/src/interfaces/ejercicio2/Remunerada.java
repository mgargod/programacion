package interfaces.ejercicio2;

/*
 * Crea el interfaz Remunerada, que se define con los siguientes métodos:

    asignarTipoInteres(tipo): asigna el tipo de interes de la cuenta.
    obtenerTipoInteres(): devuelve el tipo de interes de la cuenta.
    intereses(días): calcula los intereses producidos por la cuenta en el número de días especificado.

 */

public interface Remunerada {
	
	public void asignarTipoInteres(double porcentajeTipo);
	public double obtenerTipoInteres();
	public double intereses(int dias);

}
