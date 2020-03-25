package design.salestaxproblem.calculation;

public enum TaxType {
	IMPORT_DUTY(5f/ 100), BASIC_SALES_TAX(10f/ 100), BOTH(IMPORT_DUTY.getApplicableTax() + BASIC_SALES_TAX.getApplicableTax()), NA(0);

	private float val;

	TaxType(float val) {
		this.val = val;
	}

	public float getApplicableTax() {
		return val;
	}
}
