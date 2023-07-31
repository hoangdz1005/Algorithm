package Palindrome1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Palindrome1/input.txt"));
		Scanner scanner = new Scanner(System.in);
		for(int tc =1;tc<= 10;tc++) {
			String arrX[]= new String[8];
			String arrY[]= new String[8];
			int len = scanner.nextInt();
			char arr[][] = new char[8][8];
			for(int i =0;i<8;i++) {
				String partern = scanner.next();
				for(int j =0;j<8;j++) {
					arr[i][j] = partern.charAt(j);
				}
			}
			
			int count = 0;
			// Xet theo hang
			for(int i = 0;i<8;i++) {
				for(int j =0;j<=8-len;j++) {
					
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
			for(int j = 0;j<8;j++) {
				for(int i =0;i<=8-len;i++) {
					
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
			System.out.println("#" + tc + " " + count);
			
		}

	}
}
