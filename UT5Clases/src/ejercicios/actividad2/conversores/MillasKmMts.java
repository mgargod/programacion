package ejercicios.actividad2.conversores;

public class MillasKmMts {
	
	private final static int MILLA_EN_METROS = 1852;
	
	public static double millas_mts ( double millas ) {		
		
		return millas * MILLA_EN_METROS;
	}
	
	public static double millas_km ( double millas ) {
		
		return millas * ( (double)MILLA_EN_METROS / 1000 );
	}

}
