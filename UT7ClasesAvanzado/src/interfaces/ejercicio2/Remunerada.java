package interfaces.ejercicio2;

/*
 * Crea el interfaz Remunerada, que se define con los siguientes m�todos:

    asignarTipoInteres(tipo): asigna el tipo de interes de la cuenta.
    obtenerTipoInteres(): devuelve el tipo de interes de la cuenta.
    intereses(d�as): calcula los intereses producidos por la cuenta en el n�mero de d�as especificado.

 */

public interface Remunerada {
	
	public void asignarTipoInteres(double porcentajeTipo);
	public double obtenerTipoInteres();
	public double intereses(int dias);

}
