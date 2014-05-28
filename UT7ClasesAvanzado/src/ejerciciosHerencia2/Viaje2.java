package ejerciciosHerencia2;

public class Viaje2 implements Valorable {
	
	private String codViaje;
	private String nombre;
	private int horaSalida;
	private int horaRegreso;
	private Parada2[] paradas;
	private int numParadas;
	private int contParadas;
	
	public Viaje2(){
		
	}
	
	public Viaje2(String codViaje,String nombre, int horaSalida, int horaRegreso, int numParadas) 
	             throws IllegalArgumentException {
		
		this.codViaje = codViaje;
		this.nombre = nombre;
		this.horaSalida = this.validarHora(horaSalida);
		this.horaRegreso = this.validarHoraRegreso(horaRegreso);
		this.numParadas = numParadas;
		this.paradas = new Parada2[this.numParadas];
		this.contParadas = 0;
	}
	
	
	
	public String getCodViaje() {
		return codViaje;
	}

	public void setCodViaje(String codViaje) {
		this.codViaje = codViaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}

	public int getHoraRegreso() {
		return horaRegreso;
	}

	public void setHoraRegreso(int horaRegreso) {
		this.horaRegreso = horaRegreso;
	}

	public Parada2[] getParadas() {
		return paradas;
	}

	public void setParadas(Parada2[] paradas) {
		this.paradas = paradas;
	}

	public int getNumParadas() {
		return numParadas;
	}

	public void setNumParadas(int numParadas) {
		this.numParadas = numParadas;
	}

	public int getContParadas() {
		return contParadas;
	}

	public void setContParadas(int contParadas) {
		this.contParadas = contParadas;
	}

	private int validarHora(int hora)  throws IllegalArgumentException {

		if(hora < 0 || hora > 23)
			throw new IllegalArgumentException("Formato de hora incorrecto");
		else
			return hora;
	}
	
	private int validarHoraRegreso(int hora) {
		int hora1 = validarHora(hora);
		if(hora1<=this.horaSalida)
			throw new IllegalArgumentException("La hora de regreso ha de ser mayor que la de salida.");
		else
			return hora1;
	}
	
	private boolean paradasLLeno() {
		return (this.paradas.length == this.contParadas) ? true : false;
	}
	
	private boolean paradasVacio() {
		return (this.contParadas == 0) ? true : false;
	}
	
	private boolean paradaRepetida(String lugar) {
		boolean repetida = false;
		for(int i=0; i < this.contParadas; ++i) {
			if(this.paradas[i].getNombreLugar().equalsIgnoreCase(lugar)) {
				repetida = true;
				i = this.contParadas;
			}			
		}
		
		return repetida;		
	}
	
	private int buscarParada (String lugar){
		int porDefecto = -1;
		for(int i=0; i < this.contParadas; ++i){
			if(this.paradas[i].getNombreLugar().equalsIgnoreCase(lugar)){
				porDefecto = i;
				i = this.contParadas;
			}
		}
		
		return porDefecto;
	}
	
	public double coste(){
		double precio = 0;
		precio = (this.horaRegreso - this.horaSalida) * 50;
		if(!this.paradasVacio())
			for(int i=0; i < this.contParadas; ++i) {
				precio+=this.paradas[i].coste();
			}
		
		return precio;
	}
	
	public void addParada(Parada2 p) {		
		int horaB = p.getHoraBajada();
		int horaS = p.getHoraSalida();
		if(this.paradasLLeno())
			System.out.println("No se pudo añadir la parada \"" + p.getNombreLugar() + "\". El número de paradas está cerrado a " + this.contParadas + ".");
		else if(this.paradaRepetida(p.getNombreLugar()))
			System.out.println("La parada está ya incluida.");
		else if(horaB < this.horaSalida || horaB > this.horaRegreso)
			System.out.println("Hora de bajada incompatible con las horas de salida-regreso del viaje.");
		else if(horaS < this.horaSalida || horaS > this.horaRegreso || horaS < horaB)
			System.out.println("Hora de salida incompatible con las horas de salida-regreso del viaje o la hora de bajada de la parada.");
		else
			this.paradas[this.contParadas++] = p;
		
	}
	
	public void quitarParada(Parada p) {
		int posicion = this.buscarParada(p.getNombreLugar());
		if(this.paradasVacio())
			System.out.println("No hay paradas para eliminar.");
		else if(posicion<0)
			System.out.println("No existen paradas con ese nombre.");
		else {
			this.paradas[posicion] = this.paradas[this.contParadas - 1];
			this.paradas[this.contParadas - 1] = null;
			--this.contParadas;
		}	
	}
	
	private String mostrarParadas(){
		String paradas = "";
		
		if(this.paradasVacio())
			paradas = "No hay paradas.";
		else 			
			for(int i=0; i < this.contParadas; ++i)
				paradas += "Parada nº " + (i+1) + ":\n" + this.paradas[i];		
		return paradas;
	}
	
	public String toString() {
		return String.format("===== DETALLES VIAJE =====\nCódigo: %s\nNombre: %s\nHora Salida: %d\nHora Regreso: %d\nCoste del viaje: %.2f €.\n===== PARADAS ======\n%s", 
				              this.codViaje,this.nombre,this.horaSalida,this.horaRegreso,this.coste(),this.mostrarParadas());
	}
	
	
	public static void main(String[] args) {
		Viaje viaje = new Viaje("01","Toledo-Madrid",12,23,3);		
		Parada p1 = new ParadaLibre("Olías del Rey",13,14);
		Parada p2 = new ParadaLibre("Illescas", 15, 16);
		Parada p3 = new ParadaActividad("Parla",17,19,"Visita museo urbano",25);
		viaje.addParada(p1);
		viaje.addParada(p2);
		viaje.addParada(p3);
		System.out.println(viaje);	
		
	}
}
