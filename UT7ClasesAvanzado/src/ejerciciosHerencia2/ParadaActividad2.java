package ejerciciosHerencia2;

public class ParadaActividad2 extends Parada2 implements Valorable {
	
	private String nombreActividad;
	private double precioActividad;

	public ParadaActividad2(String nombreLugar, int horaBajada, int horaSalida, String nombreActividad, double precioActividad) {
		super(nombreLugar, horaBajada, horaSalida);

		this.nombreActividad = nombreActividad;
		this.precioActividad = (precioActividad < 0) ? 0 : precioActividad;
	}

	public String getNombreActividad() {
		return nombreActividad;
	}

	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	public double getPrecioActividad() {
		return precioActividad;
	}

	public void setPrecioActividad(double precioActividad) {
		this.precioActividad = precioActividad;
	}
	
	public String toString() {
		return String.format("%sActividad: %s\nPrecio de la actividad: %.2f €.\n",
				              super.toString(), this.nombreActividad, this.precioActividad);
	}

	@Override
	public double coste() {
		return super.coste() + this.precioActividad;
	}

}

