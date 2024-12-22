package StrPrac;

import java.util.Scanner;

public class matrixArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for (int i =0; i <3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for(int k=0; k<3; k++) {
			for(int l=0; l<3; l++) {
				System.out.print(arr[k][l]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
