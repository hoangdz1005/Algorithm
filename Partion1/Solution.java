package Partion1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void sort(int[] arr, int begin, int end) {
		 int temp = arr[0];
		for(int i =begin;i<end;i++) {
			for(int j =i+1;j<=end;j++) {
				if(arr[i]< arr[j]) {
					temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		int testCase= scanner.nextInt();
		for(int tc =1;tc<=testCase;tc++) {
			// Nhap mang
			int n = scanner.nextInt();
			int arr[] = new int[n];
			for(int i =0;i<n;i++) {
				arr[i] = scanner.nextInt();
			}
			
			sort(arr,0,n-1);
			int temp = n-1;
			int sum =0;
			while(temp>=1) {
				sum+= arr[temp]+ arr[temp-1];
				arr[temp-1] = arr[temp]+ arr[temp-1];
				temp--;
				sort(arr, 0, temp);
			}
			
			System.out.println("Case #" + tc);
			System.out.println(sum);
			
			
		}
	}

}
