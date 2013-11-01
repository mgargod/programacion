package graficos;

//ESTA APLICACION REALIZA MEDIANTE GRAFICOS LA SIMULACION DE
//UN SEMAFORO, PIDIENDO AL USUARIO QUE INTRODUZCA EL VALOR
//QUE HA DE TENER EL DIAMETRO DE LOS DISCOS LUMINOSOS.
//LA GEOMETRIA DEL SEMAFORO SE DEFINE EN FUNCION DEL
//DIAMETRO DE LOS DISCOS.

//Se utilizan las librerías "Simple Java Graphics"
//de Mr.Cay S. Horstmann (http://horstmann.com/sjsu/graphics/)
//a quien desde aquí agradezco su valioso trabajo

//AUTOR: Miguel Ángel García Godoy
//FECHA: 25/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import javax.swing.JOptionPane;
import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Text;

public class Semáforo {

	public static void main(String[] args) throws InterruptedException {
		
		//DECLARACION DE CONSTANTES
		
		final long RETARDO_COLORES = 3000; 
		final long PARPADEO = 600;
		
		//DECLARACION DE VARIABLES PARA COORDENADAS RELATIVAS
		
		double diametroDisco;
		double ancho;
		double alto;
		double centroX;
		double centroY;
		
		//INTRODUCCION DEL VALOR DEL DIAMETRO DE LOS DISCOS
			
		String introducirDiametro = "Introduzca el diámetro de los discos luminosos (entre 80 y 150): ";
		diametroDisco = ( Double.parseDouble( JOptionPane.showInputDialog( introducirDiametro ) ) );
		
		
		//GEOMETRIA DE LA CAJA DEL SEMAFORO
		
		ancho = diametroDisco * 4 / 3;
		alto = diametroDisco * 11 / 3;
		centroX = 2 * diametroDisco;
		centroY = 2 * diametroDisco;
		
		
		
		//OBJETO cajaSemaforo: coordenadas, medidas, color, rellenar.
		
		Rectangle cajaSemaforo = new Rectangle( centroX-ancho/2, centroY-alto/2, ancho, alto ); 
		cajaSemaforo.setColor(Color.GRAY);
		cajaSemaforo.fill();
				
		
		//OBJETO poste: coordenadas, medidas, color, rellenar.
		
		Rectangle poste = new Rectangle( centroX-ancho/10, centroY + alto/2, ancho/5, alto ); 
		poste.setColor(Color.GRAY);
		poste.fill();
		
		
		//OBJETO circuloVerde: coordenadas, medidas, color, rellenar.
		
		Ellipse circuloVerde = new Ellipse( centroX - diametroDisco/2, centroY + diametroDisco * 2 / 3, diametroDisco, diametroDisco ); 
		circuloVerde.setColor(Color.GREEN);
		circuloVerde.fill();
		
		
		//OBJETO circuloAmarillo: coordenadas, medidas, color, rellenar. Efecto "parpadeo"
		//Esto se puede mejorar con un blucle de repetición
		
		Ellipse circuloAmarillo = new Ellipse( centroX - diametroDisco/2, centroY - diametroDisco/2, diametroDisco, diametroDisco ); 
		circuloAmarillo.setColor(Color.YELLOW);
		
		Thread.sleep(RETARDO_COLORES); //Retardo para "desaparición Verde" - "aparición Amarillo"
		
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
		
		Ellipse circuloRojo = new Ellipse( centroX - diametroDisco/2, centroY - diametroDisco * 5 / 3, diametroDisco, diametroDisco ); 
		
		circuloRojo.setColor(Color.RED);
		
		Thread.sleep(PARPADEO);
		
		circuloAmarillo.setColor(Color.GRAY);
		
		circuloRojo.fill();
		
		Thread.sleep(RETARDO_COLORES);
		
		circuloRojo.setColor(Color.GRAY);
		
		
		//OBJETO aviso: coordenadas, texto (cadena de caracteres)
		
		Text aviso = new Text(centroX + ancho, centroY, "Corte del suministro eléctrico. Cierre la ventana");
		
		aviso.draw();
		aviso.setColor( Color.MAGENTA );
		aviso.grow(diametroDisco/2, diametroDisco/6);
		
			

	}

}
