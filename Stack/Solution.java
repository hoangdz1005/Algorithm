package Stack;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++){
			int n = scanner.nextInt();
			String pattern =scanner.next();
			int arr1[] = new int[1000];
			int top1 = -1;
			char arr2[] = new char[1000];
			int top2 = -1;
			for(int i =0;i<pattern.length();i++) {
				if(pattern.charAt(i)== '0' || pattern.charAt(i)== '1' ||pattern.charAt(i)== '2' ||pattern.charAt(i)== '3' ||pattern.charAt(i)== '4' ||pattern.charAt(i)== '5' || pattern.charAt(i)== '6' ||pattern.charAt(i)== '7' ||pattern.charAt(i)== '8' ||pattern.charAt(i)== '9' ||pattern.charAt(i)== '0') {
					top1++;
					arr1[top1] = Character.getNumericValue(pattern.charAt(i));
				} else {
					if(pattern.charAt(i)== '*') {
						top2++;
						arr2[top2]= pattern.charAt(i);
					}
					if(pattern.charAt(i)== '+') {
						if(top2 == -1) {
							arr2[top2]= pattern.charAt(i);
						} else {
							if(pattern.charAt(i)== '*'){

							}
						}
					}
				}
			}
			
			
		}
	}

}
