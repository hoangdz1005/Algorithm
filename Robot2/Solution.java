package Robot2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Robot2/input.txt"));
		Scanner scanner = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int testCase = scanner.nextInt();
			int[][] arr = new int[100][100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = scanner.nextInt();
				}
			}
			int blue, red;
			int ans = 0;
			for (int i = 0; i < 100; i++) {
				blue = red = 0;
				for (int j = 0; j < 100; j++) {
					if (arr[i][j] == 1) {
						blue++;
					} else if (arr[i][j] == 2) {
						if (blue > 0)
							blue--;
						else
							red++;
					}
				}
				ans += red + blue;
			}
			System.out.println(ans);

			// int dem =0;
			// for(int i =0;i<100;i++) {
			// int temp1= 0;
			// int temp2= 99;
			// int dem1= 0;
			// int dem2= 0;
			// // tinh so ro bot do o ben trai
			// while(arr[i][temp1]!=1) {
			// if(arr[i][temp1]==2) {
			// dem1++;
			// }
			// temp1++;
			// }
			// // tinh so robot xanh o ben phai
			// while(arr[i][temp2]!=2) {
			// if(arr[i][temp2]==1) {
			// dem2++;
			// }
			// temp2--;
			// }
			// // tinh so robot o giua
			// int demDo = 0;
			// int demXanh =0;
			// if(temp1<temp2) {
			// for(int k=temp1;k<=temp2;k++) {
			// if(arr[i][k]== 1) {
			// demXanh++;
			// }
			// if(arr[i][k]== 2) {
			// demDo++;
			// }
			// }
			// } else {
			// for(int k=temp2;k<=temp1;k++) {
			// if(arr[i][k]== 1) {
			// demXanh++;
			// }
			// if(arr[i][k]== 2) {
			// demDo++;
			// }
			// }
			// }
			// int hieu =0;
			// if(demDo>=demXanh) {
			// hieu = demDo-demXanh;
			// } else {
			// hieu = demXanh - demDo;
			// }
			// dem = dem + dem1 + dem2 + hieu;
			// }
			// System.out.println("#" + testCase + " " + dem);
		}

	}

}
