
package Ladder2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Ladder1/input.txt"));
		Scanner scanner = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int arr[][] = new int[100][100];
			int t = scanner.nextInt();
			// nhap mang 2 chieu
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = scanner.nextInt();
				}
			}
			
			int count = 0;
			int X=0;
			int dem = 10000;
			for(int c =0;c<99;c++) {
				if(arr[99][c]==1) {
					
					int temp = 0;
					int r = 99;
					
					//tien hanh kiem tra
					while (r != 0) {
						
						if (c - 1 >= 0 && arr[r][c - 1] == 1) {
							// check ben trai
							c--;
							arr[r][c] = 0;
							temp++;
							
						} else if (c + 1 <= 99 && arr[r][c + 1] == 1) {
							// check ben phai
							c++;
							arr[r][c] = 0;
							temp++;
							
						} else {
							// di len
							r--;
							arr[r][c] = 0;
							temp++;
							
						}
						
					}
					if(temp<dem) {
						dem = temp;
						X = c;
					} 
					else {
						if(temp==dem && c>X) {
							X=c;
						}
					} 
					
					
					
				} else {
					continue;
				}
			}

			System.out.println("#" + tc + " " + X);
		}
	}

}
