package prob2;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members 
	//who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		//implement
		
		for(LibraryMember lm:members) {
			CheckoutRecord cr = lm.getCheckoutRecord();
			ArrayList<CheckoutRecordEntry> checkoutEntryList = cr.getCheckoutEntryList();
			for(CheckoutRecordEntry row: checkoutEntryList) {
				LendingItem item1 = row.getLendingItem();
				if(item1.equals(item)) {
					phoneNums.add(lm.getPhone());
				}
			}
		}
		
		phoneNums.sort(null);
		
		
		return phoneNums;
	}
}
