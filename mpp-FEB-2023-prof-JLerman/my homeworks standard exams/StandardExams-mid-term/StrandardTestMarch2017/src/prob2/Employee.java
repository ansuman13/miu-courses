package prob2;
import java.util.*;

public class Employee {
	
	private String name;
	private List<Account> accounts;
	
	public Employee(String name) {
		this.name = name;
		accounts = new ArrayList<Account>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addAccount(Account acct) {
		this.accounts.add(acct);
	}
	
	public double computeUpdatedBalanceSum() {
		//implement
		double result = 0;
		for(Account ac: accounts) {
			result += ac.computeUpdatedBalance();
		}
		return result;
	}
}
