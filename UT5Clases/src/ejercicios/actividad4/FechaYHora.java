package ejercicios.actividad4;

/*

Ejercicio 4 Crea la clase FechaYHora. La clase utiliza la clase Hora definida en el ejercicio 1, 
y la clase Fecha del ejercicio anterior, ya que queremos que almacene tanto la fecha como la hora. 
Crea un nuevo método siguienteHora que incrementa la hora pero que también llame al métodosiguienteDía 
si es necesario porque se avanza un día. Crea el método aCadena (toString()) que muestre la fecha y 
la hora de forma conjunta. Escribe un programa que pruebe la nueva clase, especialmente el incremento 
de de hora que cambia el día.

*/

public class FechaYHora {
	
	private Fecha fecha;
	private Hora hora;
	
	public FechaYHora() {
		
		this.fecha = new Fecha(1,1,1);
		this.hora = new Hora(0,0,0);
	}
	
	public FechaYHora(int dia, int mes, int anio, int hora, int minutos, int segundos) {
		
		this.fecha = new Fecha(dia,mes,anio);
		this.hora = new Hora(hora,minutos,segundos);
	}
	
	public String toString() {
		
		return String.format("%s - %s", this.fecha, this.hora.aCadena());
	}
	
	public void siguienteHora() {
		
		if ( this.hora.getHora() == 23 ) {
			
			this.hora.setHora(0);
			this.fecha.siguienteDia();
		} else {
			
			this.hora.setHora(this.hora.getHora() + 1);
		}
	}
	

}
