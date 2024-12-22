package CollectionsP3;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee implements Comparable<Employee>{
	private int id1;
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;
	
	private static int id = 1;
	
	public int getId() {
		return id1;
	}
	public void setId(int id1) {
		this.id1 = id1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee() {
		
	}
	public Employee(String name, String department, Date dateOfJoining, int age, int salary) {
		this.id1 = id1++;
		this.name=name;
		this.department=department;
		this.dateOfJoining=dateOfJoining;
		this.age=age;
		this.salary=salary;
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if(this.getSalary() > e.getSalary()) {
			return 1;
		}else if(this.getSalary() < e.getSalary()) {
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		String pattern = "dd/MM/yyyy";
	    SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
	    String dojStr = dateFormat.format(dateOfJoining);
		String str = String.format("%-10s %-15s %-30s %-30s %-10s %-10s\n", id1, name, department, dojStr,age,salary);
		return str;
	} 
}

class AgeComparator implements Comparator<Employee> {


	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if(emp1.getAge() > emp2.getAge() ) {
			return 1;
		}else if(emp1.getAge() < emp2.getAge()) {
			return -1;
		}else {
			return emp1.getDateOfJoining().compareTo(emp2.getDateOfJoining());
		}
	}
	
}

class employeeBO{
	public static void printEmployees(List<Employee> emp) {
		Iterator<Employee> itr = emp.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}



public class employeeData {
	public static Employee getEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name of Employee: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Department of Employee: ");
		String dName = sc.nextLine();
		
		System.out.println("Enter DOJ of Employee(DD/MM/YYYY): ");
		String[] date = sc.nextLine().split("/");
		
		 Calendar calendar = Calendar.getInstance();
	      // Set year, month and date
	      calendar.set(Calendar.YEAR, Integer.parseInt(date[2]));
	      calendar.set(Calendar.MONTH, Integer.parseInt(date[1]));
	      calendar.set(Calendar.DATE, Integer.parseInt(date[0]));
	      // date object
	      Date doj = (Date) calendar.getTime();
	      		
	      System.out.println("Enter Age of Employee: ");
	      int age = sc.nextInt();
	      
	      System.out.println("Enter Salary of Employee: ");
	      int sal = sc.nextInt();
	      
	      Employee emp = new Employee(name,dName,doj,age,sal);
	      return emp;
		
	}
	
	public static void displayOptions() {
		System.out.println("1.Sort Employees by Salary");
		System.out.println("2.Sort Employees by Age and by date of joining");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the number of Employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		List<Employee> empList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the details for employee " + (i+1));
			empList.add(getEmployeeDetails());
		}
		
		displayOptions();
		int choice = sc.nextInt();
		
		if(choice == 1) {
			Collections.sort(empList);
		}else {
			Collections.sort(empList, new AgeComparator());
		}
		System.out.printf("%-10s %-15s %-30s %-30s %-10s %-10s\n", "Employe Id", "Name", "Department", "Date Of Joining", "Age", "Salary" );
		
		employeeBO.printEmployees(empList);
	}

}
