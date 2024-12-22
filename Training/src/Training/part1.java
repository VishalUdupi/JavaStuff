package Training;

import java.util.*;
import java.lang.Math;

public class findPow{
    private int total=0;
    public int findPow(int[] arr){
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=(int) Math.pow(arr[i],i);
            
        }
    total = Arrays.stream(arr).sum();
    return total;
    }
}

public class part1 {
	public static void main(String args[]) {
	      int[] arr = new int[] {1,2,3,4,5};
	      findPow f = new findPow();
	      System.out.println(f.findPow(arr));
	    }
}
