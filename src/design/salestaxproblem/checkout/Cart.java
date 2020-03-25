package design.salestaxproblem.checkout;

import java.util.ArrayList;
import java.util.List;

import design.salestaxproblem.item.Item;

public class Cart {

	private List<Item> items;

	public Cart() {
		items = new ArrayList<Item>();
	}
	public List<Item> getItems() {
		return items;
	}
	

	public void addItemToCart(Item item) {
		items.add(item);
	}
	
}
