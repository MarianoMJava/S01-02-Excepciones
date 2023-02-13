package s0102n1ejercicio1;

public class VentaVaciaExcepcion extends Exception {

	public VentaVaciaExcepcion(String errorMessege) {
		super(errorMessege);

	}

	@Override
	public String toString() {
		return "VentaVaciaExcepcion: " + getMessage();
	}

}
