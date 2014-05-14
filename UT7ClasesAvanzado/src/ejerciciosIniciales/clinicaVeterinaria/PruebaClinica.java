package ejerciciosIniciales.clinicaVeterinaria;

import java.util.ArrayList;

public class PruebaClinica {
	
	private ArrayList<Perro> perros;
	private ArrayList<Gato> gatos;
	private ArrayList<Reptil> reptiles;
	private ArrayList<Pez> peces;
	private int chip;
	
	public PruebaClinica() {
		this.perros = new ArrayList<Perro>();
		this.gatos = new ArrayList<Gato>();
		this.reptiles = new ArrayList<Reptil>();
		this.peces = new ArrayList<Pez>();	
		this.chip = 0;
	}
		
	private void crear(){
		Menu menu = new Menu();
		boolean salir = false;
		try{
			menu.a�adirOpcion("Perro.");
			menu.a�adirOpcion("Gato.");
			menu.a�adirOpcion("Reptil.");
			menu.a�adirOpcion("Pez.");
			menu.a�adirOpcion("Salir.");			
		}catch(MaxOpcionesSuperado mos){
			mos.printStackTrace();
		}
		
		do {
			
			switch(menu.mostrarMenu("CREAR ANIMAL")) {
				
				case 1: 
						this.perros.add(crearPerro());
						System.out.println("Tama�o lista: " + this.perros.size());
						System.out.println(this.perros);
						
						break;				
				case 2: 
						this.gatos.add(crearGato());											
						break;
				case 3: 
						this.reptiles.add(crearReptil());											
						break;
				case 4: 
						this.peces.add(crearPez());											
						break;
				case 5: for(int i=0; i < this.perros.size(); ++i) 
							System.out.printf("Chip perro n� %d: %s\n", (i+1), this.perros.get(i).getChip());	
						
						salir = true;						
			}			
			
		} while(!salir);
	}
	
	private Perro crearPerro(){
		
		Perro perro = new Perro();
		perro.setChip(String.valueOf(++this.chip));
		return perro;
		
	}
	
	private Gato crearGato(){
		
		Gato gato = new Gato();
		return gato;
		
	}
	
	private Reptil crearReptil(){
		
		Reptil reptil = new Reptil();
		return reptil;
		
	}
	
	private Pez crearPez(){
		
		Pez pez = new Pez();
		return pez;
		
	}

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		PruebaClinica clinica = new PruebaClinica();
		boolean salir = false;
		try{
			menu.a�adirOpcion("Crear.");
			menu.a�adirOpcion("Borrar.");
			menu.a�adirOpcion("Salir.");			
		}catch(MaxOpcionesSuperado mos){
			mos.printStackTrace();
		}
		
		do {
			
			switch(menu.mostrarMenu("CLINICA VETERINARIA")) {
				
				case 1: clinica.crear();						
						break;				
				//case 2: clinica.borrar();						
						//break;
				case 3: salir = true;						
			}			
			
		} while(!salir);

	}

}
