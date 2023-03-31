package prob2;

public class SavingsAccount extends Account{

	private String acctId;
	private double balance;
	private double interestRate;
	
	public SavingsAccount(String acctId, double interestRate, double balance) {
		this.acctId = acctId;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	@Override
	public String getAccountId() {
		return this.acctId;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return this.balance + (this.interestRate * this.balance);
	}

}
