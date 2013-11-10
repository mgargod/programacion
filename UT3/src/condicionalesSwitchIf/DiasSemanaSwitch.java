package condicionalesSwitchIf;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA UN NUMERO ENTERO
//DEL 1 AL 7 Y MUESTRA SU CORRESPONDENCIA CON EL DIA DE LA SEMANA
//LUNES, MARTES, MIERCOLES...
//SE UTILIZA LA ESTRUCTURA SWITCH-CASE

//AUTOR: Miguel Ángel García Godoy
//FECHA: 7/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class DiasSemanaSwitch {

	public static void main(String[] args) {
		
		int numeroDia;
		String mensaje = "";

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escriba el número del día de la semana (1-7): ");
		numeroDia = teclado.nextInt();
		teclado.close();
		
		switch ( numeroDia ) {
		
		case 1:
			mensaje = "Lunes";
			break;
		case 2:
			mensaje = "Martes";
			break;
		case 3:
			mensaje = "Miércoles";
			break;
		case 4:
			mensaje = "Jueves";
			break;
		case 5:
			mensaje = "Viernes";
			break;
		case 6:
			mensaje = "Sábado";
			break;
		case 7:
			mensaje = "Domingo";
			break;
		default:
			mensaje = "No ha introducido ningún número entre el 1 y el 7";
			break;
		
		}
		
		System.out.println( mensaje );
		
	}

}

