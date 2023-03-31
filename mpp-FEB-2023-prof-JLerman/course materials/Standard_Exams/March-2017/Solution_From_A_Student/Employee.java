package test1;

import java.util.List;
import java.util.ArrayList;

public class Employee {
	private String name;
	private List<Account> accountList;
	
	public Employee(String name) {
		this.name = name;
		
		accountList = new ArrayList<>();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addAccount(Account account) {
		this.accountList.add(account);
	}
	
	public double computeUpdatedBalanceSum() {
		//implement
		double sum = 0;
		for (Account acct : accountList) {
			sum += acct.computeUpdatedBalance();
		}
		
		return sum;
	}
}
