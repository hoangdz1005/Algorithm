package Flatten;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static int timMax(int[] arr) {
		int index = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>=arr[index]) {
				index = i;
			}
		}
		return index;
	}
	public static int timMin(int[] arr) {
		int index = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<=arr[index]) {
				index = i;
			}
		}
		return index ;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Flatten/input.txt"));
		Scanner scanner = new Scanner(System.in);
		for(int tc =1; tc<=10;tc++) {
			int n= scanner.nextInt();
			int[] arr = new int[100];
			for(int i= 0;i<100;i++){
				arr[i] = scanner.nextInt();
			}
			int temp1, temp2;
			for(int i=0;i<n;i++) {
				temp1 = timMax(arr);
				temp2 = timMin(arr);
				arr[temp1]-=1;
				arr[temp2] +=1;
			}
			int min = timMin(arr);
			int max = timMax(arr);
			System.out.println("#" + tc + " " + (arr[max]-arr[min]));
		}
	}

}
