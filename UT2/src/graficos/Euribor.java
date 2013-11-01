package graficos;

//ESTA APLICACIÓN REPRESENTA UN GRÁFICO DE BARRAS
//CON LA EVOLUCIÓN DEL EURIBOR ANUAL EN 2013 (ENERO-OCTUBRE)

//Se utilizan las librerías "Simple Java Graphics"
//de Mr.Cay S. Horstmann (http://horstmann.com/sjsu/graphics/)
//a quien desde aquí agradezco su valioso trabajo

//AUTOR: Miguel Ángel García Godoy
//FECHA: 27/10/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import graphics.Color;
import graphics.Rectangle;
import graphics.Line;
import graphics.Text;

public class Euribor {

	public static void main(String[] args) throws InterruptedException {
		
		//VARIABLES INICIALES PARA GEOMETRIA
		
		int numeroMeses = 10;
		int espacioEntreMeses = 10;
		int anchoMes = 100;
		int origenX = 300;
		int origenY = 850;
		int finEjeX = origenX + numeroMeses * anchoMes + ( numeroMeses - 1 ) * espacioEntreMeses;
		int finEjeY = origenY - 800;
		
		
		//VALORES EURIBOR 2013 * 1000
		
		final int ENERO = 575;
		final int FEBRERO = 594;
		final int MARZO = 545;
		final int ABRIL = 528;
		final int MAYO = 484;
		final int JUNIO = 507;
		final int JULIO = 525;
		final int AGOSTO = 542;
		final int SEPTIEMBRE = 543;
		final int OCTUBRE = 541;
		
		//INTERVALO DE TIEMPO PARA REPRESENTACION ANIMADA POR MESES
		
		final int INTERVALO = 600;
			
				
		//CREACION DE BARRAS ENERO - OCTUBRE

		Rectangle enero = new Rectangle( origenX, origenY - ENERO, anchoMes, ENERO );
		
		Rectangle febrero = new Rectangle( origenX + anchoMes + espacioEntreMeses, origenY - FEBRERO,
										   anchoMes, FEBRERO);
		Rectangle marzo = new Rectangle( origenX + 2 * anchoMes + 2 * espacioEntreMeses, origenY - MARZO,
				                           anchoMes, MARZO);
		Rectangle abril = new Rectangle( origenX + 3 * anchoMes + 3 * espacioEntreMeses, origenY - ABRIL,
				                           anchoMes, ABRIL);
		Rectangle mayo = new Rectangle( origenX + 4 * anchoMes + 4 * espacioEntreMeses, origenY - MAYO,
				                           anchoMes, MAYO);
		Rectangle junio = new Rectangle( origenX + 5 * anchoMes + 5 * espacioEntreMeses, origenY - JUNIO,
				                           anchoMes, JUNIO);
		Rectangle julio = new Rectangle( origenX + 6 * anchoMes + 6 * espacioEntreMeses, origenY - JULIO,
				                           anchoMes, JULIO);
		Rectangle agosto = new Rectangle( origenX + 7 * anchoMes + 7 * espacioEntreMeses, origenY - AGOSTO,
				                           anchoMes, AGOSTO);
		Rectangle septiembre = new Rectangle( origenX + 8 * anchoMes + 8 * espacioEntreMeses, origenY - SEPTIEMBRE,
				                           anchoMes, SEPTIEMBRE);
		Rectangle octubre = new Rectangle( origenX + 9 * anchoMes + 9 * espacioEntreMeses, origenY - OCTUBRE,
				                           anchoMes, OCTUBRE);
		
		
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
		
		
		//CREACION DE TEXTO DE MESES ENERO-OCTUBRE EJE HORIZONTAL
		
		Text textoEnero = new Text( origenX, origenY + 20, "ENERO" );
		Text textoFebrero = new Text( origenX + anchoMes + espacioEntreMeses, origenY + 20, "FEBRERO" );
		Text textoMarzo = new Text( origenX + 2 * anchoMes + 2 * espacioEntreMeses, origenY + 20, "MARZO" );
		Text textoAbril = new Text( origenX + 3 * anchoMes + 3 * espacioEntreMeses, origenY + 20, "ABRIL" );
		Text textoMayo = new Text( origenX + 4 * anchoMes + 4 * espacioEntreMeses, origenY + 20, "MAYO" );
		Text textoJunio = new Text( origenX + 5 * anchoMes + 5 * espacioEntreMeses, origenY + 20, "JUNIO" );
		Text textoJulio = new Text( origenX + 6 * anchoMes + 6 * espacioEntreMeses, origenY + 20, "JULIO" );
		Text textoAgosto = new Text( origenX + 7 * anchoMes + 7 * espacioEntreMeses, origenY + 20, "AGOSTO" );
		Text textoSeptiembre = new Text( origenX + 8 * anchoMes + 8 * espacioEntreMeses, origenY + 20, "SEPTIEMBRE" );
		Text textoOctubre = new Text( origenX + 9 * anchoMes + 9 * espacioEntreMeses, origenY + 20, "OCTUBRE" );
		
		
		//ESTABLECER COLOR DE BARRAS Y LLAMAR AL METODO PARA QUE LAS DIBUJE CON RELLENO
				
		enero.setColor(Color.BLUE);
		
		febrero.setColor(Color.CYAN);
		
		marzo.setColor(Color.YELLOW);
		
		abril.setColor(Color.GRAY);
		
		mayo.setColor(Color.GREEN);
		
		junio.setColor(Color.LIGHT_GRAY);
		
		julio.setColor(Color.MAGENTA);
		
		agosto.setColor(Color.ORANGE);
		
		septiembre.setColor(Color.PINK);
		
		octubre.setColor(Color.RED);
		
		
		
		//LLAMAR AL METODO PARA DIBUJAR EJES
		
		ejeHorizontal.draw();
		ejeVertical.draw();
		
		
		//LLAMAR AL METODO PARA DIBUJAR TEXTO DE VALORES DE EJE VERTICAL
		
		textoValor0.draw();
		textoValor250.draw();
		textoValor500.draw();
		textoValor750.draw();
		
		
		//LLAMAR AL METODO PARA DIBUJAR TEXTO DE LEYENDA DE EJE VERTICAL
		
		textoValorEuribor.draw();
		
		
		//REPRESENTACION DE VALORES MENSUALES CON ANIMACION
		
		Thread.sleep(INTERVALO);
		
		enero.fill();
		textoEnero.draw();
		
		Thread.sleep(INTERVALO);
		
		febrero.fill();
		textoFebrero.draw();
		
		Thread.sleep(INTERVALO);
		
		marzo.fill();
		textoMarzo.draw();
		
		Thread.sleep(INTERVALO);
		
		abril.fill();
		textoAbril.draw();
		
		Thread.sleep(INTERVALO);
		
		mayo.fill();
		textoMayo.draw();
		
		Thread.sleep(INTERVALO);
		
		junio.fill();
		textoJunio.draw();
		
		Thread.sleep(INTERVALO);
		
		julio.fill();
		textoJulio.draw();
		
		Thread.sleep(INTERVALO);
		
		agosto.fill();
		textoAgosto.draw();
		
		Thread.sleep(INTERVALO);
		
		septiembre.fill();
		textoSeptiembre.draw();
		
		Thread.sleep(INTERVALO);
		
		octubre.fill();
		textoOctubre.draw();
		
		//REPRESENTACION DE DIVISIONES DE EJE VERTICAL
		
		Thread.sleep(INTERVALO);
		valor250.draw();
		Thread.sleep(INTERVALO);
		valor500.draw();
		Thread.sleep(INTERVALO);
		valor750.draw();
	}

}
