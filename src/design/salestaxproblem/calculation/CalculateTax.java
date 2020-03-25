package design.salestaxproblem.calculation;

import design.salestaxproblem.item.ItemInterface;

public class CalculateTax {
	
	static float calculateTotalTax(ItemInterface item) {
		return new SalesTaxCalculator().calculate(item);
	}
}
