package Ladder1;

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
			int c = 0;
			// tim vi tri co gia tri 2
			for (int j = 0; j < 100; ++j) {
				if (arr[99][j] == 2)
					c = j;
			}
			int r = 99;
			while (r != 0) {
				if (c - 1 >= 0 && arr[r][c - 1] == 1) {
					// check ben trai
					c--;
				} else if (c + 1 <= 99 && arr[r][c + 1] == 1) {
					// check ben phai
					c++;
				} else {
					// di len
					r--;
				}
				arr[r][c] = 0;
			}
			System.out.println("#" + tc + " " + c);
		}
	}

}
