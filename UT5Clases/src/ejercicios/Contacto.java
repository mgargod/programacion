package ejercicios;

/*
 * Vamos a hacer una Agenda, necesitamos la clase Contacto, que tiene:
	Nombre
	Apellido 1
	Apellido 2
	Direcci�n
	telFijo
	telMovil
	mail
	
	// constructores
	Contacto(Nombre,Apellido 1,movil)
	Contacto(Nombre,Apellido 1,Apellido 2,movil)
	Contacto(Nombre,Apellido 1,Apellido 2,dir,movil,fijo,correo)
	
	// m�todos
	M�todos get/set para todos los atributos
 */

public class Contacto {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String telFijo;
	private String telMovil;
	private String mail;
	
	public Contacto ( String nombre, String apellido1, String movil ) {
		
		setNombre(nombre);
		setApellido1(apellido1);
		setTelMovil(movil);
		
	}
	
	public Contacto ( String nombre, String apellido1, String apellido2, String movil ) {
		
		setNombre(nombre);
		setApellido1(apellido1);
		setApellido1(apellido2);
		setTelMovil(movil);
		
	}
	
	public Contacto ( String nombre, String apellido1, String apellido2, 
			String direccion, String movil, String fijo, String mail ) {
		
		setNombre(nombre);
		setApellido1(apellido1);
		setApellido2(apellido2);
		setDireccion(direccion);
		setTelMovil(movil);
		setTelFijo(fijo);
		setMail(mail);	
		
	}

	public String getNombre() {
		return nombre==null?"-----":nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1==null?"-----":apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2==null?"-----":apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion==null?"-----":direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelFijo() {
		return telFijo==null?"-----":telFijo;
	}

	public void setTelFijo(String telFijo) {
		this.telFijo = telFijo;
	}

	public String getTelMovil() {
		return telMovil==null?"-----":telMovil;
	}

	public void setTelMovil(String telMovil) {
		this.telMovil = telMovil;
	}

	public String getMail() {
		return mail==null?"-----":mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String toString() {
		return String.format("Nombre: %s\nApellido 1: %s\nApellido 2: %s\nDirecci�n: %s\n"
				+ "Telf. m�vil: %s\nTelf. fijo: %s\nEmail: %s\n", getNombre(), getApellido1(), 
				getApellido2(), getDireccion(), getTelMovil(), getTelFijo(), getMail());
	}

}
