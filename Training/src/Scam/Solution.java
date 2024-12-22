package Scam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    List<Integer> intList = new ArrayList<>();
    int n = in.nextInt();
    
    for(int i=0;i<n;i++){
        intList.add(in.nextInt());
    }
    int q = in.nextInt();
    
    for(int j=0;j<q;j++){
        String query = in.next();
//        if(query=="Insert"){
//        int pos = in.nextInt();
//        int ele = in.nextInt();
//        intList.add(pos,ele);
//        }
//        else if(query=="Delete"){
//            int ele = in.nextInt();
//            intList.remove(ele);
//        }
        switch(query) {
        case "Insert":{
        	int pos = in.nextInt();
        	int ele = in.nextInt();
        	if(pos>=intList.size()) {
        		intList.add(ele);
        	}else {
        	intList.add(pos,ele);
        	}
        	System.out.println(intList);break;
        	
        }
        case "Delete":{
        	int ele1 = in.nextInt();
        	intList.remove(ele1);
        }
        }
    
    }
    System.out.println(intList);
    
}
}
