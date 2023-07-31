package CowHeight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/CowHeight/input.txt"));
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		for (int tc = 1; tc <= testCase; tc++) {
			int sum = scanner.nextInt();
			int count = scanner.nextInt();
			int[] arr = new int[100000];
			int index = 0;
			int dem = 0;
			for (int i = 0; i < count; i++) {
				int temp = scanner.nextInt();
				if (temp <= sum) {
					arr[index] = temp;
					index++;
				}
				int len = index - 1;
				for (int j = 0; j < len; j++) {
					if (temp + arr[j] <= sum) {
						arr[index] = temp + arr[j];
						index++;
					}

				}
			}

			int max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}

			System.out.println("#" + tc + " " + max);

		}

	}

}
