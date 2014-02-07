package ejercicios;

public class PruebaEmpleado {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Miguel Ángel","García");
		empleado1.setApellido2("Godoy");
		empleado1.setDni("03855024-V");
		empleado1.setSueldoBase(1100);
		empleado1.calculaSueldo(4, 20);
		
		System.out.println("DATOS EMPLEADO Nº1\n" + empleado1);

	}

}
