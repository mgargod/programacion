package ejercicios;

public class PruebaProducto {

	public static void main(String[] args) {

		Producto producto1 = new Producto();
		Producto producto2 = new Producto();
		
		producto1.setCodigo(111111);
		producto1.setPrecio(24.56);
		producto1.setDescuento(20);
		
		producto2.setDescuento(producto1.getDescuento());
		
		System.out.printf("Precio total producto1: %.2f €\n", producto1.getPrecioTotal());
		
		System.out.printf("Precio total producto2: %.2f €\n", producto2.getPrecioTotal(38.95));
		
		
		
	}

}
