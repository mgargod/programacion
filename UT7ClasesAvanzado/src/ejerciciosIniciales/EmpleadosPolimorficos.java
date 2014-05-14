package ejerciciosIniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpleadosPolimorficos {

	public static void main(String[] args) {

		Empleado[] empleados = new Empleado[3];
		Scanner teclado = new Scanner(System.in);
		boolean continuar;
		for(int i=0; i<empleados.length; ++i) {
			do {
				
				continuar = true;
				
				System.out.print("Empleado Asalariado (pulse 1) - Empleado Por Horas (pulse 2): ");
				switch(teclado.nextInt()){
				case 1: empleados[i] = new EmpleadoAsalariado();
						do{							
							continuar = true;
							System.out.print("Introduzca sueldo: ");
							
							try {
								((EmpleadoAsalariado)empleados[i]).setSalarioSemanal(teclado.nextDouble());
								continuar = false;
							} catch (InputMismatchException e) {
								
								System.out.println("Debe introducir dígitos.");
								teclado.nextLine();
							}							
							
						} while(continuar);
						break;

				case 2: empleados[i] = new EmpleadoPorHoras();
						do{
							continuar = true;
							System.out.print("Introduzca precioHora y Horas: ");
							try {
								((EmpleadoPorHoras)empleados[i]).setPrecioHora(teclado.nextDouble());
								((EmpleadoPorHoras)empleados[i]).setHoras(teclado.nextInt());
								continuar = false;
							} catch (InputMismatchException e) {
								
								System.out.println("El precioHora sólo admite números. Las horas sólo números enteros.");
								teclado.nextLine();
							}							
							
						}while(continuar);
						break;

				default: System.out.println("Debe introducir 1 ó 2");
						 continuar = true; 				
				}
				
			} while(continuar);
		}
		
		System.out.println("=========== RESULTADOS ============");
		
		for(Empleado empleado : empleados) {
			System.out.println("Tipo de empleado: " + empleado.getClass().getSimpleName());
			System.out.printf("Salario: %.2f €.\n",empleado.calculaSalarioSemanal());
		}
		
		teclado.close();
	}

}
