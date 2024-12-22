package Training;

import java.util.*;
import java.lang.Math;

class diff{
    private int maximum;
    private int minimum;
    private int diff;
    public int eleDiff(int[] arr)
    {
        maximum = Collections.max(Arrays.asList(arr));
        minimum = Collections.min(Arrays.asList(arr));
        diff = maximum - minimum;
        return diff;
    }
}
public class Train1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
        diff p = new diff();
        System.out.println(p.eleDiff(arr));
	}

}
