package test3;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> recordEntryList;
	
	public CheckoutRecord() {
		recordEntryList = new ArrayList<>();
	}
	
	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return recordEntryList;
	}
	
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		recordEntryList.add(entry);
	}
	
}
