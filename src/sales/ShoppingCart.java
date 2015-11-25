package sales;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import customer.Customer;
import item.Item;

public class ShoppingCart {
	private List<Item> cart;
	private Customer customer;
	private int quantityItems;     
	private double totalPrice;

	public ShoppingCart(Customer customer) {
		cart = new LinkedList<Item>();
		this.customer = customer;
		this.quantityItems = 0;
		this.totalPrice = 0;
	}

	public List<Item> getCart() {
		return cart;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getQuantityItems() {
		return quantityItems;
	}

	public void setQuantityItems(int quantityItems) {
		this.quantityItems = quantityItems;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void addToCart(Item item, int quantity) { 
		int quantityIndex = quantity;

		while(quantityIndex != 0) {
			cart.add(item);
			quantityIndex = quantityIndex-1;
		}

		totalPrice = totalPrice + (item.getPrice() * quantity);
		quantityItems = quantityItems + quantity; 
	}

	public void removeFromCart(Item item, int quantity) {
		int quantityIndex = quantity;

		while(quantityIndex != 0) {
			cart.remove(item);
			quantityIndex = quantityIndex-1;
		}

		totalPrice = totalPrice - (item.getPrice() * quantity);
		quantityItems = quantityItems - quantity; 
	}

	@Override
	public String toString() {
		String contents = "Shopping Cart:\n";
		Iterator<Item> iteratorCart = cart.iterator();

		while(iteratorCart.hasNext()) {
			Item currentItem = iteratorCart.next();
			contents = contents + currentItem.toString() + "\n";
		}
		return contents + "\nQuantity: " + getQuantityItems() + "\tTotal price: " + getTotalPrice();
	}
}
