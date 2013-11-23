package graficos;

//ESTA APLICACIÓN REPRESENTA UN GRÁFICO DE BARRAS
//CON LA EVOLUCIÓN DEL EURIBOR ANUAL EN 2013

//Se utilizan las librerías "Simple Java Graphics"
//de Mr.Cay S. Horstmann (http://horstmann.com/sjsu/graphics/)
//a quien desde aquí agradezco su valioso trabajo

//AUTOR: Miguel Ángel García Godoy
//FECHA: 27/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import javax.swing.JOptionPane;

import graphics.Color;
import graphics.Rectangle;
import graphics.Line;
import graphics.Text;

public class Euribor {

	public static void main(String[] args) throws InterruptedException {
		
		//PEDIR AL USUARIO EL NUMERO DE MESES A MOSTRAR EN EL GRAFICO
		
		int numeroMeses;
		
		do {
			
			String mensaje = "Introduzca el número de meses que se mostrarán: ";
			numeroMeses = Integer.parseInt(JOptionPane.showInputDialog(mensaje));			
			
		} while ( numeroMeses < 1 || numeroMeses > 12 );		
		
		//VARIABLES INICIALES PARA GEOMETRIA		
		
		int espacioEntreMeses = 10;
		int anchoMes = 100;
		int origenX = 300;
		int origenY = 850;
		int origenTexto = origenY + 20;
		int finEjeX = origenX + numeroMeses * anchoMes + ( numeroMeses - 1 ) * espacioEntreMeses;
		int finEjeY = origenY - 800;		
		
		//VALORES EURIBOR 2013 * 1000
		
		final int[] VALOR = { 0, 575, 594, 545, 528, 484, 507, 525, 542, 543, 541, 0, 0 };
		final String[] MESES = { null, "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", 
				                    "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
		
		//INTERVALO DE TIEMPO PARA REPRESENTACION ANIMADA POR MESES
		
		final int INTERVALO = 600;
		
		//CREACION DE EJES DEL GRAFICO
		
		Line ejeHorizontal = new Line( origenX, origenY, finEjeX, origenY );
		Line ejeVertical = new Line( origenX, origenY, origenX, finEjeY );		
		
		//CREACION DE DIVISIONES DEL EJE VERTICAL
		
		Line valor250 = new Line( origenX - 10, origenY - 250, finEjeX, origenY - 250 );
		Line valor500 = new Line( origenX - 10, origenY - 500, finEjeX, origenY - 500 );
		Line valor750 = new Line( origenX - 10, origenY - 750, finEjeX, origenY - 750 );		
		
		//CREACION DE TEXTO DE VALORES DEL EJE VERTICAL
		
		Text textoValor0 = new Text( origenX - 50, origenY - 10, "0,00" );
		Text textoValor250 = new Text( origenX - 50, origenY - 10 - 250, "0,250" );
		Text textoValor500 = new Text( origenX - 50, origenY - 10 - 500, "0,500" );
		Text textoValor750 = new Text( origenX - 50, origenY - 10 - 750, "0,750" );		
				
		//CREACION DE TEXTO DE LEYENDA DE EJE VERTICAL
		
		Text textoValorEuribor = new Text( origenX - 140, origenY - 10 - 800, "VALOR EURIBOR 2013" );
		
		//BUCLE "FOR" MULTIPROPOSITO		
		
		for ( int i = 1; i <= numeroMeses; ++i ) {
			
			//CREACION DE BARRAS 

			Rectangle mes = new Rectangle( origenX + anchoMes * (i - 1) + espacioEntreMeses * (i - 1), 
					                       origenY - VALOR[i], anchoMes, VALOR[i] );		
		
			//CREACION DE TEXTO DE MESES 
		
			Text textoMes = new Text( origenX + anchoMes * (i - 1) + espacioEntreMeses * (i - 1), 
				                  	  origenTexto, MESES[i]);
		
			//ESTABLECER COLOR DE BARRAS Y LLAMAR AL METODO PARA QUE LAS DIBUJE CON RELLENO			
			
			int rojo = (int)(Math.random() * 255);
			int verde = (int)(Math.random() * 255);
			int azul = (int)(Math.random() * 255);			
			
			Color colorBarra = new Color( rojo, verde, azul );
			
			mes.setColor(colorBarra);
		
			//REPRESENTACION DE VALORES MENSUALES CON ANIMACION
		
			Thread.sleep(INTERVALO);
		
			mes.fill();
			textoMes.draw();
		
		} //fin for
		
		
		//LLAMAR AL METODO PARA DIBUJAR EJES
		
		ejeHorizontal.draw();
		ejeVertical.draw();
		
		//REPRESENTACION DE DIVISIONES DE EJE VERTICAL
		
		Thread.sleep(INTERVALO);
		valor250.draw();
		Thread.sleep(INTERVALO);
		valor500.draw();
		Thread.sleep(INTERVALO);
		valor750.draw();		
		
		//LLAMAR AL METODO PARA DIBUJAR TEXTO DE VALORES DE EJE VERTICAL
		
		textoValor0.draw();
		textoValor250.draw();
		textoValor500.draw();
		textoValor750.draw();		
		
		//LLAMAR AL METODO PARA DIBUJAR TEXTO DE LEYENDA DE EJE VERTICAL
		
		textoValorEuribor.draw();
	}
}

	
