package ejerciciosHerencia2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaAparato {
	

	//ATRIBUTOS
	
	private Aparato[] aparatos;
	private int contador;
	private static final int TAM_ALMACEN = 10;
	private Scanner teclado;
	
	/**
	 * CONSTRUCTOR.
	 */
	
	public PruebaAparato() {
		this.aparatos = new Aparato[TAM_ALMACEN];
		this.teclado = new Scanner(System.in);
	}
	
	//SERVICIOS
	
	/**
	 * METODO almacenVacio() --> Comprueba si hay stock.
	 * @return boolean (true / false)
	 */
	
	private boolean almacenVacio(){
		return (this.contador == 0) ? true : false;
	}
	
	/**
	 * METODO buscarPorNumSerie() --> Busca un producto por n�mero de serie
	 * @param numSerie : String (n�mero de serie)
	 * @return int (si no lo encuentra: -1; si lo encuentra: posici�n)
	 */
	
	private int buscarPorNumSerie (String numSerie){
		int porDefecto = -1;
		for(int i=0; i < this.contador; ++i){
			if(numSerie.equalsIgnoreCase(this.aparatos[i].getNumSerie())){
				porDefecto = i;
				i = this.contador;
			}
		}
		
		return porDefecto;
	}
	
	/**
	 * METODO comprar() --> Despliega un men� para elegir qu� producto comprar
	 */
	
	public void comprar() {
		
		Menu menu = new Menu();
		boolean salir = false;
		try {
			menu.a�adirOpcion("Smart Phone.");
			menu.a�adirOpcion("Tableta");
			menu.a�adirOpcion("Salir.");
		} catch (MaxOpcionesSuperado e) {			
			e.printStackTrace();
		}
		
		do {
			
			switch(menu.mostrarMenu("COMPRAR EL SIGUIENTE PRODUCTO")) {
				
				case 1: this.comprarSmartPhone();						
						break;				
				case 2: this.comprarTableta();						
						break;
				case 3: salir = true;						
			}			
			
		} while(!salir);
	}
	
	/**
	 * METODO comprarSmartPhone() --> Para comprar un Smart Phone
	 */
	
	private void comprarSmartPhone() {
		
		String numProducto;
		String numSerie;
		String nombre;
		String sistemaOperativo;
		double precioBase = 0.0;
		String tecnologia;
		boolean continuar;
		
		System.out.print("Introduzca N� de producto: ");
		numProducto = this.teclado.next();
		this.teclado.nextLine();
		do {
			continuar = false;
			System.out.print("Introduzca N� de serie: ");
			numSerie = this.teclado.next();
			this.teclado.nextLine();
			if(this.buscarPorNumSerie(numSerie)>=0){
				System.out.println("El N� de serie ya existe. Introduzca otro.");				
				continuar = true;
			}
			
		} while(continuar);
		
		System.out.print("Introduzca nombre del producto: ");
		nombre = this.teclado.nextLine();		
		
		System.out.print("Introduzca Sistema Operativo: ");
		sistemaOperativo = this.teclado.nextLine();
		
		
		do {
			continuar = false;
			System.out.print("Introduzca precio base: ");
			try{
				precioBase = this.teclado.nextDouble();
				this.teclado.nextLine();
			} catch (InputMismatchException ime) {
				System.out.println("Debe introducir d�gitos para el precio.");
				this.teclado.nextLine();
				continuar = true;
			}
			
		} while(continuar);	
		
		this.aparatos[this.contador] = new SmartPhone(numProducto,numSerie,nombre,sistemaOperativo,precioBase);				
			
		while (DeseaContinuar.deseaContinuar("�Desea introducir tecnolog�a [s/n]? ", "Debe introducir \"s\" o \"n\".")) {
			
			do {
				continuar = false;
				System.out.print("Introduzca tecnolog�a: ");
				tecnologia = this.teclado.next();			
				try {
					((SmartPhone)this.aparatos[this.contador]).addTecnologia(tecnologia);
				} catch (TecnologiaRepetidaException e) {
					
					System.out.println(e.getMessage());
					continuar = true;
					this.teclado.nextLine();
				}
				
			} while(continuar);
		}
		
		++this.contador;		
	}
	
	/**
	 * METODO comprarTableta() --> Para comprar una Tableta
	 */
	
	private void comprarTableta() {
		
		String numProducto;
		String numSerie;
		String nombre;
		String sistemaOperativo;
		double precioBase = 0.0;
		double pulgadas = 0.0;
		double peso = 0.0;
		boolean continuar;
		
		System.out.print("Introduzca N� de producto: ");
		numProducto = this.teclado.next();
		this.teclado.nextLine();
		do {
			continuar = false;
			System.out.print("Introduzca N� de serie: ");
			numSerie = this.teclado.next();
			this.teclado.nextLine();
			if(this.buscarPorNumSerie(numSerie)>=0){
				System.out.println("El N� de serie ya existe. Introduzca otro.");				
				continuar = true;
			}
			
		} while(continuar);
		
		System.out.print("Introduzca nombre del producto: ");
		nombre = this.teclado.nextLine();		
		
		System.out.print("Introduzca Sistema Operativo: ");
		sistemaOperativo = this.teclado.nextLine();
		
		do {
			continuar = false;
			System.out.print("Introduzca precio base: ");
			try{
				precioBase = this.teclado.nextDouble();				
			} catch (InputMismatchException ime) {
				System.out.println("Debe introducir d�gitos para el precio.");
				this.teclado.nextLine();
				continuar = true;
			}
			
		} while(continuar);
		
		do {
			continuar = false;
			System.out.print("Introduzca pulgadas: ");
			try{
				pulgadas = this.teclado.nextDouble();
				this.teclado.nextLine();
			} catch (InputMismatchException ime) {
				System.out.println("Debe introducir d�gitos para las pulgadas.");
				this.teclado.nextLine();
				continuar = true;
			}
			
		} while(continuar);
		
		do {
			continuar = false;
			System.out.print("Introduzca peso en gramos: ");
			try{
				peso = this.teclado.nextDouble();
				this.teclado.nextLine();
			} catch (InputMismatchException ime) {
				System.out.println("Debe introducir d�gitos para el peso.");
				this.teclado.nextLine();
				continuar = true;
			}
			
		} while(continuar);
		
		this.aparatos[this.contador] = new Tableta(numProducto,numSerie,nombre,sistemaOperativo,precioBase,pulgadas,peso);
		++this.contador;
	}
	
	/**
	 * METODO vender() --> Para vender un producto
	 */
	
	public void vender() {
		
		String numSerie;
		int posicion;
		
		if(this.almacenVacio())
			System.out.println("El almac�n est� vac�o.");
		else {
			System.out.print("Introduzca N� serie: ");
			numSerie = this.teclado.next();
			posicion = this.buscarPorNumSerie(numSerie);
			
			if(posicion >=0) {				
				System.out.println("===== DETALLE VENTA =====");
				System.out.println(this.aparatos[posicion]);
				System.out.printf("Total PVP con descuento: %.2f �.\n", this.aparatos[posicion].precioPVPRebajado(this.pedirDescuento()));
				this.aparatos[posicion] = this.aparatos[this.contador - 1];
				this.aparatos[this.contador - 1] = null;
				--this.contador;
			} else
				System.out.println("El producto no se encuentra en el almac�n.");
		}		
	}
	
	/**
	 * METODO pedirDescuento() --> Pide la introducci�n del descuento que se quiere aplicar
	 * @return int (el descuento -- si se quiere n%, introducir n)
	 */
	
	private int pedirDescuento() {
		
		int descuento = 0;
		boolean continuar;
		
		do {
			continuar = false;
			System.out.print("Introduzca descuento (tanto por ciento): ");
			try{
				descuento = this.teclado.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("Debe introducir d�gitos para el descuento.");
				this.teclado.nextLine();
				continuar = true;
			}
			
		} while(continuar);
		return descuento;
	}
	
	/**
	 * METODO mostrar() --> Para mostrar los detalles de un producto
	 */
	
	public void mostrar() {
		
		if(this.almacenVacio())
			System.out.println("El almac�n est� vac�o.");
		else {
			System.out.print("Introduzca N� serie: ");
			this.mostrarPorNumSerie(this.teclado.next());
		}
	}
	
	/**
	 * METODO mostrarPorNumSerie() --> Para mostrar los detalles de un producto dado su n�mero de serie
	 */
	
	private void mostrarPorNumSerie(String numSerie) {
		int posicion;
		System.out.println("======== DETALLE DE PRODUCTO =======");
		posicion = this.buscarPorNumSerie(numSerie);
		if(posicion >= 0) 
			System.out.println(this.aparatos[posicion]);
		else
			System.out.println("El producto no se encuentra en el almac�n.");		
	}
	
	/**
	 * METODO mostrarTodos() --> Para mostrar el listado de productos en stock
	 */
	
	public void mostrarTodos() {
		if(this.almacenVacio())
			System.out.println("El almac�n est� vac�o.");
		else {
			System.out.println("======= LISTADO DE PRODUCTOS EN STOCK =======");
			for(int i=0; i < this.contador; ++i){
				System.out.println("--- Producto " + (i+1) + " ---");
				System.out.println(this.aparatos[i]);
			}
		}
	}
	
	/**
	 * METODO main de la aplicaci�n --> Despliega el men� principal
	 * @param args
	 */

	public static void main(String[] args) {

		Menu menu = new Menu();
		PruebaAparato prueba = new PruebaAparato();
		boolean salir = false;
		try{
			menu.a�adirOpcion("Comprar.");
			menu.a�adirOpcion("Vender.");			
			menu.a�adirOpcion("Mostrar por N� serie.");
			menu.a�adirOpcion("Listado de productos en stock.");
			menu.a�adirOpcion("Salir.");
		}catch(MaxOpcionesSuperado mos){
			mos.printStackTrace();
		}
		
		do {
			
			switch(menu.mostrarMenu("TIENDA APARATOS TECNOL�GICOS")) {
				
				case 1: prueba.comprar();						
						break;				
				case 2: prueba.vender();						
						break;
				case 3: prueba.mostrar();
						break;
				case 4: prueba.mostrarTodos();
						break;
				case 5: salir = true;
						prueba.teclado.close();
			}			
			
		} while(!salir);		

	}

}
