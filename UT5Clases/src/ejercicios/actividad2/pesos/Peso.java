package ejercicios.actividad2.pesos;

/* 
 * Para la realización del ejercicio toma como referencia los siguientes datos: 
 * 1 Libra = 16 onzas = 453,59 gramos. 
 * 1 Lingote = 32,17 libras = 14,59 kg. 
 * 1 Onza = 0,0625 libras = 28,35 gramos. 
 * 1 Penique = 0,05 onzas = 1,55 gramos. 
 * 1 Quintal = 100 libras = 43,3 kg.
 * 
 */

public class Peso {
	
	private double peso; //siempre guardamos en libras.
	private final double LIBRAS_ONZAS = 16;
	private final double LIBRAS_GRAMOS = 453.59;
	private final double LIBRAS_KILOGRAMOS = 0.45359;
	private final double LIBRAS_LINGOTES = 0.031085;
	private final double LIBRAS_PENIQUES = 320;
	private final double LIBRAS_QUINTALES = 0.01;	
	
	public Peso ( double peso, String unidadDeMedida ) {		
		
		this.peso = peso / factor(unidadDeMedida);
		
	}
	
	private double factor(String unidadDeMedida) {
		
		double factor = 1;
		
		switch (unidadDeMedida.toLowerCase()) {
		
		case "lb":
			factor = 1;
			break;
		case "li":
			factor = LIBRAS_LINGOTES;
			break;
		case "oz":
			factor = LIBRAS_ONZAS;
			break;
		case "p":
			factor = LIBRAS_PENIQUES;
			break;
		case "k":
			factor = LIBRAS_KILOGRAMOS;
			break;
		case "g":
			factor = LIBRAS_GRAMOS;
			break;
		case "q":
			factor = LIBRAS_QUINTALES;
			break;
		default:
			System.out.println("No se ha introducido un valor correcto");
	    }
		
		return factor;
	}
	
	public double getLibras() {
		
		return peso;
	}
	
	public double getLingotes() {
		
		return peso * LIBRAS_LINGOTES;
	}
	
	public double getPeso( String unidadDeMedida ) {
		
		return this.peso * factor(unidadDeMedida);
		
	}

}
