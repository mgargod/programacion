package ejercicios.actividad4;
/*
Mejora la clase Fecha a partir del siguiente c�digo:
A�ade la comprobaci�n de errores en los valores de inicializaci�n de a�o. 
A�ade un m�todo llamado siguienteD�a para incrementar el d�a en uno. 
El objeto fecha siempre tendr� un valor con sentido. Escribe un programa para probar 
el funcionamiento del m�todo, para lo que imprimir� la secuencia de varios d�as en los que cambie el mes y el a�o.
 */

public class Fecha 
{
   private int dia;   // 1-31 con base en el mes	
   private int mes; // 1-12   
   private int anio;  // cualquier a�o

   private static final int[] diasPorMes = // d�as en cada mes  
      { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

   // constructor: llama a comprobarMes para confirmar el valor apropiado para el mes; 
   // llama a comprobarDia para confirmar el valor apropiado para el d�a
   public Fecha( int elDia, int elMes, int elAnio )
   {
      mes = comprobarMes( elMes ); // valida el mes
      anio = comprobarAnio( elAnio ); // pudo validar el a�o
      dia = comprobarDia( elDia ); // valida el d�a
      
   } // fin del constructor de Fecha

   // m�todo utilitario para confirmar el valor apropiado del mes
   private int comprobarMes( int mesPrueba )
   {
      if ( mesPrueba > 0 && mesPrueba <= 12 ) // valida el mes
         return mesPrueba;
      else // mes es inv�lido
         throw new IllegalArgumentException ( "el mes debe ser 1 a 12"); 
   } // fin del m�todo comprobarMes

   // m�todo utilitario para confirmar el valor apropiado del d�a, con base en el mes y el a�o
   private int comprobarDia( int diaPrueba )
   {
      // comprueba si el d�a est� dentro del rango para el mes
      if ( diaPrueba > 0 && diaPrueba <= diasPorMes[ mes ] )
         return diaPrueba;

      // comprueba si es a�o bisiesto
      if ( mes == 2 && diaPrueba == 29 && ( anio % 400 == 0 || 
           ( anio % 4 == 0 && anio % 100 != 0 ) ) )
         return diaPrueba;

      throw new IllegalArgumentException(
         "dia fuera de rango para el mes y anio especificados" );
   } // fin del m�todo comprobarDia
   
   // m�todo utilitario para confirmar el valor apropiado del a�o
   private int comprobarAnio( int anioPrueba )
   {
      if ( anioPrueba > 0 && anioPrueba <= 9999 ) // valida el a�o
         return anioPrueba;
      else // a�o es inv�lido
         throw new IllegalArgumentException ( "el a�o debe ser 0 a 9999"); 
   } // fin del m�todo comprobarAnio
   
   //m�todo para aumentar la fecha en un d�a
   public void siguienteDia() {
	   if ( this.dia == diasPorMes[this.mes] && mes == 12) {		   
		   
		   this.dia = 1;
		   this.mes = 1;
		   ++this.anio;
		   
	   } else if ( this.dia == diasPorMes[this.mes] && mes < 12 && mes != 2) {
		   
		   this.dia = 1;
		   this.mes++;
		   
	   } else if ( this.dia == 29 && mes == 2 ) {
		   
		   this.dia = 1;
		   this.mes++;
	
		   
	   } else {
		   
		   this.dia++;
	   }
   }

   // devuelve un objeto String de la forma dia/mes/a�o
   public String toString()
   { 
      return String.format( "%02d/%02d/%04d", dia, mes, anio ); 
   } // fin del m�todo toString
} // fin de la clase Fecha
