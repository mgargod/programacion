package graficos;

//ESTA CLASE ES UTILIZADA EN LA CLASE "Coche" QUE ES LA QUE
//CONTIENE EL MAIN DE LA APLICACIÓN
//EL OBJETIVO ERA AGRUPAR TODAS LAS PARTES DEL COCHE (CHASIS, TECHO, RUEDAS...)
//EN UNA CLASE COCHE. ESTO PERMITE SEGUIR EL ESPÍRITU DE UN LENGUAJE
//ORIENTADO A OBJETOS.

//Se utilizan las librerías "Simple Java Graphics"
//de Mr.Cay S. Horstmann (http://horstmann.com/sjsu/graphics/)
//a quien desde aquí agradezco su valioso trabajo

//AUTOR: Miguel Ángel García Godoy
//FECHA: 27/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Text;

public class ClaseCoche {
	
	
	//ATRIBUTOS DE "ClaseCoche"
	
	private int x;
	private int y;
	private String numero;
	private Rectangle chasis;
	private Ellipse techo;
	private Ellipse ruedaTrasera;
	private Ellipse ruedaDelantera;
	private Ellipse circuloNumero;
	private Text dorsal;
	private Color color;

	
	//CONTRUCTOR DE "ClaseCoche"
	//"X, Y" para introducir coordenadas del coche
	//"numero" para introducir el dorsal del coche
	//"color" para elegir el color del coche de los predeterminados en la clase Color
	
	public ClaseCoche( int x, int y, String numero, Color color){
		
		this.x = x;
		this.y = y;
		this.numero = numero;
		this.color = color;
		
		
		//Variables para establecer coordenadas relativas de las partes del coche con respecto
		//al chasis.
		
		int xChasis = this.x;
		int yChasis = this.y;
		int xTecho = this.x + 125;
		int yTecho = this.y - 50;
		int xRuedaTrasera = this.x + 75;
		int yRuedaTrasera = this.y + 50;
		int xRuedaDelantera = this.x + 325;
		int yRuedaDelantera = this.y + 50;
		int xCirculoNumero = this.x + 225;
		int yCirculoNumero = this.y + 25;
		int xNumero = this.x + 250;
		int yNumero = this.y + 40;
		
		
		//Creación de las distintas partes del coche
		
		chasis = new Rectangle( xChasis, yChasis, 500, 100);
		techo = new Ellipse( xTecho, yTecho, 250, 100);
		ruedaTrasera = new Ellipse( xRuedaTrasera, yRuedaTrasera, 100, 100);
		ruedaDelantera = new Ellipse( xRuedaDelantera, yRuedaDelantera, 100, 100);
		circuloNumero = new Ellipse( xCirculoNumero, yCirculoNumero, 50, 50);
		dorsal = new Text( xNumero, yNumero, this.numero );

	}//Fin del constructor
	
	
	
	//MÉTODO "dibujar" PARA PLASMAR LOS COCHES EN ESCENA
	
	public void dibujar(){
		
		chasis.setColor(this.color);
		chasis.fill();
		techo.setColor(this.color);
		techo.fill();
		ruedaTrasera.setColor(Color.DARK_GRAY);
		ruedaTrasera.fill();
		ruedaDelantera.setColor(Color.DARK_GRAY);
		ruedaDelantera.fill();
		circuloNumero.draw();
		dorsal.draw();
		dorsal.grow(10, 10);
		
	}//Fin del método "dibujar"
	
	
	
	//MÉTODO "trasladar" PARA QUE TODAS LAS PARTES DEL COCHE SE 
	//DESPLACEN COMO UN CONJUNTO
	
	public void trasladar(double x, double y){
		
		chasis.translate(x, y);
		techo.translate(x, y);
		ruedaTrasera.translate(x, y);
		ruedaDelantera.translate(x, y);
		circuloNumero.translate(x, y);
		dorsal.translate(x, y);
		
	}//Fin del método "trasladar"
	
	
	//MÉTODO "obtenerAbscisa" QUE NOS DEVUELVE LA POSICIÓN "x" 
	//DEL CHASIS DEL COCHE
	
	public int obtenerAbscisa(){
		
		return chasis.getX();
			
	}//Fin del método "obtenerAbscisa"
	

}//Fin de la clase "ClaseCoche"
