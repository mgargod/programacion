package condicionales;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA
//LA CAPACIDAD DEL DEPOSITO DE UN VEHICULO, EL  
//PORCENTAJE DE LLENADO DEL MISMO Y EL CONSUMO
//POR CADA 100 KM, Y MUESTRA LA AUTONOMIA Y UN
//MENSAJE DE ALERTA SI LA MISMA ES MENOR DE 30 KM
//UTILIZA ESTRUCTURA IF

//AUTOR: Miguel Ángel García Godoy
//FECHA: 8/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class AutonomiaCoche {

	public static void main(String[] args) {

		int capacidad; 
		double porcentaje; 
		double consumo; 
		double autonomia;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca la capacidad del depósito en litros: ");
		capacidad = teclado.nextInt();
		
		System.out.print("Introduzca el porcentaje de combustible actual: ");
		porcentaje = teclado.nextDouble() / 100;
		
		System.out.print("Introduzca el consumo (litros/100 Km): ");
		consumo = teclado.nextDouble();
		
		teclado.close();
		
		autonomia = capacidad * porcentaje * 100 / consumo;
		
		System.out.printf("Su autonomía es de %.0f kilómetros", autonomia );
		
		if ( autonomia < 30 ){
			
			System.out.print("\n¡¡¡¡¡REPOSTAR-REPOSTAR-REPOSTAR-REPOSTAR!!!!!");
					
		}
		
		

	}

}
