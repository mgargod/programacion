package graficos;

//ESTA APLICACIÓN REALIZA MEDIANTE GRÁFICOS LA SIMULACIÓN DE
//UNA CARRERA DE TRES COCHES. LA VICTORIA ES ALEATORIA.

//Se utilizan las librerías "Simple Java Graphics"
//de Mr.Cay S. Horstmann (http://horstmann.com/sjsu/graphics/)
//a quien desde aquí agradezco su valioso trabajo

//AUTOR: Miguel Ángel García Godoy
//FECHA: 27/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import graphics.Color;
import graphics.Rectangle;
import graphics.Ellipse;
import graphics.Text;


public class Coche {

	public static void main(String[] args) throws InterruptedException {
			
		//COORDENADAS COCHE 1
		
		int xChasis1 = 100;
		int yChasis1 = 100;
		int xTecho1 = 225;
		int yTecho1 = 50;
		int xRuedaTrasera1 = 175;
		int yRuedaTrasera1 = 150;
		int xRuedaDelantera1 = 425;
		int yRuedaDelantera1 = 150;
		int xCirculoNumero1 = 325;
		int yCirculoNumero1 = 125;
		int xNumero1 = 350;
		int yNumero1 = 140;
		
		
		//CREACION PARTES COCHE 1
				
		Rectangle chasis1 = new Rectangle( xChasis1, yChasis1, 500, 100);
		Ellipse techo1 = new Ellipse( xTecho1, yTecho1, 250, 100);
		Ellipse ruedaTrasera1 = new Ellipse( xRuedaTrasera1, yRuedaTrasera1, 100, 100);
		Ellipse ruedaDelantera1 = new Ellipse( xRuedaDelantera1, yRuedaDelantera1, 100, 100);
		Ellipse circuloNumero1 = new Ellipse( xCirculoNumero1, yCirculoNumero1, 50, 50);
		Text numero1 = new Text( xNumero1, yNumero1, "1" );
		
		
		//PLASMAR COCHE 1 EN LA ESCENA
			
		chasis1.setColor(Color.ORANGE);
		chasis1.fill();
		techo1.setColor(Color.ORANGE);
		techo1.fill();
		ruedaTrasera1.setColor(Color.DARK_GRAY);
		ruedaTrasera1.fill();
		ruedaDelantera1.setColor(Color.DARK_GRAY);
		ruedaDelantera1.fill();
		circuloNumero1.draw();
		numero1.draw();
		numero1.grow(10, 10);
		
		
		//CREACION PARTES COCHE 2
		
		Rectangle chasis2 = new Rectangle( xChasis1, yChasis1 + 300, 500, 100);
		Ellipse techo2 = new Ellipse( xTecho1, yTecho1 + 300, 250, 100);
		Ellipse ruedaTrasera2 = new Ellipse( xRuedaTrasera1, yRuedaTrasera1 + 300, 100, 100);
		Ellipse ruedaDelantera2 = new Ellipse( xRuedaDelantera1, yRuedaDelantera1 + 300, 100, 100);
		Ellipse circuloNumero2 = new Ellipse( xCirculoNumero1, yCirculoNumero1 + 300, 50, 50);
		Text numero2 = new Text( xNumero1, yNumero1 + 300, "2" );
		
		
		
		//PLASMAR COCHE 2 EN LA ESCENA
				
		chasis2.setColor(Color.GREEN);
		chasis2.fill();
		techo2.setColor(Color.GREEN);
		techo2.fill();
		ruedaTrasera2.setColor(Color.DARK_GRAY);
		ruedaTrasera2.fill();
		ruedaDelantera2.setColor(Color.DARK_GRAY);
		ruedaDelantera2.fill();
		circuloNumero2.draw();
		numero2.draw();
		numero2.grow(10, 10);
		
		
		//CREACION PARTES COCHE 3
		
		Rectangle chasis3 = new Rectangle( xChasis1, yChasis1 + 600, 500, 100);
		Ellipse techo3 = new Ellipse( xTecho1, yTecho1 + 600, 250, 100);
		Ellipse ruedaTrasera3 = new Ellipse( xRuedaTrasera1, yRuedaTrasera1 + 600, 100, 100);
		Ellipse ruedaDelantera3 = new Ellipse( xRuedaDelantera1, yRuedaDelantera1 + 600, 100, 100);
		Ellipse circuloNumero3 = new Ellipse( xCirculoNumero1, yCirculoNumero1 + 600, 50, 50);
		Text numero3 = new Text( xNumero1, yNumero1 + 600, "3" );
				
		
		//PLASMAR COCHE 3 EN LA ESCENA
		
		chasis3.setColor(Color.YELLOW);
		chasis3.fill();
		techo3.setColor(Color.YELLOW);
		techo3.fill();
		ruedaTrasera3.setColor(Color.DARK_GRAY);
		ruedaTrasera3.fill();
		ruedaDelantera3.setColor(Color.DARK_GRAY);
		ruedaDelantera3.fill();
		circuloNumero3.draw();
		numero3.draw();
		numero3.grow(10, 10);
		
		
		//CREACION Y DIBUJO DE META
		
		Rectangle meta = new Rectangle( 1100, 0, 15, 1900);
		meta.setColor(Color.BLACK);
		meta.fill();
		
	
		
		//VELOCIDADES ALEATORIAS PARA CADA COCHE
		
		double velocidad1 = Math.random() * 10; 
		double velocidad2 = Math.random() * 10; 
		double velocidad3 = Math.random() * 10;
		//Si las velocidades estuviesen incluidas en el cuerpo del bucle de repetición
		//en cada ejecución del mismo volverían a asignarse nuevas velocidades aleatorias
		//y la carrera estaría más igualada (por estadística).
		
		
		//BUCLE DE REPETICION PARA SIMULAR EL MOVIMIENTO DE LOS COCHES
		//EL MOVIMIENTO DE LOS COCHES SE EJECUTA HASTA QUE UNO DE ELLOS
		//SUPERA COMPLETAMENTE LA LINEA DE META
		
		int xMeta = meta.getX() + 15; //abscisa de la meta
		double contador = 0.5; //inicialización de contador para el bucle de repetición
		
		boolean hayGanador = false; //en principio nadie ha ganado
		
		while ( !hayGanador ){  //Mientras no haya ganador, se ejecuta el cuerpo del bucle
			
			Thread.sleep(50); //RETARDO TEMPORAL CADA CAMBIO DE COORDENADAS
			
			
			//METODO TRASLADAR CON VELOCIDAD ALEATORIA 1
			
			chasis1.translate(contador + velocidad1, 0);
			techo1.translate(contador + velocidad1, 0);
			ruedaTrasera1.translate(contador + velocidad1, 0);
			ruedaDelantera1.translate(contador + velocidad1, 0);
			circuloNumero1.translate(contador + velocidad1, 0);
			numero1.translate(contador + velocidad1, 0);
			
			//METODO TRASLADAR CON VELOCIDAD ALEATORIA 2
			
			chasis2.translate(contador + velocidad2, 0);
			techo2.translate(contador + velocidad2, 0);
			ruedaTrasera2.translate(contador + velocidad2, 0);
			ruedaDelantera2.translate(contador + velocidad2, 0);
			circuloNumero2.translate(contador + velocidad2, 0);
			numero2.translate(contador + velocidad2, 0);
			
			
			//METODO TRASLADAR CON VELOCIDAD ALEATORIA 3
			
			chasis3.translate(contador + velocidad3, 0);
			techo3.translate(contador + velocidad3, 0);
			ruedaTrasera3.translate(contador + velocidad3, 0);
			ruedaDelantera3.translate(contador + velocidad3, 0);
			circuloNumero3.translate(contador + velocidad3, 0);
			numero3.translate(contador + velocidad3, 0);
			
			
			//ESTABLECER SI ALGUN COCHE HA SUPERADO LA META
			
			boolean b1 = xMeta <= chasis1.getX();
			boolean b2 = xMeta <= chasis2.getX();
			boolean b3 = xMeta <= chasis3.getX();
			
			hayGanador = b1 || b2 || b3; //si uno de los tres ha superado la meta, hayGanador = true;
						
			contador = contador + 0.5; //incrementamos el contador para aumentar las coordenadas
			
			
		}//FIN DE BUCLE DE REPETICION

		
			
	}

}
