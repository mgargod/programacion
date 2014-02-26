package ejercicios.actividad4;
/*
Mejora la clase Fecha a partir del siguiente código:
Añade la comprobación de errores en los valores de inicialización de año. 
Añade un método llamado siguienteDía para incrementar el día en uno. 
El objeto fecha siempre tendrá un valor con sentido. Escribe un programa para probar 
el funcionamiento del método, para lo que imprimirá la secuencia de varios días en los que cambie el mes y el año.
 */

public class Fecha 
{
   private int dia;   // 1-31 con base en el mes	
   private int mes; // 1-12   
   private int anio;  // cualquier año

   private static final int[] diasPorMes = // días en cada mes  
      { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

   // constructor: llama a comprobarMes para confirmar el valor apropiado para el mes; 
   // llama a comprobarDia para confirmar el valor apropiado para el día
   public Fecha( int elDia, int elMes, int elAnio )
   {
      mes = comprobarMes( elMes ); // valida el mes
      anio = comprobarAnio( elAnio ); // pudo validar el año
      dia = comprobarDia( elDia ); // valida el día
      
   } // fin del constructor de Fecha

   // método utilitario para confirmar el valor apropiado del mes
   private int comprobarMes( int mesPrueba )
   {
      if ( mesPrueba > 0 && mesPrueba <= 12 ) // valida el mes
         return mesPrueba;
      else // mes es inválido
         throw new IllegalArgumentException ( "el mes debe ser 1 a 12"); 
   } // fin del método comprobarMes

   // método utilitario para confirmar el valor apropiado del día, con base en el mes y el año
   private int comprobarDia( int diaPrueba )
   {
      // comprueba si el día está dentro del rango para el mes
      if ( diaPrueba > 0 && diaPrueba <= diasPorMes[ mes ] )
         return diaPrueba;

      // comprueba si es año bisiesto
      if ( mes == 2 && diaPrueba == 29 && ( anio % 400 == 0 || 
           ( anio % 4 == 0 && anio % 100 != 0 ) ) )
         return diaPrueba;

      throw new IllegalArgumentException(
         "dia fuera de rango para el mes y anio especificados" );
   } // fin del método comprobarDia
   
   // método utilitario para confirmar el valor apropiado del año
   private int comprobarAnio( int anioPrueba )
   {
      if ( anioPrueba > 0 && anioPrueba <= 9999 ) // valida el año
         return anioPrueba;
      else // año es inválido
         throw new IllegalArgumentException ( "el año debe ser 0 a 9999"); 
   } // fin del método comprobarAnio
   
   //método para aumentar la fecha en un día
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

   // devuelve un objeto String de la forma dia/mes/año
   public String toString()
   { 
      return String.format( "%02d/%02d/%04d", dia, mes, anio ); 
   } // fin del método toString
} // fin de la clase Fecha
