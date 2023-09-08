public class Obrero extends Panetar {
	
	Pintar pintar;

	public void mezlcar(String type) {
		System.out.println("Mezclando " + type);
	}

	public Obrero() {
		pintar = new Pintar();
	}

	public void pintar() {
		this.pintar.pintar();
	}

	public String prepararPintura() {
		return this.pintar.prepararPintura();
	}
}
