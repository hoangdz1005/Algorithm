package CalculateLand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static int timMin(int a, int b, int c, int d) {
		int min = a;
		if(min>b) {
			min = b;
		}
		if(min>c) {
			min = c;
		}
		if(min>d) {
			min = d;
		}
		return min;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/CalculateLand/input.txt"));
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int tc = 1; tc <= testCase; ++tc) {
			int N = sc.nextInt();
			int arr[][] = new int[N][N];
			for(int i =0;i<N;i++) {
				for(int j =0;j<N;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int status[][] = new int[N][N];
			int result = 0;
			// Duyet 4 huong cho toi khi tim duoc 0
			for(int i =0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(arr[i][j]==0) {
						continue;
					// Neu gap 1
					} else {
						int x = i;
						int y = j;
						int dem1 =0;
						int dem2 =0;
						int dem3 = 0;
						int dem4 = 0;
						// lap len tren
						for(int k =i;k>=0;k--) {
							if(arr[k][j]==0) {
								dem1 = i-k;
								break;
							}
						}
						// lap xuong duoi
						for(int k =i;k<N;k++) {
							if(arr[k][j]==0) {
								dem2 = k-i;
								break;
							}
						}
						// lap sang trai
						for(int k =j;k>=0;k--) {
							if(arr[i][k]==0) {
								dem3 = j-k;
								break;
							}
						}
						// lap sang phai
						for(int k =j;k<N;k++) {
							if(arr[i][k]==0) {
								dem4 = k-j;
								break;
							}
						}
						
						int khoangCach = timMin(dem1, dem2, dem3, dem4);
						result+= khoangCach;
					}
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}

}
