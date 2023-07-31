package View;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static int timMax(int a,int  b,int c,int d) {
		int max1 =  Math.max(a, b);
		int max2 =  Math.max(c, d);
		return Math.max(max2, max1);
	}
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/View/input"));
		Scanner scanner = new Scanner(System.in);
		for (int tc = 1; tc <= 10; ++tc) {
			int n = scanner.nextInt();
			int arr[] = new int[n];
			for(int i =0;i<n;i++) {
				arr[i]= scanner.nextInt();
			}
			int tong = 0;
			for(int i = 2;i<n-2;i++) {
				int temp = timMax(arr[i-1], arr[i-2], arr[i+1], arr[i+2]);
				if(arr[i]> temp ) {
					tong += arr[i] - temp;
				}
			}
			System.out.println("#" + tc + " " + tong);
		}
	}
}
