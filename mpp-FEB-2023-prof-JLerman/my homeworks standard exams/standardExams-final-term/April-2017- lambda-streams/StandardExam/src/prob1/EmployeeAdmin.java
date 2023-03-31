package prob1;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeAdmin {

	// returns a list of social security numbers, sorted in ascending order,
	// that belong to an Employee in the input table but that are not on the
	// socSecNums input list
	public static List<String> prepareSsnReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
//		List<String> resp = table.keySet().stream()
//				.filter( (ssN) -> {
//					for(String s: socSecNums){
//						if(s.equals(ssN)) return false;
//					}
//					return true;
//				})
//				.sorted()
//				.collect(Collectors.toList());
//
//		return resp;

		return table.keySet().stream()
				.filter( (ssN) -> !socSecNums.contains(ssN))
				.sorted()
				.collect(Collectors.toList());

				
	}			
		//return a list of Employees whose social security number is on the input list socSecNums
				//and whose salary is >80000; the return list does not need to be sorted  
	public static List<Employee> prepareEmpReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
//		List<Employee> res = table.keySet()
//				.stream()
//				.filter( (empSSN) -> {
//					for(String socsecN: socSecNums){
//						if(empSSN.equals(socsecN)) return true;
//					}
//					return false;})
//				.map( (ssN) -> table.get(ssN))
//				.filter((emp) -> emp.getSalary()>80_000)
//				.collect(Collectors.toList());

		return table.values()
				.stream()
				.filter( (emp) -> socSecNums.contains(emp.getSsn()))
				.filter( (emp) -> emp.getSalary()>80_000)
				.collect(Collectors.toList());

//		return res;
	}
}