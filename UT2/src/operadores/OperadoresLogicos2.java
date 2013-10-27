package operadores;

public class OperadoresLogicos2 {

	public static void main(String[] args) {

		boolean a = !( 5 > 3 ); //false
		boolean b = ( 5 != 3 ) && ( 4 > 3 ); //true
		boolean c = ( 5 != 3 ) || ( 4 > 3 ); //true
		boolean d = ( 5 < 8 ) && ( 3 == 3 ); //true
		boolean e = !( ( 5 !=3 ) || ( 4 > 3 ) ); //false
		boolean f = ( ( 4 != 3 ) && ( (3 > 2 ) || ( 4 > 8 ) ) ); //true
		boolean g = !( 3 == 5 ) || ( 4 != 2 ); //true
		boolean h = !( 3 == 5 ) && ( 4 != 2 ); //true
		boolean i = ( 8 > 2 ) && ( 4 < 2 ) || ( 3 != 4 ); //true
		boolean j = ( ( 3 > 2 ) && ( 4 < 5 ) || ( 3 != 2 ) ) && !( 2 != 5 ); //false
		
		System.out.println( "a: " + a );
		System.out.println( "b: " + b );
		System.out.println( "c: " + c );
		System.out.println( "d: " + d );
		System.out.println( "e: " + e );
		System.out.println( "f: " + f );
		System.out.println( "g: " + g );
		System.out.println( "h: " + h );
		System.out.println( "i: " + i );
		System.out.println( "j: " + j );
	
	}

}
