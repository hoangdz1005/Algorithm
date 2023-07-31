package String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException{
		System.setIn(new FileInputStream("src/String/input.txt"));
		Scanner scanner = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++){
			int testCase = Integer.parseInt(scanner.nextLine());
			String stringCompare = scanner.nextLine();
			String pattern = scanner.nextLine();
			
			int count = 0;
			for(int i =0;i<pattern.length()- stringCompare.length();i++) {
				String temp = pattern.substring(i,i+stringCompare.length());
				if(temp.compareTo(stringCompare)==0) {
					count++;
				}
			}
			System.out.println("#" + testCase + " " + count);
		}
	}

}
