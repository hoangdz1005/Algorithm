package FindCycle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/FindCycle/input.txt"));
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		for(int tc =1;tc<=testCase;tc++) {
			int node = scanner.nextInt();
			int edge = scanner.nextInt();
			int arr[] = new int[edge*2];
			for(int i=0;i<edge*2;i++) {
				arr[i] = scanner.nextInt();
			}
//			for(int i=0;i<edge*2;i++) {
//				System.out.print(arr[i] +" ");
//			}
			boolean kiemTra = true;
			for(int i =0;i<edge*2;i=i+2) {
				
				if(i==0) {
					boolean temp = arr[i]!= arr[edge*2-1] && arr[i]!= arr[edge*2-2];
					boolean temp2 = arr[i+1]!= arr[edge*2-1] && arr[i]!= arr[edge*2-2];
					if(temp && temp2) {
						kiemTra = false;
						break;
					}
				}else {
					boolean temp = arr[i]!= arr[i-1] && arr[i]!= arr[i-2];
					boolean temp2 = arr[i+1]!= arr[i-1] && arr[i]!= arr[i-2];
					if(temp && temp2) {
						kiemTra = false;
						break;
					}
				}
			}
			if(kiemTra==true && edge>2) {
				System.out.println("Case #" + tc);
				System.out.println(1);
			} else {
				System.out.println("Case #" + tc);
				System.out.println(0);
			}
		}
	}
}
