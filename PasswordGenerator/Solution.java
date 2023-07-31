package PasswordGenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/PasswordGenerator/input.txt"));
		Scanner scanner = new Scanner(System.in);
		for (int tc = 1; tc <= 10; ++tc) {
			int n = scanner.nextInt();
			int arr[] = new int[8];
			for(int i =0;i<8;i++) {
				arr[i] = scanner.nextInt();
			}
			
			
			while(arr[7]> 0) {
				for(int i =1;i<=5;i++) {
					//daonguocchuoi
					int temp = arr[0];
					for(int j=0;j<7;j++) {
						arr[j] = arr[j+1];
					}
					arr[7] = temp - i;
					if(arr[7]<0) {
						arr[7] = 0;
						break;
					}
				}
				
			}
			
			System.out.print("#" + tc + " ");
			for(int i =0;i<8;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
