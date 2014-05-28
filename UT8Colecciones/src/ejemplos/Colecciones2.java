package ejemplos;

import java.util.*;

public class Colecciones2 {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<String>();
		String cadena = "ASIR";
		c.add("Hola");
		c.add("Miguel");
		c.add(cadena);
		System.out.println(c);
		for(String s : c)
			System.out.println(s);
		System.out.println(c.size());
		c.remove("Miguel");
		System.out.println(c.size());	

	}

}
