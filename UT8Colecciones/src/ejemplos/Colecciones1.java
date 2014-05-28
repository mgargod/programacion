package ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Colecciones1 {

	public static void main(String[] args) {

		Collection colec = new ArrayList();
		
		for(int i=0; i < 10; ++i)
			//colec.add(new Integer(i)); --> Está guardando un objeto
			colec.add(i);
		
		//System.out.println(colec); --> Una forma de hacerlo
		for( Object i : colec)
			System.out.println(i);
		
		Iterator it = colec.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}			
	}
}
