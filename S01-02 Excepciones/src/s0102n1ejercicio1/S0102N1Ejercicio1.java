package s0102n1ejercicio1;

import java.util.ArrayList;

public class S0102N1Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<Producto> productos = new ArrayList<Producto>();

		/*Producto p1 = new Producto("Cerveza", 2.5);
		Producto p2 = new Producto("Pan", 4);
		Producto p3 = new Producto("Atun", 3);
		Producto p4 = new Producto("Naranja", 10);

		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		*/

		Venta v1 = new Venta(productos);

		v1.calcularTotal(productos);

	}

}
