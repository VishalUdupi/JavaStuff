package Training;

import java.util.*;

public class part2 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		int arr[][]=new int[3][6];
		for(int i=0;i<arr.length;i++) {
			int total=0;
			for(int j=0;j<arr[0].length-2;j++) {
				System.out.println("Marks of Student "+(i+1)+" in subject "+(j+1)+" are : ");
				arr[i][j]=sc.nextInt();
				total+=arr[i][j];
			}
			arr[i][arr[0].length-2]=total;
			arr[i][arr[0].length-1]=total/4;
			System.out.println("Total Marks of Student "+(i+1)+" out of 400 are : "+arr[i][4]);
			System.out.println("Overall Percentage of Student "+(i+1)+" is : "+arr[i][5]+"\n");
		}
	}
}
