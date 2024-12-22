package exceptionHandling;

import java.util.*;

class Candidate{
private String name;
private String gender;
private double expectedSalary;

public Candidate() {
	super();
	// TODO Auto-generated constructor stub
}
public Candidate(String name, String gender, double expectedSalary) {
	super();
	this.name = name;
	this.gender = gender;
	this.expectedSalary = expectedSalary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public double getExpectedSalary() {
	return expectedSalary;
}
public void setExpectedSalary(double expectedSalary) {
	this.expectedSalary = expectedSalary;
}
}

class InvalidSalaryException extends Exception{
	public InvalidSalaryException(String message) {
		super(message);
	}
}

public class genevaTech {
	public static Candidate getCandidateDetails() {
		Candidate c =new Candidate();
		String name = c.getName();
		String gender = c.getGender();
		double expSalary = c.getExpectedSalary();
		Candidate c1 = new Candidate(name, gender, expSalary);
		return c1;
	}
	public static void main (String[] args) throws InvalidSalaryException {
		System.out.println("Enter the candidate Details");
		Scanner in = new Scanner(System.in);
		System.out.println("Name");
		String name = in.nextLine();
		System.out.println("Gender");
		String gender = in.nextLine();
		System.out.println("Expected Salary");
		double expSal = in.nextDouble();
		if(expSal < 10000) {
			throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
		}
		System.out.println("Registration Successful");
	}
}
