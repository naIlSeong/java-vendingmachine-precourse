package vendingmachine.model;

public class Product {

	private final String name;
	private final int price;
	private int quantity;

	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void subtractQuantity() {
		this.quantity--;
	}

	public boolean isEmpty() {
		return this.quantity == 0;
	}

}
