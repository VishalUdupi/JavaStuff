package exceptionHandling;

import java.util.*;

class outOfBoundsException extends Exception{
	public outOfBoundsException(String Message) {
		super(Message);
	}
}

class inputMismatchException extends Exception{
	public inputMismatchException(String Message) {
		super(Message);
	}
}

public class part1 {
	public static void main(String[] args) {
		try {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		List <Integer> list = new ArrayList();
		int number = in.nextInt();
		System.out.println("Enter the price details");
		for(int i=0; i<number; i++) {
			list.add(in.nextInt());
			list.add(in.nextInt());
			if(list.get(i).getClass().getSimpleName() != list.get(i+1).getClass().getSimpleName())
			{
				throw new inputMismatchException("Different input entered");
			}
		}
		System.out.println("Enter the index of the array element you want to access");
		int acc = in.nextInt();
		if(acc>number) {
			throw new outOfBoundsException("Array index is out of range");
		}
		} catch(outOfBoundsException e) {
			return;
		} catch (inputMismatchException e) {
			return;
		}
	}
}
