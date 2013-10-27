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


public class Coche {

	public static void main(String[] args) throws InterruptedException {
		
		//CREACION DE LOS TRES COCHES A PARTIR DE LA CLASE CREADA
		//EN OTRO ARCHIVO LLAMADO "ClaseCoche"
			
		ClaseCoche coche1 = new ClaseCoche(100, 100, "1", Color.ORANGE);
		coche1.dibujar();
		
		ClaseCoche coche2 = new ClaseCoche(100, 400, "2", Color.GREEN);
		coche2.dibujar();
		
		ClaseCoche coche3 = new ClaseCoche(100, 700, "3", Color.YELLOW);
		coche3.dibujar();
		
		
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
		//SUPERE COMPLETAMENTE LA LINEA DE META
		
		int xMeta = meta.getX() + 15; //abscisa de la meta
		double contador = 0.5; //inicialización de contador para el bucle de repetición
		
		boolean hayGanador = false; //en principio nadie ha ganado
		
		while ( !hayGanador ){  //Mientras no haya ganador, se ejecuta el cuerpo del bucle
			
			Thread.sleep(50); //RETARDO TEMPORAL CADA CAMBIO DE COORDENADAS
			
			coche1.trasladar(contador + velocidad1, 0);
			coche2.trasladar(contador + velocidad2, 0);
			coche3.trasladar(contador + velocidad3, 0);
			
			
			//ESTABLECER SI ALGUN COCHE HA SUPERADO LA META
			
			boolean b1 = xMeta <= coche1.obtenerAbscisa();
			boolean b2 = xMeta <= coche2.obtenerAbscisa();
			boolean b3 = xMeta <= coche3.obtenerAbscisa();

			
			hayGanador = b1 || b2 || b3; //si uno de los tres ha superado la meta, hayGanador = true;*/
						
			contador = contador + 0.5; //incrementamos el contador para aumentar las coordenadas
			
			
		}//FIN DE BUCLE DE REPETICION 

		
			
	}

}
