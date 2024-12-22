package StrPrac;

import java.util.*;

public class startCase {
	
	static String printCapitalized(String[] arr) {
		String finalStr = "";
		for(String pq: arr) {
			char ch  = Character.toUpperCase(pq.charAt(0));
			String str1 = String.valueOf(ch);
			String str2 = pq.substring(1) + " ";
			finalStr = finalStr.concat(str1.concat(str2));
		}
		return finalStr;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter you sentence");
		String sentence = in.nextLine();
		String[] arr = sentence.split(" ", 0);
		System.out.println(printCapitalized(arr));
	}
}
