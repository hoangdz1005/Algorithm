package Robot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Robot/input.txt"));
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		for(int tc =1;tc<=testCase;tc++) {
			int n = scanner.nextInt();
			int beginX = scanner.nextInt();
			int beginY = scanner.nextInt();
			int direction = scanner.nextInt();
			int[][] arr= new int[n][n];
			for(int i = 0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j] = scanner.nextInt();
				}
			}
			int numberCommand = scanner.nextInt();
			int[] arrCommand= new int[numberCommand];
			for(int i =0;i<numberCommand;i++) {
				arrCommand[i]= scanner.nextInt();
			}
	
			int huongHienTai = direction;
			for(int k =0;k<numberCommand;k++) {
				int command = arrCommand[k];
				// Truong hop di len X giam
				if(command==0 && huongHienTai==0) {
					if(beginX>=1 && arr[beginX -1][beginY]!=-1) {
						beginX--;
						if(arr[beginX][beginY]>=1) {
							arr[beginX][beginY]--;
						}
					}
					continue;
				}
				// Truong hop di xuong X tang
				if(command==0 && huongHienTai==2) {
					if(beginX<n-1 && arr[beginX+1][beginY]!=-1) {
						beginX++;
						if(arr[beginX][beginY]>=1) {
							arr[beginX][beginY]--;
						}
					}
					continue;
				}
				// Truong hop sang trai
				if(command==0 && huongHienTai==1) {
					if(beginY>=1 && arr[beginX][beginY-1]!=-1) {
						beginY--;
						if(arr[beginX][beginY]>=1) {
							arr[beginX][beginY]--;
						}
					}
					continue;
				}
				// Truong hop sang phai
				if(command==0 && huongHienTai==3) {
					if(beginY<n-1 && arr[beginX][beginY+1]!=-1) {
						beginY++;
						if(arr[beginX][beginY]>=1) {
							arr[beginX][beginY]--;
						}
					}
					continue;
				}
				
				if(command==1) {
					huongHienTai++;
					if(huongHienTai>3) {
						huongHienTai = 0;
					}
					continue;
				}
				if(command==2) {
					if(huongHienTai==0) {
						huongHienTai =2;
					}
					if(huongHienTai==2) {
						huongHienTai =0;
					}
					if(huongHienTai==1) {
						huongHienTai =3;
					}
					if(huongHienTai==3) {
						huongHienTai =1;
					}
					continue;
				}
				if(command==3) {
					huongHienTai--;
					if(huongHienTai<0) {
						huongHienTai = 3;
					}
					continue;
				}
			
		}
			int dem = 0;
			for(int i = 0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(arr[i][j]==0) {
						dem++;
					}
				}
			}
			System.out.println("#" + tc +" "+ dem);
		}

	}
}
