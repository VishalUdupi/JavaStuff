package Tue27Jun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeElement {
	static int removeElement(int[] nums, int val) {
		int k =0;
//		Arrays.sort(nums);
//		List<Integer> intList1 = new ArrayList<>();
//		intList1.add(val);
//		List<Integer> intList = new ArrayList<>();
//		for(int i:nums) {
//			intList.add(i);
//		}
//		intList.removeAll(intList1);
//		k = intList.size();
//		for(int i:intList) {
//			for(int j:nums) {
//				j=i;
//				System.out.println(j);
//			}
//		}
		int index=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[index] = nums[i];
				index++;
				
			}
		}
		return index;
    }

	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(nums, 2));
	}

}
