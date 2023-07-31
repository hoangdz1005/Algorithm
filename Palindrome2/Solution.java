
package Palindrome2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Palindrome2/input.txt"));
		Scanner scanner = new Scanner(System.in);
		for(int tc =1;tc<= 10;tc++) {
			int testCase = scanner.nextInt();
			char arr[][] = new char[100][100];
			for(int i =0;i<100;i++) {
				String partern = scanner.next();
				for(int j =0;j<100;j++) {
					arr[i][j] = partern.charAt(j);
				}
			}
			
		int max = 0;
		// vong lap len
		for(int len = 99;len>=1;len--) {
			int count = 0;
			// Xet theo hang
			for(int i = 0;i<100;i++) {
				for(int j =0;j<=100-len;j++) {
					
					int z = j;
					int t = j+len-1;
					boolean kiemTra = true;
					while(z<=t) {
						if(arr[i][z]!= arr[i][t]) {
							kiemTra = false;
						}
						z++;
						t--;
					}
					if(kiemTra) {
						count++;
					}
					
				}
			}
			// Xet theo cot
			for(int j = 0;j<100;j++) {
				for(int i =0;i<=100-len;i++) {
					
					int z = i;
					int t = i+len-1;
					boolean kiemTra = true;
					while(z<=t) {
						if(arr[z][j]!= arr[t][j]) {
							kiemTra = false;
						}
						z++;
						t--;
					}
					if(kiemTra) {
						count++;
					}
					
				}
			}
			if(count>0) {
				max = len;
				break;
			}
		}
		
		System.out.println("#" + testCase + " " + max);	
		}

	}
}
