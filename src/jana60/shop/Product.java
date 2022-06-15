package jana60.shop;

public class Product {
	public Product() {
	}

	String marca, nome;
	float prezzo;
	int Iva;

	public Product(String marca, String nome, float prezzo, int iva) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		Iva = iva;
	}

}
