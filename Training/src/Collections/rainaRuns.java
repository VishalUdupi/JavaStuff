package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class rainaRuns {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nMatches = in.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<nMatches; i++) {
			list.add(in.nextInt());
		}
		Collections.sort(list);
		for (int i=0;i<nMatches; i++) {
			System.out.println(list);
		}
		
	}
}
