package s0102n1ejercicio1;

public class VentaVaciaExcepcion extends Excepcion {

	public VentaVaciaExcepcion(String messege) {
		super(messege);

	}

	@Override
	public String toString() {
		return "VentaVaciaExcepcion: " + getMessege();
	}

}
