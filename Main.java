public class Main {
	public static void main(String[] args) {
		String type;

		Obrero obrero = new Obrero();

		// Maquina va a pintar
		System.out.println("----- maquina pintadora --------");

		type = obrero.prepararPintura();
		obrero.mezlcar(type);
		obrero.pintar();

		// Maquina va a pañetar
		System.out.println("----- maquina pañetadora --------");

		type = obrero.prepararCemento();
		obrero.mezlcar(type);
		obrero.panetar();
	}
}
