package StrPrac;

import java.util.Scanner;

public class lastLetter {
	static String getLastLetter(String[] arr) {
		String finalStr = "";
		for(String pq: arr) {
			int strlen = pq.length();
			String last = pq.substring((strlen-1), strlen);
			String ch = last.toUpperCase();
			finalStr = finalStr.concat(ch.concat("$"));
		}
		return finalStr;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter you sentence");
		String sentence = in.nextLine();
		String[] arr = sentence.split(" ", 0);
		System.out.println(getLastLetter(arr));
	}
}
