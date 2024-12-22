package Training;

import java.util.*;

public class maxCorners {
	static int getMaxCorners(int[] arr) {
		 if(arr.length<=0)
			 return 0;
		 
		 return Math.max(arr[0],Math.max(arr[arr.length/2],arr[arr.length-1]));
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		
		System.out.println(getMaxCorners(arr));
				
	}
}
