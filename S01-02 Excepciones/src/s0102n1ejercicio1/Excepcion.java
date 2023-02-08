package s0102n1ejercicio1;

public class Excepcion {

	private String messege;

	public Excepcion(String messege) {
		this.messege = messege;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	@Override
	public String toString() {
		return "Excepcion [messege=" + messege + "]";
	}

}
