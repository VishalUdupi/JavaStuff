package StrPrac;

import java.util.Scanner;

public class swapCharacter {
	static String swapCharacter(String str) {
		char[] ch = str.toCharArray();
		int i=0;
		char temp;
		while(i<((ch.length)-2)) {
			temp = ch[i];
			ch[i] = ch[i+1];
			ch[i+1] = temp;
			i+=2;
		}
		String str1 = String.valueOf(ch);
		return str1;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(swapCharacter(str));
		}
}
