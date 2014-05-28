package ejerciciosHerencia2;

public class Parada2 implements Valorable{
	
	private String nombreLugar;
	private int horaBajada;
	private int horaSalida;
	private int coste;
	
	public Parada2(String nombreLugar, int horaBajada, int horaSalida) {
	
		this.nombreLugar = nombreLugar;
		this.horaBajada = this.validarHora(horaBajada);
		this.horaSalida = this.validarHoraSalida(horaSalida);
		this.coste = 10;
	}

	public String getNombreLugar() {
		return nombreLugar;
	}

	public void setNombreLugar(String nombreLugar) {
		this.nombreLugar = nombreLugar;
	}

	public int getHoraBajada() {
		return horaBajada;
	}

	public void setHoraBajada(int horaBajada) {
		this.horaBajada = horaBajada;
	}

	public int getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}
	
	public String toString() {
		return String.format("Nombre del lugar: %s\nHora de bajada: %d\nHora de salida: %d\n", 
				              this.nombreLugar, this.horaBajada, this.horaSalida);				
	}
	
	private int validarHora(int hora)  throws IllegalArgumentException {

		if(hora < 0 || hora > 23)
			throw new IllegalArgumentException("Formato de hora incorrecto");
		else
			return hora;
	}
	
	private int validarHoraSalida(int hora) {
		int hora1 = validarHora(hora);
		if(hora1<=this.horaBajada)
			throw new IllegalArgumentException("La hora de salida ha de ser mayor que la de bajada.");
		else
			return hora1;
	}

	@Override
	public double coste() {
		return this.coste;
	}
	
	
	
	

}

