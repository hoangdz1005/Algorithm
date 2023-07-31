
package Uniform;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	static Pos st[];
	static int stt[][];
	static int top;
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };
	public static boolean kiemTraPhanTu(int[] arr, int value) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==value) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Uniform/input.txt"));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 1; tc <= t; ++tc) {
			top = -1;
			st = new Pos[10000];
			int N = sc.nextInt();
			int arr[][] = new int[N + 2][N + 2];
			int arrCheck[] = new int[5000];
			stt = new int[N + 2][N + 2];
			for (int i = 1; i < N + 1; ++i) {
				for (int j = 1; j < N + 1; ++j) {
					arr[i][j] = 0;
				}
			}
			// bat dau nhap input cho mang
			int jump =1;
			for(int j =1;j<N;j++) {
				for (int i = 1; i <= 2*N; i=i+2) {
					int temp1 = sc.nextInt();
					int tem2 = sc.nextInt();
					arr[temp1][tem2] = jump;
					
				}
				jump++;
			}
			
			for (int i = 1; i < N + 1; ++i) {
				for (int j = 1; j < N + 1; ++j) {
					if( arr[i][j] == 0) {
						arr[i][j] = N;
					}
				}
			}
			for (int i = 1; i < N + 1; ++i) {
				for (int j = 1; j < N + 1; ++j) {
					System.out.println(arr[i][j]);
				}
				
			}
			
			boolean result = true;
			for (int i = 1; i < N + 1; ++i) {
				for (int j = 1; j < N + 1; ++j) {
					int value =arr[i][j];
					if (arr[i][j]==value && stt[i][j] == 0) {
						push(i, j);
						stt[i][j] = 1; // duyet qua r
						while (top >= 0) { // stack != empty
							Pos pos = pop();
							for (int k = 0; k < 4; ++k) {
								int x = pos.r + dx[k];
								int y = pos.c + dy[k];
								if (arr[x][y]==value && stt[x][y] == 0) { //stt = 0 chua duyet
									push(x, y);
									stt[x][y] = 1;
								}
							}
						}
						for (int p = 1; p < N + 1; ++p) {
							for (int q = 1; q < N + 1; ++q) {
								if(arr[p][q]==value && arr[p][q]==0) {
									result = false;
									break;
								}
							}
							}
					}
					if(result ==false) {
						break;
					}
				}
				if(result==false) {
					break;
				}
			}
			if(result==false) {
				System.out.println("Case #" + tc );
				System.out.println("wrong");
			} else {
				System.out.println("Case #" + tc );
				System.out.println("good");
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
