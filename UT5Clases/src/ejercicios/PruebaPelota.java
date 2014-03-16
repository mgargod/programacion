package ejercicios;

public class PruebaPelota {

	public static void main(String[] args) throws InterruptedException {
		
		Recinto recinto = new Recinto(0,0,900,600);
		Pelota pelota = new Pelota(recinto);
		Pelota pelota2 = new Pelota(recinto);
		Pelota pelota3 = new Pelota(recinto);
		Pelota pelota4 = new Pelota(recinto);
		Pelota pelota5 = new Pelota(recinto);
		Pelota pelota6 = new Pelota(recinto);
		
		recinto.dibujar();
		pelota.dibujar();
		pelota2.dibujar();
		pelota3.dibujar();
		pelota4.dibujar();
		pelota5.dibujar();
		pelota6.dibujar();
				
		System.out.println(pelota.getDireccion());
		
		while(true){
			pelota.mover(recinto);
			pelota2.mover(recinto);
			pelota3.mover(recinto);
			pelota4.mover(recinto);
			pelota5.mover(recinto);
			pelota6.mover(recinto);
			
		}	

	}

}
