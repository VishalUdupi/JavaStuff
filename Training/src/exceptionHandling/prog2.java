package exceptionHandling;

import java.util.*;

public class prog2 {
	public static void main (String[] args) {
		try {
		System.out.println("Enter 2 numbers");
		Scanner in = new Scanner(System.in);
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int res = a1/a2;
		System.out.println("The answer is: - "+res);
		if (a2 == 0) {
			throw new ArithmeticException("Division by zero is not possible.");
		}
		} catch(ArithmeticException e) {
			System.out.println("Division by zero is not possible.");
		} finally {
			System.out.println("Thanks for using the application.");
		}
	}
}
