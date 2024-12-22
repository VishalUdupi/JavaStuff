package StrPrac;

import java.util.Scanner;
import java.util.regex.Pattern;

public class testVowels {
	static void testVowels(String str) {
		if(Pattern.matches("[aeiou]", str)){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		testVowels(str);
	}
}
