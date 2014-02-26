package ejercicios.actividad4;

/*
Ejercicio 2 Añade los métodos tick, incrementarMinuto e incrementarHora 
que incrementan la hora en 1 segundo, 1 minuto y 1 hora respectivamente.
Crea un programa que prueba el funcionamiento de estos métodos. 
Has de asegurarte de que funcionan bien los siguientes casos:

a. incremento al siguiente minuto, 
b. incremento a la siguiente hora, 
c. incremento al siguiente día.
 */

public class Hora2 extends Hora{
		
	public Hora2() {
		
		super();
	}
	
	public Hora2(int hora, int minutos, int segundos) {
		
		super(hora, minutos, segundos);
		
	}
	
	public void tick() {
		
		this.setSegundos(this.getSegundos() + 1);
	}
	
	public void incrementarMinuto() {
		
		this.setMinutos(this.getMinutos() + 1);
	}
	
	public void incrementarHora() {
		
		this.setHora(this.getHora() + 1);
	}
	
}
