package design.salestaxproblem;

import design.salestaxproblem.checkout.Cart;
import design.salestaxproblem.checkout.Checkout;
import design.salestaxproblem.checkout.CheckoutAndPay;
import design.salestaxproblem.item.Item;
import design.salestaxproblem.item.ItemType;

public class Main {

	public static void main(String args[]) {

		Item item1 = new Item("book", 12.49f, 1, ItemType.BOOK);
		
		Item item2 = new Item("Music CD", 14.99f, 1, ItemType.MISC);
		Item item3 = new Item("box of chocolates", 0.85f, 1, ItemType.FOOD);
		
		
		Item item4 = new Item("imported bottle of perfume", 47.50f, 1, ItemType.IMPORTED_MISC);
		Item item5 = new Item("bottle of perfume", 18.99f, 1, ItemType.MISC);
Item item6 = new Item("Imported box of choc",10f, 1 ,ItemType.IMPORTED_FOOD);
		Cart cart = new Cart();
		//cart.addItemToCart(item1);
		//cart.addItemToCart(item3);
		//cart.addItemToCart(item2);
		//cart.addItemToCart(item4);
		cart.addItemToCart(item4);
		cart.addItemToCart(item6);

		Checkout generateReceipt = new CheckoutAndPay();
		generateReceipt.checkoutAndGenerateReceipt(cart);
	}
}
