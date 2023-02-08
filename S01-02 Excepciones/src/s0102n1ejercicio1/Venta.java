package s0102n1ejercicio1;

import java.util.ArrayList;

public class Venta {

	private ArrayList<Producto> productos;
	private double totalVentas;

	public Venta(ArrayList<Producto> productos) {
		this.productos = productos;

	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void calcularTotal(ArrayList<Producto> productos) {

		double totalVentas = 0;
		int i = 0;

		try {

			do {

				totalVentas = totalVentas + productos.get(i).getPrecio();

				i++;

			} while (i < productos.size());

		} catch (Exception e) {
			
			final String MESSEGEVV = "Para hacer una venta primero debes anadir productos";

			Excepcion vv = new VentaVaciaExcepcion(MESSEGEVV);

			System.out.println(vv.getMessege());

		} finally {

			System.out.println("Total de ventas: " + totalVentas);

		}

	}

	@Override
	public String toString() {
		return "Venta [productos=" + productos + ", totalVentas=" + totalVentas + "]";
	}

}
