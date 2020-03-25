package design.salestaxproblem.item;

public enum ItemType {

	BOOK(true, false), MEDICAL(true, false), FOOD(true, false), MISC(false, false) , IMPORTED_FOOD(true,true), IMPORTED_MISC(false, true);
	
	private boolean isExempted;
	private boolean isImported;

	ItemType(boolean isExempted, boolean isImported) {
		this.isExempted = isExempted;
		this.isImported = isImported;
	}

	public boolean isExempted() {
		return isExempted;
	}

	public void setExempted(boolean isExempted) {
		this.isExempted = isExempted;
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}

}
