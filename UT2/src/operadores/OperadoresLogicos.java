package operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {

		boolean a,
				b;
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n%s", 
						  "a", "b", "a && b", "a || b", "!a", "!b",
						  "---------------------------------------------\n");
		
		a = 3 > 5;
		b = 12 != 8;
		
		System.out.printf("%s\t%s\t%b\t%b\t%b\t%b\n%s", 
						  "3>5", "12!=8", (a && b), (a || b), !a, !b,
						  "---------------------------------------------\n");
		
		a = 5 >=6;
		b = 3 != 3;
		
		System.out.printf("%s\t%s\t%b\t%b\t%b\t%b\n%s", 
				  "5>=6", "3!=3", (a && b), (a || b), !a, !b,
				  "---------------------------------------------\n");
		
		a = -7 == 8;
		//b = 22;
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n%s", 
				  "-7==8", "22", "error", "error", "error", "error",
				  "---------------------------------------------\n");
		
		a = 21 != 12;
		b = true;
		
		System.out.printf("%s\t%s\t%b\t%b\t%b\t%b\n%s", 
				  "21!=12", "true", (a && b), (a || b), !a, !b,
				  "---------------------------------------------\n");
		
		a = 4 == 2;
		b = 7 >= -9;
		
		System.out.printf("%s\t%s\t%b\t%b\t%b\t%b\n%s", 
				  "4==2", "7>=-9", (a && b), (a || b), !a, !b,
				  "---------------------------------------------\n");
		
		
		
	

	}

}
