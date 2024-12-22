package StrPrac;

import java.util.*;
import java.util.regex.Pattern;

public class validatePan {
static void validateDetails(String str) {
	char[] ch = str.toCharArray();
		if(str.length()== 8) {
			if(Pattern.matches("[a-zA-z]", str.substring(0, 2))) {
				if(Pattern.matches("/d", str.substring(3, 6))) {
					if(Pattern.matches("/D", str.substring(7))) {
						System.out.println("Valid");
					}
				}
			}
		}
		else {
			System.out.println("Not Valid");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String detailStr = in.nextLine();
		validateDetails(detailStr);
	}
}
