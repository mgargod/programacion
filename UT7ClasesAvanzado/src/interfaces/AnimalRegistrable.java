package interfaces;

public class AnimalRegistrable implements Registrable{
	
	public int registrar() {
		int numRegistro = (int)(Math.random()*1000);
		System.out.println("Registrado con el n�mero de registro: " + numRegistro);
		return numRegistro;
	}
}
