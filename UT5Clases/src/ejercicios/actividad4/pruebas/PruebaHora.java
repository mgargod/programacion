package ejercicios.actividad4.pruebas;

import ejercicios.actividad4.Hora;

/*
 * [...]
mihora=new Hora(12,45,32);
unahoraycuarto=new Hora(1,15,0);
mihora.suma(unahoraycuarto);
System.out.println(mihora.aCadena());
[...]
 */

public class PruebaHora {

	public static void main(String[] args) {

		Hora mihora = new Hora(12,180,89);
		Hora unahoraycuarto=new Hora(1,15,00);
		mihora.suma(unahoraycuarto);
		System.out.println(mihora);

	}

}
