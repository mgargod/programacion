package buclesAnidados;

//ESTA APLICACION SIMULA EL JUEGO TRADICIONAL DE
//"PIEDRA"-"PAPEL"-"TIJERA" ENTRE EL USUARIO Y EL  
//ORDENADOR. SE PIDE AL USUARIO QUE ESCRIBA UNA DE
//LAS PALABRAS, Y SE VALIDA,  MIENTRAS QUE EL ORDENADOR GENERA
//LA SUYA ALEATORIAMENTE. SE MUESTRA LA PALABRA 
//CORRESPONDIENTE DE CADA JUGADOR, Y EL RESULTADO
//DEL JUEGO CON RESPECTO AL USUARIO
//SE DA LA OPCION DE JUGAR OTRA PARTIDA
//UTILIZA ESTRUCTURAS DO-WHILE SWITCH-CASE, IF-ELSE-IF-ELSE

//AUTOR: Miguel Ángel García Godoy
//FECHA: 10/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class PiedraPapelTijera2 {

	public static void main(String[] args) {

		String palabraUser = null;
		int numeroComputer;
		String palabraComputer = null;
		String mensaje = null;
		String respuesta = null;
		
		
		Scanner teclado = new Scanner(System.in);
		
		do {
		
			do {
			
				System.out.print( "Introduzca \"piedra\", \"papel\" o \"tijera\": ");
				palabraUser = teclado.next().toLowerCase();
			
			} while ( !( palabraUser.equals("piedra") || palabraUser.equals("papel") || 
					  palabraUser.equals("tijera") ) );			
						
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
			
			else if ( palabraUser.equals("piedra") && numeroComputer == 2 ) {
				
				mensaje = "Has perdido";
			
			}
			
			else if ( palabraUser.equals("piedra") && numeroComputer == 3 ) {
				
				mensaje = "Has ganado";
			
			}
			
			else if ( palabraUser.equals("papel") && numeroComputer == 1 ) {
				
				mensaje = "Has ganado";
			
			}
			
			else if ( palabraUser.equals("papel") && numeroComputer == 2 ) {
				
				mensaje = "Empate";
			
			}
			
			else if ( palabraUser.equals("papel") && numeroComputer == 3 ) {
				
				mensaje = "Has perdido";
			
			}
			
			else if ( palabraUser.equals("tijera") && numeroComputer == 1 ) {
				
				mensaje = "Has perdido";
			
			}
			
			else if ( palabraUser.equals("tijera") && numeroComputer == 2 ) {
				
				mensaje = "Has ganado";
			
			}
			
			else if ( palabraUser.equals("tijera") && numeroComputer == 3 ) {
				
				mensaje = "Empate";
			
			}
			
			else {
				
				mensaje = "Se ha producido un error interno";
			}
				
			System.out.println( "Usuario: " + palabraUser );
			System.out.println( "Ordenador: " + palabraComputer );
			System.out.println( mensaje );
			
			do {
				
				System.out.print( "\n¿Quiere intertar otro número [s/n]? ");
				respuesta = teclado.next().toLowerCase();
			
			} while ( !(respuesta.equals("s") || respuesta.equals("n") ) );
			
		} while ( respuesta.equals("s") );
		
		System.out.print( "\nGracias por participar y ¡hasta la próxima!" );
		
		teclado.close();

	}
	
	public static int aleatorio( int desde, int hasta ) {
		
		int base = desde;
		int rango = hasta;
		
		return (int)(Math.random() * rango + base);
		
	}

}
