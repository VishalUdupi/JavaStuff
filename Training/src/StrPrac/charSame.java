package StrPrac;

import java.util.Scanner;

public class charSame {
	static String charSame(String str)
	{
		String str1 = str.toUpperCase();
		if(str1.charAt(0) == str1.charAt(str1.length()-1)) {
			return "Valid String";
		}
		else {
			return "Invalid String";
		}
	}	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(charSame(str));
		}
}
