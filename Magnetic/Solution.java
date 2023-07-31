package Magnetic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Magnetic/input.txt"));
		Scanner scanner = new Scanner(System.in);
		for(int tc =1;tc<= 10;tc++) {
			int n = scanner.nextInt();
			int arr[][] = new int[n][n];
			for(int i =0;i<n;i++) {
				for(int j =0;j<n;j++) {
					arr[i][j] = scanner.nextInt();
				}
			}
			int dem =0;
			for(int j =0;j<n;j++) {
				boolean kiemTraN = false;
				for(int i = 0;i<n;i++) {
					// Neu gap cuc N (do)
					if(arr[i][j]==1) {
						kiemTraN = true;
						
					}
					
					// Neu gap cuc S (xanh)
					if(arr[i][j]==2) {
						if(kiemTraN) {
							dem +=1;
							kiemTraN = false;
						}
					}
					if(arr[i][j]==0) {
						continue;
					}
				}
			}
			System.out.println("#" + tc + " " + dem);
		}
		
	}

}
