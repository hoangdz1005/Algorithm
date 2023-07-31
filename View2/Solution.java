package View2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/View2/input.txt"));
		Scanner scanner = new Scanner(System.in);
		for(int tc =0;tc<10;tc++) {
			int testCase = scanner.nextInt();
			int arr[][] = new int[104][104];
			for(int i =2;i<=101;i++) {
				for(int j =2;j<=101;j++) {
					arr[i][j]= scanner.nextInt();
				}
			}
			int dem = 0;
			boolean result = false;
			for(int i =2;i<=101;i++) {
				for(int j =2;j<=101;j++) {
					int temp1 = Math.max(arr[i+1][j], arr[i+2][j]);
					int temp2 = Math.max(arr[i-1][j], arr[i-2][j]);
					int temp3 = Math.max(arr[i][j+1], arr[i][j+2]);
					int temp4 = Math.max(arr[i][j-1], arr[i][j-2]);
					int compare = Math.max(Math.max(temp1, temp2), Math.max(temp3, temp4));
					if(compare<arr[i][j]) {
						dem+= (arr[i][j]- compare);
					}
				}
			}
			System.out.println("#" + (tc+1) + " " + dem);
		}
	}

}
