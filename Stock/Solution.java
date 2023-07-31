package Stock;

import java.util.Scanner;

public class Solution {
	public static int timMax(int[] arr, int begin) {
		int max = arr[begin];
		for(int i=begin;i<arr.length;i++) {
			if(arr[i]>=max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		for(int tc =1;tc<=n;tc++) {
			// Nhap mang
			int dayNumber = scanner.nextInt();
			int arr[] = new int[dayNumber];
			for(int i =0;i<dayNumber;i++) {
				arr[i] = scanner.nextInt();
			}
		int tong = 0;
		for(int i =0;i<dayNumber-1;i++) {
			int temp = timMax(arr, i+1);
			if(temp>= arr[i]) {
				tong += (temp - arr[i]);
				
			}
			
		}
		if(tong<0) {
			System.out.println("#" + tc+ " " + 0);
		} else {
			System.out.println("#" + tc+ " " + tong);
		}
		
		}
	}
}
