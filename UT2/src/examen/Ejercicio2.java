package examen;

/*
 * Alumno: MIGUEL ANGEL GARCIA GODOY
 * Asignatura: PROGRAMACION
 * Curso: 1º DAW
 * Fecha: 29/11/2013
 * 
 */

import java.util.Scanner;

import graphics.Color;
import graphics.Ellipse;
import graphics.Line;
import graphics.Rectangle;
import graphics.Text;

public class Ejercicio2 {
	
	public static int random( int base, int rango ){
		
		int aleatorio = 0;
		aleatorio = (int)(Math.random() * rango + base);
		return aleatorio;
	}

	public static void main(String[] args) throws InterruptedException {

		int anchoLienzo = 0;
		int altoLienzo = 0;
		int numeroFiguras = 0;
		int figura = 0;
		int cuadrados = 0;
		int circulos = 0;
		int textos = 0;
		int lineas = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el ANCHO del lienzo: ");
		anchoLienzo = teclado.nextInt();
		
		System.out.print("Introduzca el ALTO del lienzo: ");
		altoLienzo = teclado.nextInt();
		
		System.out.print("Introduzca el nº de figuras: ");
		numeroFiguras = teclado.nextInt();
		
		teclado.close();
		
		Rectangle lienzo = new Rectangle(0, 0, anchoLienzo, altoLienzo);
		lienzo.draw();		
		
		for ( int i = 1; i <= numeroFiguras; ++i){
			
			Thread.sleep(5);
			
			int x = random(lienzo.getX(), lienzo.getWidth());
			int y = random(lienzo.getY(), lienzo.getHeight());
			int xtexto = x;
			int ytexto = y;				
			int ancho = lienzo.getWidth() - x;				
			int alto = lienzo.getHeight() - y;
			int limite;
			int xlinea = random(lienzo.getX(), lienzo.getWidth());
			int ylinea = random(lienzo.getY(), lienzo.getHeight());
			
			if ( ancho >= alto ) {
				
				limite = alto;
			
			} else {
				
				limite = ancho;
			}
			
			int dim = random(0, limite);
			
			
			if ( x > (lienzo.getWidth() - 28)){
				
				xtexto = x - 28;
			}
				
			if ( y > (lienzo.getHeight() - 16)) {
				
				ytexto = y - 16;
			}			
			
			int rojo = random(0, 256);
			int verde = random(0, 256);
			int azul = random(0, 256);			
			
			Color color = new Color( rojo, verde, azul );
			
			figura = random(0, 4);
			
			switch (figura) {
			
			case 0:
				Rectangle cuadrado = new Rectangle(x, y, dim, dim);
				cuadrado.setColor(color);
				cuadrado.fill();
				++cuadrados;
				break;
			case 1:
				Ellipse circulo = new Ellipse(x, y, dim, dim);
				circulo.setColor(color);
				circulo.fill();
				++circulos;
				break;
			case 2:
				Text texto = new Text(xtexto, ytexto, "DAW");
				texto.setColor(color);
				texto.draw();
				++textos;
				break;
			case 3:
				Line linea = new Line(x, y, xlinea, ylinea);
				linea.setColor(color);
				linea.draw();
				++lineas;
				break;
			default:
				System.out.println("Error en Math.random()");
				break;
			}
		}
		
		System.out.println("Nº cuadrados: " + cuadrados);
		System.out.println("Nº circulos: " + circulos);
		System.out.println("Nº textos: " + textos);
		System.out.println("Nº lineas: " + lineas);

	}

}
