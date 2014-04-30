package ejemplosString;

import java.util.Arrays;
import java.util.Scanner;

public class EjemplosString {

	public static void main(String[] args) {

		/*String cadena = "cadena";
		cadena = new String("otra cadena");
		
		//un String no se puede modificar, se crea un nuevo objeto
		cadena += " hola cadena";
		
		if (cadena.equals("otra cadena hola cadena"))
			System.out.println("Cadenas iguales");
		
		
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena);
		
		String nombre1 = "110", nombre2 = "115";
		System.out.println(nombre1.compareTo(nombre2));*/
		
		// Pedir el numero de nombres, leerlos de teclado y mostrarlos
		// por orden alfabetico.
		
		// Escribe un programa que pida una cadena. Posteriormente, el programa
		// dejara que el usuario inserte cinco subcadenas con el fin de informar
		// si la primera cadena empieza o termina por cada una de las cindo subcadenas.

		// Escribe un programa que pida una cadena. Posteriormente, el programa
		// dejara que el usuario inserte cinco subcadenas con el fin de informar si
		// la primera tiene las subcadenas indicadas. Se debe indicar en que
		// posicion se encontro y la ultima.
		
		// Escribe un programa que pida una cadena. Posteriormente, el programa dejara
		// que el usuario inserte varios caracteres hasta que inserte un asterisco, con
		// el fin de informar, para cada caracter, si la cadena lo contiene y en que
		// posicion esta el primero.
		
		//Primero
		
		Scanner teclado = new Scanner(System.in);
		/*int numero;
		String[] nombres;
		
		System.out.print("Número de nombres: ");
		numero = teclado.nextInt();
		nombres = new String[numero];
		teclado.nextLine();
		
		for(int i=0; i < nombres.length; ++i) {			
			System.out.print("Introduzca nombre: ");
			nombres[i]=teclado.nextLine();			
		}
		
		//Arrays.sort(nombres);
		
		//System.out.println(Arrays.toString(nombres));
		
		for(int i=0; i<nombres.length-1; ++i) {
			String menor;
			int posMenor;
			menor=nombres[i];
			posMenor=i;
			
			for(int j=i+1; j<nombres.length;++j) {
				if(menor.compareTo(nombres[j]) > 0) {
					menor=nombres[j];
					posMenor=j;
				}
			}
			
			String aux=nombres[i];
			nombres[i]=nombres[posMenor];
			nombres[posMenor]=aux;
			
		}
		
		System.out.println(Arrays.toString(nombres));*/
		
		//Segundo
		
		/*String cadena;
		System.out.print("Escriba una cadena: ");
		cadena = teclado.nextLine();
		
		String[] subcadenas = new String[5];
		
		for(int i=0; i < subcadenas.length; ++i) {			
			System.out.print("Introduzca subcadena: ");
			subcadenas[i]=teclado.nextLine();
			if(cadena.startsWith(subcadenas[i]) && cadena.endsWith(subcadenas[i]))
				System.out.println("La cadena comienza y termina por " + subcadenas[i]);
			else if(cadena.startsWith(subcadenas[i]))
				System.out.println("La cadena comienza por " + subcadenas[i]);
			else if(cadena.endsWith(subcadenas[i]))
				System.out.println("La cadena termina por " + subcadenas[i]);
			else
				System.out.println("La cadena ni comienza ni termina por " + subcadenas[i]);
		}*/
		
		//Tercero
		
		// Escribe un programa que pida una cadena. Posteriormente, el programa
		// dejara que el usuario inserte cinco subcadenas con el fin de informar si
		// la primera tiene las subcadenas indicadas. Se debe indicar en que
		// posicion se encontro y la ultima.	
		
		/*String cadena;
		System.out.print("Escriba una cadena: ");
		cadena = teclado.nextLine();
		
		String[] subcadenas = new String[5];
		
		for(int i=0; i < subcadenas.length; ++i) {			
			System.out.print("Introduzca subcadena: ");
			subcadenas[i]=teclado.nextLine();
			if(cadena.contains(subcadenas[i])) {
				System.out.println("La cadena contiene " + subcadenas[i]);
				System.out.println("La primera ocurrencia en la posición " + cadena.indexOf(subcadenas[i]));
				System.out.println("La última ocurrencia en la posición " + cadena.lastIndexOf(subcadenas[i]));
			} else 
				System.out.println("La cadena no contiene " + subcadenas[i]);
			
		}*/
		
		//Cuarto
		// Escribe un programa que pida una cadena. Posteriormente, el programa dejara
		// que el usuario inserte varios caracteres hasta que inserte un asterisco, con
		// el fin de informar, para cada caracter, si la cadena lo contiene y en que
		// posicion esta el primero.
		
		String cadena;
		System.out.print("Escriba una cadena: ");
		cadena = teclado.nextLine();
		String caracter = "";
		
		do {
			System.out.print("Inserte caracter: ");
			caracter = teclado.next();
			if(caracter.equals("*"))
				System.exit(0);
			if(cadena.contains(caracter)){
				System.out.println("La cadena contiene el carácter " + caracter);
				System.out.println("El primero se encuentra en la posición " + cadena.indexOf(caracter));
			} else
				System.out.println("La cadena no contiene el carácter " + caracter);
			
		} while(!caracter.equals("*"));
		
	}

}
