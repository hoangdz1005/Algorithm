package LaughingBomb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Solution {
	static Postion queueP[];
	static int status[][];
	static int start;
	static int end;
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };
	static void push(int x, int y) {
		Postion postion =new Postion(x, y);
		end++;
		queueP[end] = postion;
	}

	static Postion pop() {
		Postion postion = queueP[start];
		start++;
		return postion;
	}
	public static boolean kiemTraMang(int[] arr, int value ) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==value){
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/LaughingBomb/input"));
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		for (int tc = 1; tc <= testCase; ++tc) {
			start =0;
			end = -1;
			queueP = new Postion[10000];
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			int arr[][] = new int[M + 2][N + 2];
			status = new int[M + 2][N + 2];

			for (int i = 1; i < M + 1; ++i) {
				for (int j = 1; j < N + 1; ++j) {
					arr[i][j] = scanner.nextInt();
				}
			}
			int dem = 0;
			int beginY = scanner.nextInt();
			int beginX = scanner.nextInt();
			
			if(arr[beginX][beginY]== 1) {
				dem++;
				push(beginX, beginY);
				status[beginX][beginY]=1;
				while(end>=start) {		
					Postion pos = pop();
					for(int k =0;k<4;k++) {
						int x = pos.r + dx[k];
						int y = pos.c + dy[k];
						if (arr[x][y] == 1 && status[x][y] == 0) {
							//dem++;//stt = 0 chua duyet
							push(x, y);
							status[x][y] = status[pos.r][pos.c] + 1;
						}
					}
					
				}
			}
			int max = 0;
			for (int i = 1; i < M + 1; ++i) {
				for (int j = 1; j < N + 1; ++j) {
					if(status[i][j]>max) {
						max =status[i][j];
					}
				}
			}
			
			System.out.println(max);
			}
	}
	
	static class Postion {
		int r, c;
		public Postion(int x, int y) {
			r = x;
			c = y;
		}
	}
	

}
