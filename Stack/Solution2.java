package Stack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class Solution2 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Stack/input.txt"));
		Scanner scanner = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++){
			int n = scanner.nextInt();
			String pattern =scanner.next();
			int result = 0;
			int k =0;
			String arr[] = pattern.split("\\+");
			int tong = 0;
			for(int i =0;i<arr.length;i++){
				int tich =1;
				for(int j = 0;j<(arr[i].length());j++) {
					if(arr[i].charAt(j)== '*') {
						continue;
					} else {
						int temp = Character.getNumericValue(arr[i].charAt(j));
						tich*= temp;
					}
				}
				tong+=tich;
			}
			System.out.println("#" + tc + " " + tong);
			
		}
	}

}
