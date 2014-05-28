package ejemplos;

import java.util.*;


public class Listas1 {

	public static void main(String[] args) {

		List<String> c = new ArrayList<String>();
		String cadena = "ASIR";
		c.add("DAW");
		c.add("DAM");
		c.add(cadena);
		
		c.add(2,"Inserción");
		c.set(0, "Cadena distinta");
		//c.set(5, "Excepción")
		c.add(c.size(), "Inserción"); //igual que hacer c.add("Inserción")
		System.out.println(c);
	}

}
