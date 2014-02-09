package ejercicios;

public class Temperatura {
	
	private float temperatura;
	
	public float getCelsius() {
		
		return temperatura;
	}
	
	public void setCelsius ( float grados ) {
		
		temperatura = grados;
	}
	
	public float getFahrenheit() {
		
		return temperatura * ((float)9 / 5) + 32;
	}
	
	public void setFahrenheit ( float grados ) {
		
		temperatura = ( grados - 32 ) * ((float)5 / 9);
	}
	
	public static float celsiusToFahrenheit ( float grados ) {
		
		return grados * ((float)9 / 5) + 32;
	}
	
	public static float fahrenheitToCelsius ( float grados ) {
		
		return ( grados - 32 ) * ((float)5 / 9);
	}

}
