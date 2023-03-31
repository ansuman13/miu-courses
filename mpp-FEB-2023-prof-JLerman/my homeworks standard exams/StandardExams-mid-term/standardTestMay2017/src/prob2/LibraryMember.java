package prob2;

public class LibraryMember {

	private String memberId;
	private String firstName;
	private String lastName;
	private String phone;
	private CheckoutRecord cr;
    	
	public LibraryMember(String memberId, String firstName, String lastName, String phone) {
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public String getMemberId() {
		return this.memberId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getPhone() {
		return this.phone;
	}

	public CheckoutRecord getCheckoutRecord() {
		return this.cr;
	}

	public void setCheckoutRecord(CheckoutRecord cr) {
		this.cr = cr;
	}

}
