package ejemplosString;

public class EjemplosStringBuffer {

	public static void main(String[] args) {

		StringBuilder nombre;
		String nombre2="Jam�s";
		
		nombre = new StringBuilder("Angel");
		System.out.println(nombre);
		nombre.append(" Ca�adas");
		System.out.println(nombre);
		nombre.insert(5, " Mart�nez");
		System.out.println(nombre);
		nombre.delete(nombre.indexOf(" C"), nombre.length());
		System.out.println(nombre);
		nombre.reverse();
		System.out.println(nombre);
		nombre.reverse();
		System.out.println(nombre);
		nombre.replace(0, 5, "Hola ");
		System.out.println(nombre);
		nombre.deleteCharAt(5);
		System.out.println(nombre);
		nombre.insert(4, ", se�or");
		System.out.println(nombre);
		int codigo = nombre.codePointAt(0);
		System.out.println(codigo);
		System.out.println((int)'H');
		System.out.println(nombre2.codePointAt(3));
		int capacidad = nombre.capacity();
		System.out.println(capacidad);
		System.out.println(nombre);
		System.out.println(nombre.lastIndexOf("r"));
		
		
		
	}

}
