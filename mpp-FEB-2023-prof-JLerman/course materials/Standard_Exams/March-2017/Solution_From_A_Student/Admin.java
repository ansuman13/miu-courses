package test1;
import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double sum = 0;
		for (Employee emp : list) {
			sum += emp.computeUpdatedBalanceSum();
		}
		return sum;
	}
}
