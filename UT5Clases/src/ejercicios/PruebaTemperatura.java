package ejercicios;

public class PruebaTemperatura {

	public static void main(String[] args) {

		Temperatura temperatura1 = new Temperatura();
		Temperatura temperatura2 = new Temperatura();
		
		temperatura1.setCelsius(40);
		temperatura2.setFahrenheit(96.8f);
		
		System.out.println("Temperatura1 (Celsius): " + temperatura1.getCelsius());
		System.out.println("Temperatura1 (Fahrenheit): " + temperatura1.getFahrenheit());
		
		System.out.println("Temperatura2 (Celsius): " + temperatura2.getCelsius());
		System.out.println("Temperatura2 (Fahrenheit): " + temperatura2.getFahrenheit());
		
		//Uso de los métodos estáticos
		
		float temperatura3 = 96.8f; //Fahrenheit
		float temperatura4 = 40; //Celsius
		
		System.out.println("Temperatura3 (Celsius): " + Temperatura.fahrenheitToCelsius(temperatura3));
		System.out.println("Temperatura4 (Fahrenheit): " + Temperatura.celsiusToFahrenheit(temperatura4));
	}

}
