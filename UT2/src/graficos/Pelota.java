package graficos;

//ESTA APLICACION RECREA UNA PELOTA QUE REBOTA
//EN LOS BORDES DE LA PANTALLA Y TOMA UNA NUEVA
//DIRECCION ALEATORIA, CAMBIANDO TAMBIEN DE COLOR
//LOS BORDES DE LA PANTALLA SE CORRESPONDEN
//CON LOS DE UN RECTANGULO

//Se utilizan las librerías "Simple Java Graphics"
//de Mr.Cay S. Horstmann (http://horstmann.com/sjsu/graphics/)
//a quien desde aquí agradezco su valioso trabajo

//AUTOR: Miguel Ángel García Godoy
//FECHA: 24/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Pelota {

	public static void main(String[] args) throws InterruptedException {
		
		//GEOMETRIA
		
		final int ANCHO_PANTALLA = 500;
		final int ALTO_PANTALLA = 500;
		final int DIAMETRO_PELOTA = 40;
		final int ORIGEN_X = ANCHO_PANTALLA / 2 - DIAMETRO_PELOTA / 2;
		final int ORIGEN_Y = ALTO_PANTALLA / 2 - DIAMETRO_PELOTA / 2;
		
		//INTERVALO TEMPORAL PARA MOVIMIENTO
		
		final int INTERVALO = 2;
		
		//CONDICIONES PELOTA-PANTALLA
		
		boolean pelotaDcha = false;
		boolean pelotaArriba = false;
		boolean pelotaIzq = false;
		boolean pelotaAbajo = false;
		
		//DIRECCIONES ALEATORIAS INICIALES
		
		double direccionX = Math.random();
		double direccionY = Math.random();
		int signo[] = { -1, 1 }; //Para evitar que cuando toque borde vaya a un cuadrante que esté fuera 
		int indiceX = (int)(Math.random() * 2); //Devuelve 0 ó 1
		int indiceY = (int)(Math.random() * 2);
		
		//OBJETO PANTALLA (RECTANGULO)		

		Rectangle pantalla = new Rectangle( 0, 0, ANCHO_PANTALLA, ALTO_PANTALLA );
		pantalla.draw();
		
		//OBJETO PELOTA (CIRCULO)
		
		Ellipse pelota = new Ellipse( ORIGEN_X, ORIGEN_Y, DIAMETRO_PELOTA, DIAMETRO_PELOTA );
		pelota.setColor(colorear());
		pelota.fill();
		
		//BUCLE "WHILE" PARA MOVIMIENTO		
		
		while ( !pelotaAbajo || !pelotaArriba || !pelotaIzq || !pelotaDcha ){
			
			//CONDICIONES GEOMETRICAS PELOTA<--->PANTALLA			
			
			pelotaDcha = (pelota.getX() + pelota.getWidth() == pantalla.getWidth());
			pelotaArriba = (pelota.getY() == pantalla.getY());
			pelotaIzq = (pelota.getX() == pantalla.getX());
			pelotaAbajo = (pelota.getY() + pelota.getHeight() == pantalla.getHeight());
			
			//MOVIMIENTO DE LA PELOTA
			
			Thread.sleep(INTERVALO); //Intervalo temporal			
			pelota.translate(direccionX * signo[indiceX], direccionY * signo[indiceY]);
			
			//EVENTOS DE LA PELOTA
			
			if (pelotaDcha) { //Cuando la pelota toca la parte derecha de la pantalla
				
				direccionX = Math.random();
				direccionY = Math.random();				
				indiceX = 0; //X negativa
				indiceY = (int)(Math.random() * 2); //Y positiva o negativa
				pelota.translate(direccionX * signo[indiceX], direccionY * signo[indiceY]);
				pelota.setColor(colorear());				
				
			} else if (pelotaArriba) { //Cuando la pelota toca la parte superior de la pantalla
				
				direccionX = Math.random();
				direccionY = Math.random();				
				indiceX = (int)(Math.random() * 2); //X positiva o negativa
				indiceY = 1; //Y positiva
				pelota.translate(direccionX * signo[indiceX], direccionY * signo[indiceY]);
				pelota.setColor(colorear());
				
			} else if (pelotaIzq) { //Cuando la pelota toca la parte izquierda de la pantalla
				
				direccionX = Math.random();
				direccionY = Math.random();				
				indiceX = 1; //X positiva
				indiceY = (int)(Math.random() * 2); //Y positiva o negativa
				pelota.translate(direccionX * signo[indiceX], direccionY * signo[indiceY]);
				pelota.setColor(colorear());
				
			} else if (pelotaAbajo) { //Cuando la pelota toca la parte inferior de la pantalla
				
				direccionX = Math.random();
				direccionY = Math.random();				
				indiceX = (int)(Math.random() * 2); //X positiva o negativa
				indiceY = 0; //Y negativa
				pelota.translate(direccionX * signo[indiceX], direccionY * signo[indiceY]);
				pelota.setColor(colorear());
				
			} //fin if
			
		} //fin while	

	} //fin main
	
	public static Color colorear() {
		
		//CREACION DE COLORES ALEATORIOS
		
		int rojo = (int)(Math.random() * 255);
		int verde = (int)(Math.random() * 255);
		int azul = (int)(Math.random() * 255);			
		
		Color colorPelota = new Color( rojo, verde, azul );
		
		return colorPelota;
		
	} //fin colorear
	
} //fin clase pelota
