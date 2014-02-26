package ejercicios.actividad4;

/*
 * Ejercicio 1 Escribe una clase llamada Hora que tenga como atributos la hora, 
 * los minutos y los segundos (n�meros enteros). 
 * Un constructor inicializar� estos datos a 0 y otro los inicializar� a valores pasados por par�metro. 
 * Un m�todo de la clase devolver� la cadena con formato: 12:45:32.
 * Otro m�todo, que tendr� un argumento de tipo Hora, sumar� dicha hora a la propia. Por ejemplo:

[...]
mihora=new Hora(12,45,32);
unahoraycuarto=new Hora(1,15,0);
mihora.suma(unahoraycuarto);
System.out.println(mihora.aCadena());
[...]

14:00:32

Para probar la clase crea un main() con dos objetos inicializados a una hora determinada. 
Crea otro sin inicializar y s�male las dos anteriores. Visualiza el valor de las dos horas y el resultante.
 */

public class Hora {
	
	private int hora;
	private int minutos;
	private int segundos;
	
	public Hora() {
		
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Hora(int hora, int minutos, int segundos) {
		
		setHora(hora);
		setMinutos(minutos);
		setSegundos(segundos);
		
	}
	
	public String aCadena() {
		
		return String.format("%02d:%02d:%02d.", this.getHora(), this.getMinutos(), this.getSegundos());
	}
	
	public void suma ( Hora hora ) {
		
		this.setHora(this.getHora() + hora.getHora());
		this.setMinutos(this.getMinutos() + hora.getMinutos());
		this.setSegundos(this.getSegundos() + hora.getSegundos());
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = (hora < 23 ? hora : hora%24);
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos < 60) this.minutos = minutos;
		else {
			this.minutos = minutos%60;
			this.setHora(getHora() + 1);
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos < 60) this.segundos = segundos;
		else {
			this.segundos = segundos%60;
			this.setMinutos(getMinutos() + 1);
		}
	}
}
