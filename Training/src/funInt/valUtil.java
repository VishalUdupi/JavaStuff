package funInt;

import java.util.Scanner;

public class valUtil {
	static ValidateName validateEmployeeName() {
		
		ValidateName vName=(name)->{
			return name.length()<=20 && name.length()>=5 && name.matches("^[A-Za-z ]+$"); 
			
		};
		return vName;
		}
	static ValidateName validateProductName() {
		ValidateName vName=(name)->{
			return name.length()==6 && name.matches("[A-Z]{1}[0-9]{5}"); 
			
		};
		return vName;	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name");
		if(validateEmployeeName().validateName(sc.nextLine())) {
			System.out.println("Employee Name is Valid");
		}
		else {
			System.out.println("Employee Name is Not Valid");
		}
		System.out.println("Enter Product Name");
		if(validateProductName().validateName(sc.nextLine())) {
			System.out.println("Product Name is Valid");
		}
		else {
			System.out.println("Product Name is Not Valid");
		}
	}
}
