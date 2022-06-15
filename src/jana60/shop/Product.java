package jana60.shop;

import java.text.DecimalFormat;

public class Product {

	public Product() {
	}
	// Creazione variabili base

	String marca, nome;
	float prezzo;
	int iva;

	// Formattatore decimale
	DecimalFormat df = new DecimalFormat("#.00€");

	// Definizione metodo immissione dati

	public Product(String marca, String nome, float prezzo, int iva) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	// Calcolo del prezzo Iva
	public float calcolaIva() {
		return prezzo + ((prezzo / 100) * iva);
	}

	// Per stampare la frase finale con prodotto
	public String fraseFinale() {

		return "Il prezzo finale del prodotto " + nome + " della marca " + marca + " è di: " + df.format(calcolaIva());
	}
}