package Oops;

import java.util.Scanner;

class Student{
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
}

public class checkWhether {
	public static void main(String[] args) {
		Student student = new Student();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student Id");
		int id = in.nextInt();
		student.setStudentId(id);
		System.out.println("Enter Student Name");
		String name = in.next();
		student.setStudentName(name);
		System.out.println("Enter Student Address");
		String add = in.next();
		student.setStudentAddress(add);
		System.out.println("Whether student is from NIT (Yes/No)");
		String confirm = in.next();
		if(confirm == "Y" || confirm == "y") {
			System.out.println("Wrong Input");
		}
		else if(confirm == "No" || confirm == "no") {
			System.out.println("Enter Student College Name");
			String cName = in.next();
			student.setCollegeName(cName);
		}
		else {
			String cName = "NIT";
			student.setCollegeName(cName);
		}
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentAddress());
		System.out.println(student.getCollegeName());
	}

}
