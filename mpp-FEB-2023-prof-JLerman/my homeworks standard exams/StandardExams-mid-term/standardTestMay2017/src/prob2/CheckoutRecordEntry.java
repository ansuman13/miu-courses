package prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {

	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LendingItem item;
	private ItemType lendingItemType;

	public CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type) {
		 this.item = item;
		 this.checkoutDate = chDate;
		 this.lendingItemType = type;
		 this.dueDate = dueDate; 
	 }

	public LocalDate getCheckoutDate() {
		 return this.checkoutDate;
	 }

	public LocalDate getDueDate() {
		return this.dueDate;
	}

	public LendingItem getLendingItem() {
		return this.item;
	}

	public ItemType getLendingItemType() {
		return this.lendingItemType;
	}

}
