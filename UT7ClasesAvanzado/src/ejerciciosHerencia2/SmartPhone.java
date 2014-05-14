package ejerciciosHerencia2;


public class SmartPhone extends Aparato {
	
	private String[] tecnologia;
	private int numTecnologias;

	public SmartPhone() {
		this.tecnologia = new String[10];
		this.numTecnologias = 0;
		
	}

	public SmartPhone(String numProducto, String numSerie, String nombre,
			String sistemaOperativo, double precioBase) {
		super(numProducto, numSerie, nombre, sistemaOperativo, precioBase);
		this.tecnologia = new String[10];
		this.numTecnologias = 0;
	}

	public String[] getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String[] tecnologia) {
		this.tecnologia = tecnologia;
	}
	
	private boolean repetida(String tecnologia) {
		boolean repetida = false;
		for(int i=0; i < this.numTecnologias; ++i) {
			if(this.tecnologia[i].equalsIgnoreCase(tecnologia)) {
				repetida = true;
				i = this.numTecnologias;
			}			
		}
		
		return repetida;		
	}
	
	public void addTecnologia(String tecnologia) throws TecnologiaRepetidaException {
		
		if(!this.repetida(tecnologia)) {
			this.tecnologia[this.numTecnologias] = tecnologia;
			++this.numTecnologias;
		} else 
			throw new TecnologiaRepetidaException("La tecnología ya está definida.");	
		
				
	}
	
	private String mostrarTecnologia(){
		String tecno;
		
		if(this.numTecnologias == 0) {
			tecno = "No hay tegnologías definidas.";
		} else {
			
			tecno = "[";
			for(int i=0; i < this.numTecnologias - 1; ++i){
				tecno+=this.tecnologia[i]+",";
			}
			tecno+=this.tecnologia[this.numTecnologias-1]+"]";
		}
		
		return tecno;
	}
	
	public String toString(){
		return String.format("%sTecnologías: %s\n", super.toString(),this.mostrarTecnologia());
	}
	


}
