package design.salestaxproblem.item;

public class Item implements ItemInterface {

	private String itemName;
	private float itemPrice;
	private String itemDesc;
	private int itemQty;
	private float itemSalesTax;
	private ItemType itemType;

	public Item(String itemName, float itemPrice, int itemQty, ItemType itemType) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQty = itemQty;
		this.itemType = itemType;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	@Override
	public float getItemsSalesTax() {
		return itemSalesTax;
	}

	@Override
	public void setItemSalesTax(float itemSalesTax) {
		this.itemSalesTax = itemSalesTax;
	}

	@Override
	public float getItemPriceWithTax() {
		return getItemPrice() + (getItemPrice() * getItemsSalesTax());
	}

	@Override
	public boolean isExempted() {
		return itemType.isExempted();
	}

	@Override
	public boolean isImported() {
		return itemType.isImported();
	}

	@Override
	public ItemType getItemType() {
		return itemType;
	}
	
	
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemDesc=" + itemDesc + ", itemQty="
				+ itemQty + ", itemSalesTax=" + itemSalesTax + ", itemType=" + itemType + "]";
	}

}