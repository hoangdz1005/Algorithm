package Blackjack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Blackjack/input.txt"));
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; ++tc) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			
			int result = arr[0];
			for(int j=0;j<n;j++) {
				int tong = 0;
				for(int i =0;i<n-1;i++) {
					tong += arr[i];
					if(tong + arr[i+1] >=21) {
						break;
					}
					
				}
				if(tong > result) {
					result = tong;
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}

}
