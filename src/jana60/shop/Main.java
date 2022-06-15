package jana60.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product[] shop = new Product[5];

		Product prod1 = new Product("Bic", "Accendino", 1.05f, 23);
		Product prod2 = new Product("AZ", "Dentifricio", 2.50f, 22);
		Product prod3 = new Product("Coccolino", "Ammorbidente", 3.20f, 23);
		Product prod4 = new Product("Panificio Michelangelo", "Pane senza glutine", 1.50f, 5);
		Product prod5 = new Product("Roventa", "Piastra per capelli", 10.70f, 23);

		shop[0] = prod1;
		shop[1] = prod2;
		shop[2] = prod3;
		shop[3] = prod4;
		shop[4] = prod5;

		for (int i = 0; i < shop.length; i++) {

			System.out.println(shop[i].fraseFinale());
		}

	}
}
