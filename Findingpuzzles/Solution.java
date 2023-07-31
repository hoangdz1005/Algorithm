package Findingpuzzles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.xml.transform.Templates;



public class Solution {
	static Pos st[];
	static int stt[][];
	static int top;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Findingpuzzles/input.txt"));
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		for(int tc = 1;tc<=testCase;tc++) {
			int n = scanner.nextInt();
			int arr[][] = new int[n][n];
			top = -1;
			st = new Pos[10000];
			stt = new int[n][n];
			for(int i =0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j] = scanner.nextInt();
				}
			}
			int beginX = 0;
			int beginY =0;
			if(arr[beginX][beginY]!=0) {
				push(beginX, beginY);
				stt[beginX][beginY]=1;
				int index=0;
				while(top>=0 && index <=10000) {
					Pos pos = pop();
					// chay sang trai
					if(pos.c>=arr[pos.r][pos.c]&& stt[pos.r][pos.c -arr[pos.r][pos.c]]==0 ) {
						
						push(pos.r,pos.c -arr[pos.r][pos.c]);
						stt[pos.r][pos.c -arr[pos.r][pos.c]]=1;
					}
					// chay sang phai
					if(pos.c<n-arr[pos.r][pos.c] && stt[pos.r][pos.c +arr[pos.r][pos.c]]==0) {
						push(pos.r,pos.c +arr[pos.r][pos.c]);
						stt[pos.r][pos.c +arr[pos.r][pos.c]]=1;
					}
					// chay len tren 
					if(pos.r >=arr[pos.r][pos.c] && stt[pos.r-arr[pos.r][pos.c]][pos.c] ==0) {
						push(pos.r-arr[pos.r][pos.c],pos.c);
						stt[pos.r-arr[pos.r][pos.c]][pos.c]=1;
					}
					//chay xuong duoi
					if(pos.r <n-arr[pos.r][pos.c] && stt[pos.r+arr[pos.r][pos.c]][pos.c] ==0) {
						push(pos.r+arr[pos.r][pos.c],pos.c);
						stt[pos.r+arr[pos.r][pos.c]][pos.c]=1;
					}
//					if(pos.r==n-1) {
//						break;
//					}
					index++;
				}
			}
			if(stt[n-1][n-1]==1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
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

