package ejercicios;

public class PruebaContacto {

	public static void main(String[] args) {
		
//		Contacto contacto1 = new Contacto("Miguel","García","Godoy","Albar 9","611111111","925111111","mail1");
//		System.out.println(contacto1);
		
		Contacto[] listin;
		listin = new Contacto[10];
		
		listin[0] = new Contacto("Nombre1", "Apellido1", "111111111");
		listin[1] = new Contacto("Nombre2", "Apellido2", "222222222");
		listin[2] = new Contacto("Nombre3", "Apellido3", "333333333");
		
		for ( int i = 0; i < 3; ++i ) {
//			System.out.println(listin[i].getNombre() + ": " + listin[i].getTelMovil());
			System.out.println(listin[i]);
		}
	}

}
