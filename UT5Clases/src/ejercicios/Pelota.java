package ejercicios;


import graphics2.*;

public class Pelota {	
	
	private double diametro;
	private Color color;
	private double x;
	private double y;
	private int velocidad;
	private double direccion;
	private Ellipse pelota;
	


	public Pelota( Recinto recinto ) {
		
		setDiametro((double)1/3*recinto.ladoCorto());
		setX(recinto.getX() + recinto.getAncho()/2 - getDiametro()/2);
		setY(recinto.getY() + recinto.getAlto()/2 - getDiametro()/2);
		setDiametro((double)1/6*recinto.ladoCorto());
		setColor(color());
		setVelocidad(1);
		setDireccion(Math.random()*2*Math.PI);
		pelota = new Ellipse(getX(),getY(),getDiametro(),getDiametro());		
				
	}
	
	public void dibujar() {		
		
		pelota.setColor(color);		
		pelota.fill();
		
	}
	
	public void cambiarDireccion (Recinto recinto) {
		
		if (limiteInf(recinto)) setDireccion(anguloRebote()[0]);
		else if (limiteSup(recinto)) setDireccion(anguloRebote()[3]);
		else if (limiteDcho(recinto)) setDireccion(anguloRebote()[1]);
		else if (limiteIzq(recinto)) setDireccion(anguloRebote()[2]);
		
	}
	
	public void mover(Recinto recinto) throws InterruptedException {
		
		Thread.sleep(getVelocidad());
		pelota.translate(Math.cos(getDireccion()), Math.sin(getDireccion()));
		this.setX(pelota.getX());
		this.setY(pelota.getY());
		cambiarDireccion(recinto);
		
	}
	
	public Color color() {		
		
		int rojo = (int)(Math.random() * 256);
		int verde = (int)(Math.random() * 256);
		int azul = (int)(Math.random() * 256);			
		
		Color colorPelota = new Color( rojo, verde, azul );
		
		return colorPelota;
		
	}
	
	//METODO POR DESARROLLAR
	
	/*public void choque(Pelota pelota1, Pelota pelota2) {
		
		double distanciaMinimaEntrePelotas = (pelota1.getDiametro() + pelota2.getDiametro())/2;
		double distanciaActualEntrePelotas = Math.sqrt((Math.pow((pelota1.getX() - pelota2.getX()), 2) +
				Math.pow((pelota1.getY() - pelota2.getY()), 2)));
		if(distanciaMinimaEntrePelotas < distanciaActualEntrePelotas) {
			
			
			
		}
				
		
	}*/
	
	public boolean limiteDcho(Recinto recinto) {
		if(getX() + getDiametro() >= recinto.getX() + recinto.getAncho())
			return true;
		else
			return false;
	}
	
	public boolean limiteIzq(Recinto recinto) {
		if(getX() <= recinto.getX())
			return true;
		else
			return false;
	}
	
	public boolean limiteSup(Recinto recinto) {
		if(getY() <= recinto.getY())
			return true;
		else
			return false;
	}
	
	public boolean limiteInf(Recinto recinto) {
		if(getY() + getDiametro() >= recinto.getY() + recinto.getAlto())
			return true;
		else
			return false;
	}
	
	public int getCuadrante() {
		
		int respuesta = 0;
		if (Math.sin(getDireccion()) > 0 && Math.cos(getDireccion()) > 0) respuesta = 1;
		else if (Math.sin(getDireccion()) > 0 && Math.cos(getDireccion()) < 0) respuesta = 2;
		else if (Math.sin(getDireccion()) < 0 && Math.cos(getDireccion()) < 0) respuesta = 3;
		else if (Math.sin(getDireccion()) < 0 && Math.cos(getDireccion()) > 0) respuesta = 4;
		return respuesta;		
	}
	
	public double[] anguloRebote() {
		
		double[] angulo = new double[4];
		
		switch (getCuadrante()) {
		case 1: angulo[0] = (double)2*Math.PI - getDireccion();
				angulo[1] = (double)Math.PI - getDireccion();
				break;
		case 2: angulo[0] = (double)2*Math.PI - getDireccion();
				angulo[2] = (double)Math.PI - getDireccion();
				break;
		case 3: angulo[2] = (double)Math.PI - getDireccion(); 
				angulo[3] = (double)2*Math.PI - getDireccion();
				break;
		case 4: angulo[1] = (double)Math.PI - getDireccion(); 
				angulo[3] = (double)2*Math.PI - getDireccion();
				break;
		
		}		
		
		return angulo;
	}
	
	public double getDiametro() {
		return diametro;
	}
	
	public void setDiametro(double radio) {
		this.diametro = radio;
	}

	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public double getDireccion() {
		return direccion;
	}
	
	public void setDireccion(double direccion) {
		this.direccion = direccion;
	}

}
