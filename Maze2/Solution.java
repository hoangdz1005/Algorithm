package Maze2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	static Pos st[];
	static int stt[][];
	static int top;
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Maze1/input.txt"));
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; ++tc) {
			top = -1;
			st = new Pos[10000];
			int n = sc.nextInt();
			int arr[][] = new int[101][101];
			stt = new int[101][101];
			
			// Nhap mang
			for (int k = 1; k <= 100; ++k) {
				String temp = sc.next();
				for(int i =1;i<=100;i++) {
					arr[k][i] = Character.getNumericValue(temp.charAt(i-1));
				}
			}
			int indexX =0;
			int indexY =0;
			// luu vi tri gia tri 3
			for(int i =1;i<=100;i++) {
				for(int j=1;j<=100;j++) {
					if(arr[i][j]==3) {
						indexX = i;
						indexY = j;
					}
				}
			}

			int temp1 =0;
			int temp2 =0;
			for(int i =1;i<=100;i++) {
				for(int j=1;j<=100;j++) {
					if(arr[i][j]==2) {
						temp1 = i;
						temp2 = j;
					}
				}
			}
			if (arr[temp1][temp2] == 2 && stt[temp1][temp2] == 0) {
			push(temp1, temp2);
			stt[temp1][temp2] = 1; 
			while (top >= 0) {
				Pos pos = pop();
				for (int k = 0; k < 4; ++k) {
					int x = pos.r + dx[k];
					int y = pos.c + dy[k];
					if ((arr[x][y] == 0 || arr[x][y]==3) && stt[x][y] == 0) {
						push(x, y);
						stt[x][y] = 1;
					}
				}
			}
			}
			
			
			if(stt[indexX][indexY]==1) {
				System.out.println("#" + tc + " " + 1);
				
			} else {
				System.out.println("#" + tc + " " + 0);
			}
		}

	}

	static void push(int x, int y) {
		top++;
		st[top] = new Pos(x, y);
	}

	static Pos pop() {
		Pos ret = st[top];
		top--;
		return ret;
	}

	static class Pos {
		int r, c;

		public Pos(int i, int j) {
			r = i;
			c = j;
		}
	}

}

