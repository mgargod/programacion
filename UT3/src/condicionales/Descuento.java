package condicionales;

//ESTA APLICACION PIDE AL USUARIO QUE INTRODUZCA
//EL PRECIO DEL PRODUCTO COMPRADO EN LAS REBAJAS 
//Y MUESTRA EL IMPORTE TOTAL CON EL DESCUENTO
//APLICADO QUE DEPENDE DEL PRECIO DEL PRODUCTO
//UTILIZA ESTRUCTURA IF-ELSE IF

//AUTOR: Miguel Ángel García Godoy
//FECHA: 8/11/2013
//ASIGNATURA: Programación
//CURSO: Primero DAW

import java.util.Scanner;

public class Descuento {

	public static void main(String[] args) {

		double precioProducto;
		double importe;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el precio del producto: ");
		precioProducto = teclado.nextDouble();
		
		teclado.close();
		
		
		if ( precioProducto < 20 ) {
			
			importe = precioProducto - precioProducto * 0.1;
			
		} else if ( precioProducto >= 20 && precioProducto <= 50 ) {
			
			importe = precioProducto - precioProducto * 0.2;
		
		} else {
			
			importe = precioProducto - precioProducto * 0.25;
		
		}
		
		System.out.printf( "El importe de su compra en las rebajas es de %.2f euros", importe );
		
		

	}

}
