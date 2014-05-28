package ejemplos;

import java.util.*;


public class Listas2 {

	public static void main(String[] args) {

		ArrayList<String> c = new ArrayList<String>();
		String cadena = "ASIR";
		c.add("DAW");
		c.add("DAM");
		c.add(cadena);
		c.ensureCapacity(1000); //asegurar capacidad de 1000 en memoria
		
		c.add(2,"Inserción");
		c.set(0, "Cadena distinta");
		//c.set(5, "Excepción")
		c.add(c.size(), "Inserción"); //igual que hacer c.add("Inserción")
		Collections.sort(c);
		
		System.out.println(c);
		

	}

}
