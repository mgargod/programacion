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
		
		switch (unidadDeMedida.toLowerCase()) {
		
		case "lb":
			this.peso = peso;
			break;
		case "li":
			this.peso = peso / LIBRAS_LINGOTES;
			break;
		case "oz":
			this.peso = peso / LIBRAS_ONZAS;
			break;
		case "p":
			this.peso = peso / LIBRAS_PENIQUES;
			break;
		case "k":
			this.peso = peso / LIBRAS_KILOGRAMOS;
			break;
		case "g":
			this.peso = peso / LIBRAS_GRAMOS;
			break;
		case "q":
			this.peso = peso / LIBRAS_QUINTALES;
			break;
		default:
			System.out.println("No se ha introducido un valor correcto");		
		
		}			
		
	}
	
	public double getLibras() {
		
		return peso;
	}
	
	public double getLingotes() {
		
		return peso * LIBRAS_LINGOTES;
	}
	
	public double getPeso( String unidadDeMedida ) {
		
		switch (unidadDeMedida.toLowerCase()) {
		
			case "lb":
				return peso;				
			case "li":
				return peso * LIBRAS_LINGOTES;				
			case "oz":
				return peso * LIBRAS_ONZAS;
			case "p":
				return peso * LIBRAS_PENIQUES;				
			case "k":
				return peso * LIBRAS_KILOGRAMOS;				
			case "g":
				return peso * LIBRAS_GRAMOS;				
			case "q":
				return peso * LIBRAS_QUINTALES;				
			default:
				return -1;		
		}		
		
	}

}
