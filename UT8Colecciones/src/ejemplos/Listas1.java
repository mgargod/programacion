package ejemplos;

import java.util.*;


public class Listas1 {

	public static void main(String[] args) {

		List<String> c = new ArrayList<String>();
		String cadena = "ASIR";
		c.add("DAW");
		c.add("DAM");
		c.add(cadena);
		
		c.add(2,"Inserci�n");
		c.set(0, "Cadena distinta");
		//c.set(5, "Excepci�n")
		c.add(c.size(), "Inserci�n"); //igual que hacer c.add("Inserci�n")
		System.out.println(c);
	}

}
