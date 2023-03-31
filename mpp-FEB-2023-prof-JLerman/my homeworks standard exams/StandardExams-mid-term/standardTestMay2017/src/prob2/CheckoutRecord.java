package prob2;

import java.util.*;

public class CheckoutRecord {

	private ArrayList<CheckoutRecordEntry> checkoutRecordEntryList;
	private LibraryMember lm;
	
	public CheckoutRecord() {
		this.checkoutRecordEntryList = new ArrayList<CheckoutRecordEntry>();
	}

	public ArrayList<CheckoutRecordEntry> getCheckoutEntryList() {
		return this.checkoutRecordEntryList;
	}

	public void addCheckoutEntry(CheckoutRecordEntry entry){
        this.checkoutRecordEntryList.add(entry);
    }

}
