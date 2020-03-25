package design.salestaxproblem.checkout;

import design.salestaxproblem.calculation.SalesTaxCalculator;
import design.salestaxproblem.calculation.TaxCalculatorInterface;
import design.salestaxproblem.item.Item;

public class CheckoutAndPay implements Checkout {

	@Override
	public void checkoutAndGenerateReceipt(Cart cart) {
		TaxCalculatorInterface calcualtor = new SalesTaxCalculator();

		float totalSalesTax = 0;
		float total = 0;
		for (Item item : cart.getItems()) {
			calcualtor.calculate(item);
			StringBuilder sb = new StringBuilder();
			float val = (float)(Math.ceil(item.getItemPriceWithTax() / 0.05 ) * 0.05);
			sb.append(item.getItemName()).append(":").append(val);
			System.out.println(sb.toString());
			total = total + item.getItemPriceWithTax();
			totalSalesTax =   totalSalesTax + (float)(Math.ceil ( (item.getItemPriceWithTax() - item.getItemPrice()) / 0.05) *0.05);
			
		}
		
		total = (float) (Math.ceil(total / 0.05 ) * 0.05);
		
		StringBuilder sb = new StringBuilder("Sales Tax").append(": ").append(totalSalesTax).append(" Total ")
				.append(": ").append(total).append("\n");
		System.out.println(sb.toString());
	}
}
