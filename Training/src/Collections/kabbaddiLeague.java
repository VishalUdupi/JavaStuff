package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kabbaddiLeague {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the top 5 raiders of PKL Season 3");
		List<String> list = new ArrayList<String>();
		for (int i=0;i<5; i++) {
			list.add(in.next());
		}
		System.out.println("Enter the top 5 raiders of PKL Season 4");
		List<String> list1 = new ArrayList<String>();
		for (int i=0;i<5; i++) {
			list1.add(in.next());
			}
		list.retainAll(list1);
		for(String g:list) {
			System.out.println("Best Raiders");
			System.out.println(g);
		}
	}
}
