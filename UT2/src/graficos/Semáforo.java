package graficos;

//ESTA APLICACI�N REALIZA MEDIANTE GR�FICOS LA SIMULACI�N DE
//UN SEM�FORO

//Se utilizan las librer�as "Simple Java Graphics"
//de Mr.Cay S. Horstmann (http://horstmann.com/sjsu/graphics/)
//a quien desde aqu� agradezco su valioso trabajo

//AUTOR: Miguel �ngel Garc�a Godoy
//FECHA: 25/10/2013
//ASIGNATURA: Programaci�n
//CURSO: Primero DAW

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Text;

public class Sem�foro {

	public static void main(String[] args) throws InterruptedException {
		
		//DECLARACI�N DE CONSTANTES
		
		final long RETARDO_COLORES = 3000; 
		final long PARPADEO = 600;
		
		
		//OBJETO semaforo: coordenadas, medidas, color, rellenar.
		
		Rectangle semaforo = new Rectangle( 100, 50, 100, 290 );
		
		semaforo.setColor(Color.GRAY);
		
		semaforo.fill();
				
		
		//OBJETO poste: coordenadas, medidas, color, rellenar.
		
		Rectangle poste = new Rectangle( 140, 340, 20, 400 );
		
		poste.setColor(Color.GRAY);
		
		poste.fill();
		
		

		
		//OBJETO circuloVerde: coordenadas, medidas, color, rellenar.
		
		Ellipse circuloVerde = new Ellipse( 105, 245, 90, 90 );
		
		circuloVerde.setColor(Color.GREEN);
		
		circuloVerde.fill();
		
		
		//OBJETO circuloAmarillo: coordenadas, medidas, color, rellenar. Efecto "parpadeo"
		
		Ellipse circuloAmarillo = new Ellipse( 105, 150, 90, 90 );
		
		circuloAmarillo.setColor(Color.YELLOW);
		
		Thread.sleep(RETARDO_COLORES); //Retardo para "desaparici�n Verde" - "aparici�n Amarillo"
		
		circuloVerde.setColor(Color.GRAY);
			
		circuloAmarillo.fill();
		
		Thread.sleep(PARPADEO); //Retardo para conseguir efecto "parpadeo"
		
		circuloAmarillo.setColor(Color.GRAY);
		
		Thread.sleep(PARPADEO);
		
		circuloAmarillo.setColor(Color.YELLOW);
		
		Thread.sleep(PARPADEO);
		
		circuloAmarillo.setColor(Color.GRAY);
		
		Thread.sleep(PARPADEO);
		
		circuloAmarillo.setColor(Color.YELLOW);
		
		Thread.sleep(PARPADEO);
		
		circuloAmarillo.setColor(Color.GRAY);
		
		Thread.sleep(PARPADEO);
		
		circuloAmarillo.setColor(Color.YELLOW);
		
		
		//OBJETO circuloRojo: coordenadas, medidas, color, rellenar. Efecto "parpadeo"
		
		Ellipse circuloRojo = new Ellipse( 105, 55, 90, 90 );
		
		circuloRojo.setColor(Color.RED);
		
		Thread.sleep(PARPADEO);
		
		circuloAmarillo.setColor(Color.GRAY);
		
		circuloRojo.fill();
		
		Thread.sleep(RETARDO_COLORES);
		
		circuloRojo.setColor(Color.GRAY);
		
		
		//OBJETO aviso: coordenadas, texto (cadena de caracteres)
		
		Text aviso = new Text(220,200,"Corte del suministro el�ctrico. Cierre la ventana");
		
		aviso.draw();
		aviso.setColor( Color.MAGENTA );
		aviso.grow( 0.0, 20 );
		
			

	}

}
