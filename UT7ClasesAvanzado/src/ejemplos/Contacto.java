package ejemplos;

public class Contacto {
	
	private String nombre;
	private String direccion;
	private String DNI;
	private String email;
	private String telefono;
	
	

	public Contacto(String nombre, String direccion, String dNI, String email,
			String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		DNI = dNI;
		this.email = email;
		this.telefono = telefono;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getDNI() {
		return DNI;
	}



	public void setDNI(String dNI) {
		DNI = dNI;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (DNI.equals(other.DNI) || email.equals(other.email))
			return true;
		else
			return false;
		return true;
	}



	public static void main(String[] args) {

		
		

	}

}
