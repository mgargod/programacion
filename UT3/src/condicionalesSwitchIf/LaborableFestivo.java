package condicionalesSwitchIf;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA UN NUMERO
//ENTERO DEL 1 AL 7 Y MUESTRA SI SE CORRESPONDE CON UN
//DIA LABORABLE O FESTIVO
//UTILIZA ESTRUCTURA SWITCH-CASE

//AUTOR: Miguel Ángel García Godoy
//FECHA: 8/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class LaborableFestivo {
	
	public static void main(String[] args) {
		
		int numeroDia;
		String mensaje = "";

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escriba el número del día de la semana (1-7): ");
		numeroDia = teclado.nextInt();
		teclado.close();
		
		switch ( numeroDia ){
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			mensaje = "Laborable";
			break;
		case 7:
			mensaje = "Festivo";
			break;
		default:
			mensaje = "No ha introducido ningún número entre el 1 y el 7";
			break;
			
		}
		
		System.out.println( mensaje );
	}
}

