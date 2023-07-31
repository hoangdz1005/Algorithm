package Cryptogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Cryptogram/input.txt"));
		Scanner scanner = new Scanner(System.in);
		for(int tc = 1;tc <=10;tc++) {
			// so phan tu mang ban dau
			int number1 = scanner.nextInt();
			int arr[] = new int[10000];
			for(int i =0;i<number1;i++) {
				arr[i]= scanner.nextInt();
			}
			int number2 = scanner.nextInt();
			for(int i =0;i<number2;i++) {
				char c = scanner.next().charAt(0);
				int index = scanner.nextInt();
				int legth = scanner.nextInt();
				int[] arrNew1 = new int[legth];
				for(int j = 0;j<legth;j++) {
					arrNew1[j] = scanner.nextInt();
				}
				
				// chuyen phan tu sang vi tri moi
				number1+=legth;
				for(int j = number1-1; j>=index+ legth;j--) {
					arr[j] = arr[j-legth];
				}
				// thay doi phan tu vi tri cu
				for(int j=index;j<index+legth;j++) {
					arr[j]= arrNew1[j-index];
				}
			}
			System.out.print("#" + tc +" ");
			for(int i =0;i<10;i++) {
				if(i==number1-1) {
					System.out.print(arr[i]);
				} else {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
		}
	}

}
