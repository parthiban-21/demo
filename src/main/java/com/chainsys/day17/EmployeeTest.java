package main.java.com.chainsys.day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp[] = new Employee[100];
		
		emp[0] = new Employee("Ram",21,10000,"HR","M");
		emp[1] = new Employee("Akesh",26,12000,"Trainee","M");
		emp[2] = new Employee("Preethi",24,24000,"Trainee","F");
		
		ArrayList<Integer>  salary = new ArrayList<Integer>();
		for(int i=0;i<3;i++)
			salary.add(emp[i].salary);
		
		ArrayList<String>  dept = new ArrayList<String>();
		for(int i=0;i<3;i++)
			dept.add(emp[i].department);
		
		ArrayList<String>  gender = new ArrayList<String>();
		for(int i=0;i<3;i++)
			gender.add(emp[i].gender);
		long numMale = gender.stream().filter(x -> x.equals("M")).count();
		System.out.println("No of Male Employee: "+numMale);
		
		long numFemale = gender.stream().filter(x -> x.equals("F")).count();
		System.out.println("No of Female Employee: "+numFemale);
		
		System.out.println("No of Employee in HR Department: "
				+dept.stream().filter(x -> x.equals("HR")).count());
		System.out.println("No of Employee in Trainee Department: "
				+dept.stream().filter(x -> x.equals("Trainee")).count());
		
		ArrayList<Employee> arr = new ArrayList<Employee>();
		arr.add(emp[0]);
		arr.add(emp[1]);
		arr.add(emp[2]);
		
		Optional<Employee> maxSalary = arr.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Employee with max salary:" + (maxSalary.isPresent() ? maxSalary.get().name : "Not Applicable"));
		
        Optional<Employee> minSalary = arr.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Employee with max salary:" + (minSalary.isPresent() ? minSalary.get().name : "Not Applicable"));
	
        Stream<Employee> hrName = arr.stream();
        hrName.filter(s -> s.department == "HR").forEach(n -> System.out.println(n.name));
        
        Optional<Employee> olderEmp = arr.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
        System.out.println((olderEmp.isPresent() ? olderEmp.get(): "Not Applicable"));
        
        Stream<Employee> sal = arr.stream();
        int total = sal.mapToInt(n -> n.salary).sum();
        System.out.println("Total Salary: "+total+"\nAverage Salary: "+(total/(numMale+numFemale)));
        
        Stream<Employee> maleSalary = arr.stream();
        int mSalary = maleSalary.filter(a -> a.gender =="M").mapToInt(n -> n.salary).sum();
        System.out.println("Average Male Salary: "+mSalary/numMale);
        
        Stream<Employee> femaleSalary = arr.stream();
        int fSalary = femaleSalary.filter(a -> a.gender =="F").mapToInt(n -> n.salary).sum();
        System.out.println("Average Female Salary: "+fSalary/numFemale);
	}

}
