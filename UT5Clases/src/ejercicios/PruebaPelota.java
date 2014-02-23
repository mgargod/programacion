package ejercicios;

public class PruebaPelota {

	public static void main(String[] args) throws InterruptedException {
		
		Recinto recinto = new Recinto(0,0,900,600);
		Pelota pelota = new Pelota(recinto);
		Pelota pelota2 = new Pelota(recinto);		
		
		recinto.dibujar();
		pelota.dibujar();
		pelota2.dibujar();		
				
		System.out.println(pelota.getDireccion());
		
		while(true){
			pelota.mover(recinto);
			pelota2.mover(recinto);
			
		}	

	}

}
