package simulacro1;

public class Charcuteria {
	
	private Menu menu;
	private Numero numero;
	
	public Charcuteria() {
		
		this.menu = new Menu();
		this.numero = new Numero();
		
		this.menu.añadirOpcion("Coger Número");
		this.menu.añadirOpcion("Atender");
		this.menu.añadirOpcion("Ver cola");
		this.menu.añadirOpcion("Salir");
		
	}

	public static void main(String[] args) {

		Charcuteria charcuteria = new Charcuteria();
		
		boolean salida = false;

		while (!salida) {
			
			switch (charcuteria.menu.mostrarMenu("CHARCUTERIA DAW")) {
			
				case 1: charcuteria.numero.darNumero(); break;
				case 2: charcuteria.numero.atender(); break;
				case 3: charcuteria.numero.mostrarCola(); break;
				case 4: salida = true; break;			
			}			
		}
		
		System.out.println("===== GRACIAS POR SU VISITA =====");
	}

}
