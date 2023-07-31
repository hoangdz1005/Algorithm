package Station;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Station/input.txt"));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 1; tc <= t; ++tc) {
			int n = sc.nextInt();
			char arr[][] = new char[n+8][n+8];
			for(int i =4;i<n+4;i++) {
				for(int j =4;j<n+4;j++) {
					arr[i][j] = sc.next().charAt(0);
				}
			}
			
			for(int i =4;i<n+4;i++) {
				for(int j =4;j<n+4;j++) {
					if(arr[i][j]=='X') {
						continue;
					}
					if(arr[i][j]=='H') {
						continue;
					}
					if(arr[i][j]=='A') {
						for(int k = i;k>=i-1;k--) {
							if(arr[k][j]== 'H') {
								arr[k][j] = 'X';
							}
						}
						for(int k = i;k<=i+1;k++) {
							if(arr[k][j]== 'H') {
								arr[k][j] = 'X';
							}
						}
						for(int k = j;k>=j-1;k--) {
							if(arr[i][k]== 'H') {
								arr[i][k] = 'X';
							}
						}
						for(int k = j;k<=j+1;k++) {
							if(arr[i][k]== 'H') {
								arr[i][k] = 'X';
							}
						}
					}
					if(arr[i][j]=='B') {
						for(int k = i;k>=i-2;k--) {
							if(arr[k][j]== 'H') {
								arr[k][j] = 'X';
							}
						}
						for(int k = i;k<=i+2;k++) {
							if(arr[k][j]== 'H') {
								arr[k][j] = 'X';
							}
						}
						for(int k = j;k>=j-2;k--) {
							if(arr[i][k]== 'H') {
								arr[i][k] = 'X';
							}
						}
						for(int k = j;k<=j+2;k++) {
							if(arr[i][k]== 'H') {
								arr[i][k] = 'X';
							}
						}
					}
					if(arr[i][j]=='C') {
						for(int k = i;k>=i-3;k--) {
							if(arr[k][j]== 'H') {
								arr[k][j] = 'X';
							}
						}
						for(int k = i;k<=i+3;k++) {
							if(arr[k][j]== 'H') {
								arr[k][j] = 'X';
							}
						}
						for(int k = j;k>=j-3;k--) {
							if(arr[i][k]== 'H') {
								arr[i][k] = 'X';
							}
						}
						for(int k = j;k<=j+3;k++) {
							if(arr[i][k]== 'H') {
								arr[i][k] = 'X';
							}
						}
					}
					
				}
			}
			int dem =0;
			for(int i =4;i<n+4;i++) {
				for(int j =4;j<n+4;j++) {
					if(arr[i][j]=='H') {
						dem++;
					}
				}
			}
			System.out.println("#" + tc + " " + dem);
		}
		}
			
	}

	

	


