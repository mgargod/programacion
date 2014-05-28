package interfaces.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banco {
	
	private Menu menu;
	Scanner teclado;
	
	public Banco() {
		
		this.menu = new Menu();
		teclado = new Scanner(System.in);
		
		try{
			menu.añadirOpcion("Mostrar datos de la cuenta.");
			menu.añadirOpcion("Consultar saldo.");			
			menu.añadirOpcion("Ingreso.");
			menu.añadirOpcion("Reintegro.");
			menu.añadirOpcion("Asignar tipo interés.");
			menu.añadirOpcion("Obtener intereses.");
			menu.añadirOpcion("Salir.");
		}catch(MaxOpcionesSuperado mos){
			mos.printStackTrace();
		}
	}
	
	private double pedirCantidad() {		
		double cantidad = 0.0;
		boolean continuar;
		do{
			continuar = false;
			System.out.print("Introduzca cantidad: ");
			try{
				cantidad = teclado.nextDouble();
				
			} catch(InputMismatchException ime) {
				continuar = true;
				System.out.println("Debe introducir una cantidad numérica.");
				teclado.nextLine();
			}
			
		} while(continuar);
		
		return cantidad;
	}
	
	private double pedirTipoInteres() {		
		double tipo = 0.0;
		boolean continuar;
		do{
			continuar = false;
			System.out.print("Introduzca tipo de interés: ");
			try{
				tipo = teclado.nextDouble();
				
			} catch(InputMismatchException ime) {
				continuar = true;
				System.out.println("Debe introducir una cantidad numérica.");
				teclado.nextLine();
			}
			
		} while(continuar);
		
		return tipo;
	}
	
	private int pedirDias() {		
		int dias = 0;
		boolean continuar;
		do{
			continuar = false;
			System.out.print("Introduzca el número de días: ");
			try{
				dias = teclado.nextInt();
				
			} catch(InputMismatchException ime) {
				continuar = true;
				System.out.println("Debe introducir una cantidad numérica entera.");
				teclado.nextLine();
			}
			
		} while(continuar);
		
		return dias;
	}

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		Cuenta cuenta = new Cuenta();
		boolean salir = false;
		cuenta.setNombre("Miguel Ángel García Godoy");
		cuenta.setNumero("12345678987654321234");
		

		do {
			
			switch(banco.menu.mostrarMenu("BANCA ONLINE")) {
				
				case 1: System.out.println(cuenta);						
						break;				
				case 2: System.out.printf("Saldo: %,.2f €.\n",cuenta.estado());						
						break;
				case 3: cuenta.ingreso(banco.pedirCantidad());
						break;
				case 4: cuenta.reintegro(banco.pedirCantidad());
						break;
				case 5: cuenta.asignarTipoInteres(banco.pedirTipoInteres());
						break;
				case 6: System.out.printf("Intereses: %,.2f €.\n",cuenta.intereses(banco.pedirDias()));
						break;						
				case 7: salir = true;
						banco.teclado.close();
			}			
			
		} while(!salir);		

	}	

}
