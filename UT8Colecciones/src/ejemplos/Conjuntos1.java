package ejemplos;

import java.util.*;

public class Conjuntos1 {

	public static void main(String[] args) {

		HashSet<String> miscadenas = new HashSet<String>();
		miscadenas.add("DAW");
		miscadenas.add("ASIR");
		
		System.out.println(miscadenas);
		
		if(miscadenas.contains("DAW"))
			System.out.println("DAW es un ciclo");
		miscadenas.add("DAW");
		System.out.println(miscadenas);
		
		Iterator<String> it = miscadenas.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
