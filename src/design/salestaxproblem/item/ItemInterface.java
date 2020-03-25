package design.salestaxproblem.item;

public interface ItemInterface {

	
	public float getItemsSalesTax();
	public float getItemPriceWithTax();
	public void setItemSalesTax(float itemSalesTax);
	public boolean isExempted() ;
	public boolean isImported();
	public ItemType getItemType();
		

}
