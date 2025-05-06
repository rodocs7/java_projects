package entities;

public class Product { //nome da classe do objeto
	
	
	// atributos

	private String name;
	private double price;
	private int quantity;
	
	
	public Product(String name, double price, int quantity) {   // um construtor com argumentos
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {   // sobrecarga
		this.name = name;
		this.price = price;
	}
	
	
	
	//as linhas aqui de get e set sao para o encapsulamento
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	
	 // operacoes ou métodos
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	
	public void addProducts(int quantity) { // esse quantity é um "parÂmetro do método", ele vai receber os novos quantitys
		this.quantity += quantity; //esse this.quantity é para esse atributo nesta classe, mais o quantity de cima que chegou 
	}
	
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	
	
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " unit, Total: $"
				+ String.format("%.2f", totalValueInStock());
		
	}
	
 
}

