package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
// pra permitir que seja acessado, já que lá em cima tá como private
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
//nao retorna nada, so altera o valor do quantity
		this.quantity += quantity;
//adiciona o valor colocado ao quantity
//se referindo ao quantity la de cima
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
//vai transformar tais classes de objeto em strings
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}
}