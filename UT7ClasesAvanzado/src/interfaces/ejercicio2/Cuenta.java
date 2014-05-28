package interfaces.ejercicio2;

/*
 * Crea la clase Cuenta, que tiene los siguientes atributos:

    nombre: nombre del cliente propietario.
    cuenta: número de la cuenta (es una cadena).
    saldo: saldo en euros de la cuenta.

La clase Cuenta también tendrá los métodos:

    get/set para los atributos nombre y cuenta.
    estado: devuelve el saldo de la cuenta.
    ingreso(cantidad): permite ingresar la cantidad de euros en la cuenta.
    reintegro(cantidad): permite sacar la cantidad de euros de la cuenta.

Crea una clase Banco, que mediante un menú permita operar con una cuenta y probar que tu anterior clase funciona.

Crea el interfaz Remunerada, que se define con los siguientes métodos:

    asignarTipoInteres(tipo): asigna el tipo de interes de la cuenta.
    obtenerTipoInteres(): devuelve el tipo de interes de la cuenta.
    intereses(días): calcula los intereses producidos por la cuenta en el número de días especificado.

Haz que la clase Cuenta implemente esta interfaz. ¿tendrás que añadir algún atributo a la clase?

Amblia la clase Banco para cambiar el tipo de interes y también para aplicarle los intereses.
 */

public class Cuenta implements Remunerada{
	
	private String nombre;
	private String numero;
	private double saldo;
	private double tipoInteres;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double estado() {
		return this.saldo;
	}
	
	public void ingreso(double cantidad) {
		this.saldo += cantidad;
	}
	
	public void reintegro(double cantidad) {
		if(cantidad > this.saldo)
			System.out.println("No puede sacar más dinero del que tiene. Es una norma del banco.");
		else
			this.saldo -= cantidad;
	}
	
	public String toString() {
		return String.format("Nombre cliente: %s\nNúmero de cuenta: %s\n", this.nombre, this.numero);
	}
	@Override
	public void asignarTipoInteres(double porcentajeTipo) {
		this.tipoInteres = porcentajeTipo;
		
	}
	@Override
	public double obtenerTipoInteres() {		
		return this.tipoInteres;
	}
	@Override
	public double intereses(int dias) {		
		return this.saldo * dias * (this.tipoInteres/100/365);
	}
	
	

}
