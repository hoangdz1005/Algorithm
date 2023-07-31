package IMTEST;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/IMTEST/input.txt"));
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		for(int tc =1;tc<=testCase;tc++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int soDan = scanner.nextInt();
			int arr[][] = new int[n][m];
			// Nhap mang 
			for(int i =0;i<n;i++) {
				for(int j =1;j<m;j++) {
					arr[i][j]= 0;
				}
			}
			for(int i =0;i<soDan;i++) {
				int r = scanner.nextInt();
				int c = scanner.nextInt();
				int loaiDan= scanner.nextInt();
					arr[r][c] +=2;
					// Kiem tra dan 1
					if(loaiDan==1) {
						if(r>=1) {
							arr[r-1][c]++;
						}
						if(r<n-1) {
							arr[r+1][c]++;
						}
						if(c>=1) {
							arr[r][c-1]++;
						}
						if(c<m-1) {
							arr[r][c+1]++;
						}
				// Kiem tra dan 2
					} else {
						if(r>=1 && c>=1) {
							arr[r-1][c-1]++;
						}
						if(r<n-1 & c>=1) {
							arr[r+1][c-1]++;
						}
						if(r>=1&& c<m-1) {
							arr[r-1][c+1]++;
						}
						if(r<n-1 && c<m-1) {
							arr[r+1][c+1]++;
						}
					}
				
					for(int j =0;j<m;j++) {
						for(int k =0;k<n-1;k++) {
							if(arr[k][j]>2) {
								arr[k+1][j] += (arr[k][j]-2);
								arr[k][j] = 2;
							}
						}
					}
				
			}
			// chuyen neu dan >=3
			
			int dem =0;
			for(int i =0;i<n;i++) {
				for(int j =0;j<m;j++) {
					if(arr[i][j]>0) {
						dem++;
					}
				}
			}
			System.out.println("#" + tc+ " " + dem);
			
		}
	}

}
