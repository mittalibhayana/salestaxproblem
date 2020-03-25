package design.salestaxproblem.calculation;

import design.salestaxproblem.item.ItemInterface;

public class SalesTaxCalculator implements TaxCalculatorInterface {

	@Override
	public float calculate(ItemInterface item) {
		TaxType taxType = getTaxType(item);
		item.setItemSalesTax(taxType.getApplicableTax());
		return item.getItemsSalesTax();
	}

	private TaxType getTaxType(ItemInterface item) {

		TaxType taxCalculation = null;
		
		if (!item.isExempted() && item.isImported()) {
			taxCalculation = TaxType.BOTH;
		} else if (!item.isExempted()) {
			taxCalculation = TaxType.BASIC_SALES_TAX;
		} else if (item.isImported()) {
			taxCalculation = TaxType.IMPORT_DUTY;
		} else {
			taxCalculation = TaxType.NA;
		}
		return taxCalculation;
	}

}
