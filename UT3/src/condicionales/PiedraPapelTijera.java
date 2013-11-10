package condicionales;

//ESTA APLICACION SIMULA EL JUEGO TRADICIONAL DE
//"PIEDRA"-"PAPEL"-"TIJERA" ENTRE EL USUARIO Y EL  
//ORDENADOR. SE PIDE AL USUARIO QUE ESCRIBA UNA DE
//LAS PALABRAS,  MIENTRAS QUE EL ORDENADOR GENERA
//LA SUYA ALEATORIAMENTE. SE MUESTRA LA PALABRA 
//CORRESPONDIENTE DE CADA JUGADOR, Y EL RESULTADO
//DEL JUEGO CON RESPECTO AL USUARIO
//UTILIZA ESTRUCTURAS SWITCH-CASE, IF

//AUTOR: Miguel Ángel García Godoy
//FECHA: 10/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {

		String palabraUser = null;
		int numeroComputer;
		String palabraComputer = null;
		String mensaje = "No ha introducido la palabra correctamente. Vuelva a escribir "
							+ "\"piedra\", \"papel\" o \"tijera\" correctamente.";
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.print( "Introduzca \"piedra\", \"papel\" o \"tijera\": ");
		palabraUser = teclado.next();
		palabraUser = palabraUser.toLowerCase();
		
		teclado.close();
		
		numeroComputer = aleatorio( 1, 3);
				
		
		
		switch ( numeroComputer ) {
		
		case 1:
			
			palabraComputer = "piedra";
			break;
		
		case 2:
			
			palabraComputer = "papel";
			break;
			
		case 3:
			
			palabraComputer = "tijera";
			break;
			
		default:
			
			System.out.println( "Ha habido un error al obtener la palabra aleatoria." );
			break;
			
		}
		
		
		
		if ( palabraUser.equals("piedra") && numeroComputer == 1 ) {
			
			mensaje = "Empate";
		
		}
		
		if ( palabraUser.equals("piedra") && numeroComputer == 2 ) {
			
			mensaje = "Has perdido";
		
		}
		
		if ( palabraUser.equals("piedra") && numeroComputer == 3 ) {
			
			mensaje = "Has ganado";
		
		}
		
		if ( palabraUser.equals("papel") && numeroComputer == 1 ) {
			
			mensaje = "Has ganado";
		
		}
		
		if ( palabraUser.equals("papel") && numeroComputer == 2 ) {
			
			mensaje = "Empate";
		
		}
		
		if ( palabraUser.equals("papel") && numeroComputer == 3 ) {
			
			mensaje = "Has perdido";
		
		}
		
		if ( palabraUser.equals("tijera") && numeroComputer == 1 ) {
			
			mensaje = "Has perdido";
		
		}
		
		if ( palabraUser.equals("tijera") && numeroComputer == 2 ) {
			
			mensaje = "Has ganado";
		
		}
		
		if ( palabraUser.equals("tijera") && numeroComputer == 3 ) {
			
			mensaje = "Empate";
		
		}
		
		
		System.out.println( "Usuario: " + palabraUser );
		System.out.println( "Ordenador: " + palabraComputer );
		System.out.println( mensaje ); 

	}
	
	public static int aleatorio( int desde, int hasta ) {
		
		int base = desde;
		int rango = hasta;
		
		return (int)(Math.random() * rango + base);
		
	}

}
