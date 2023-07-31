package SkyMap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	static Pos st[];
	static int stt[][];
	static int top;
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) throws FileNotFoundException  {
		System.setIn(new FileInputStream("src/SkyMap/input.txt"));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 1; tc <= 10; ++tc) {
			top = -1;
			st = new Pos[10000];
			int N = sc.nextInt();
			int arr[][] = new int[N + 2][N + 2];
			stt = new int[N + 2][N + 2];

			for (int i = 1; i < N + 1; ++i) {
				for (int j = 1; j < N + 1; ++j) {
					arr[i][j] = sc.nextInt();
				}
			}
			int dem = 0;
			int maxstar =0;

			for (int i = 1; i < N + 1; ++i) {
				for (int j = 1; j < N + 1; ++j) {
					int temp= 0;
					if (arr[i][j] == 1 && stt[i][j] == 0) {
						dem++;
						temp++;
						push(i, j);
						stt[i][j] = 1; // duyet qua r
						while (top >= 0) { // stack != empty
							Pos pos = pop();
							for (int k = 0; k < 4; ++k) {
								int x = pos.r + dx[k];
								int y = pos.c + dy[k];
								if (arr[x][y] == 1 && stt[x][y] == 0) { //stt = 0 chua duyet
									temp++;
									push(x, y);
									stt[x][y] = 1;
								}
							}
						}
					}
					if(temp>maxstar) {
						maxstar = temp;
					}
				}
			}
			System.out.println(dem+ " " + maxstar);
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

