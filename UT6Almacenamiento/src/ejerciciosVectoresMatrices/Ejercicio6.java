package ejerciciosVectoresMatrices;

import java.util.Scanner;

/*
 * Ejercicio 6. Escribe un programa que obtenga la letra del DNI. 
 * El procedimiento para obtener la letra consiste en dividir el n�mero del DNI por 23. 
 * La parte entera del resultado obtenido se multiplica por 23. 
 * Seguidamente, al DNI original se le resta el �ltimo resultado obtenido. 
 * Como resultado final de esta �ltima operaci�n dar� un n�mero que estar� siempre 
 * comprendido entre 0 y 23. Seg�n el valor de este �ltimo, se aplicar� la 
 * siguiente tabla: 0=T 1=R 2=W 3=A 4=G 5=M 6=Y 7=F 8=P 9=D 10=X 11=B 12=N 13=J 
 * 14=Z 15=S 16=Q 17=V 18=H 19=L 20=C 21=K 22=E 23=O
 */

public class Ejercicio6 {
	
	public static String getLetraDni ( int dni ) {
		
		final String[] LETRAS_DNI = {"T","R","W","A","G","M",
                "Y","F","P","D","X","B",
                "N","J","Z","S","Q","V",
				 "H","L","C","K","E","O"};
	
		int indiceLetrasDni = dni - dni / 23 * 23;

		return LETRAS_DNI[indiceLetrasDni];		
		
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String valorUsuario;
		int dni;
		boolean valorErroneo;
		
		do {
			
			valorErroneo = false;
			
			System.out.print("Introduzca su DNI sin letra [ 8 d�gitos ]: ");
			valorUsuario = teclado.next();
			
			if ( valorUsuario.length() == 8 ) {
			
				for ( int i = 0; i < valorUsuario.length(); ++i ) {
					
					if ( !Character.isDigit(valorUsuario.charAt(i)) ) {
						
						System.out.println("Debe introducir d�gitos.");
						i = valorUsuario.length();
						valorErroneo = true;
						
					}				
											
				}
			
			} else {
				
				System.out.println("Debe introducir 9 d�gitos (coloque ceros delante si es necesario)");
				valorErroneo = true;
			}
		
		} while (valorErroneo);
		
		teclado.close();		
		
		dni = Integer.parseInt(valorUsuario);
		
		System.out.printf("DNI CON LETRA: %s-%s", valorUsuario, getLetraDni(dni) );

	}

}

