package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class runsScored {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nMatches = in.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<nMatches; i++) {
			list.add(in.nextInt());
		}
		int arr = list.stream().mapToInt(Integer::intValue).sum();
		int total = IntStream.of(arr).sum();
		float avg = total/nMatches;
		System.out.printf("Total runs scored by CSK",total);
		System.out.printf("Average runs scored by CSK: %.2f",avg);
	}
}
