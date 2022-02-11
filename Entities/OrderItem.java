package Entities;


public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product prod;
	
	public OrderItem(Integer quantity, Double price, Product prod) {
		this.quantity = quantity;
		this.price = price;
		this.prod = prod;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		return quantity * price;
	}
	
	public String toString(){
		return  prod.getName() + ", $" + prod.getPrice() + ", Quantity: " + quantity + " Subtotal: $" + subTotal() + "\n";
	}
}
