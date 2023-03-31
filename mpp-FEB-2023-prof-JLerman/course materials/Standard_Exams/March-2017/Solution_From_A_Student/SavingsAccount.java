package test1;

public class SavingsAccount extends Account {
	private double balance;
	private double interestRate;
	private String acctId;
	
	public SavingsAccount(String acctId, double interestRate, double startBalance) {
		this.acctId = acctId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getAccountId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	
	public double computeUpdatedBalance() {
		return balance + (balance * interestRate);
	}
}
