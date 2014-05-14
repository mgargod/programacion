package ejerciciosIniciales;

public class Punto3DPrivado extends PuntoPrivado{
	
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Punto3DPrivado [z=" + z + ", x=" + getX() + ", y="
				+ getY() + "]";
	}
	
	

}
