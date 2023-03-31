package test1;

public class CheckingAccount extends Account {
	private double balance;
	private double monthlyFee;
	private String acctId;
	
	public CheckingAccount(String acctId, double fee, double startBalance) {
		this.balance = startBalance;
		this.monthlyFee = fee;
		this.acctId = acctId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	public String getAccountId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	
	public double computeUpdatedBalance() {
		return balance - monthlyFee;
	}
	
	
}
