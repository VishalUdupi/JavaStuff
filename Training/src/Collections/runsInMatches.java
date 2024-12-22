package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class runsInMatches {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<Integer>();
		System.out.println("Enter the team name");
		String name = in.next();
		System.out.println("Enter the number of matches played in home ground");
		int nMatchesHome = in.nextInt();
		for (int i=0;i<nMatchesHome; i++) {
			int runsSc = in.nextInt();
			list1.add(runsSc);
		}
		System.out.println("Enter the number of matches played in other ground");
		int nMatchesOther = in.nextInt();
		for (int i=0;i<nMatchesOther; i++) {
			list1.add(in.nextInt());
		}
		for (int i=0;i<list1.size(); i++) {
			System.out.printf("Runs scored by" + name, list1);
		}
		System.out.println("Run scored by Chennai Super Kings more than 300");
		for (int i:list1) {
			if(i>300) {
				System.out.println("i");
			}
		}
	}
}
