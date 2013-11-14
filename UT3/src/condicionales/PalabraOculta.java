package condicionales;

//ESTA APLICACION PIDE AL USUARIO QUE ADIVINE LA PALABRA
//OCULTA, PREDEFINIDA EN LA CONSTANTE "OCULTA" 
//UTILIZA ESTRUCTURA IF-ELSE Y EL METODO "EQUALS" PARA
//COMPARAR OBJETOS (EN ESTE CASO DE LA CLASE STRING)

//AUTOR: Miguel Ángel García Godoy
//FECHA: 8/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class PalabraOculta {

	public static void main(String[] args) {

		
		String palabraUsuario;
		final String OCULTA = "magia";
		String mensaje = "";

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escriba la palabra oculta: ");
		palabraUsuario = teclado.next();
		teclado.close();
		
		if ( palabraUsuario.toLowerCase().equals(OCULTA) ){
			
			mensaje = "¡ENHORABUENA!, ha acertado la palabra oculta";
		
		}
		
		else {
			
			mensaje = "Ha fallado, inténtelo de nuevo";
		}
		
		System.out.println( mensaje );
		

	}

}
