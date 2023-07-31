package GNS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/GNS/input.txt"));
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int tc =1;tc<=n;tc++) {
			String testCase = scanner.next();
			int numberOfWord = scanner.nextInt();
			int arr[] = new int[numberOfWord];
			int dem0 =0;
			int dem1 =0;
			int dem2 =0;
			int dem3 =0;
			int dem4 =0;
			int dem5 =0;
			int dem6 =0;
			int dem7 =0;
			int dem8 =0;
			int dem9 =0;
			for(int i =0;i<numberOfWord;i++) {
				String tempString= scanner.next();
				if(tempString.equals("ZRO")) {
					dem0++;
				}
				if(tempString.equals("ONE")) {
					dem1++;
				}
				if(tempString.equals("TWO")) {
					dem2++;
					
				}
				if(tempString.equals("THR")) {
					dem3++;
					
				}
				if(tempString.equals("FOR")) {
					dem4++;
					
				}
				if(tempString.equals("FIV")) {
					dem5++;
					
				}
				if(tempString.equals("SIX")) {
					dem6++;
					
				}
				if(tempString.equals("SVN")) {
					dem7++;
					
				}
				if(tempString.equals("EGT")) {
					dem8++;
					
				}
				if(tempString.equals("NIN")) {
					dem9++;
					
				}
			}
			
			// in mang 
			System.out.println("#" + tc);
			for(int i =0;i<dem0;i++) {
				System.out.print("ZRO ");
			}
			for(int i =0;i<dem1;i++) {
				System.out.print("ONE ");
			}
			for(int i =0;i<dem2;i++) {
				System.out.print("TWO ");
			}
			for(int i =0;i<dem3;i++) {
				System.out.print("THR ");
			}
			for(int i =0;i<dem4;i++) {
				System.out.print("FOR ");
			}
			for(int i =0;i<dem5;i++) {
				System.out.print("FIV ");
			}
			for(int i =0;i<dem6;i++) {
				System.out.print("SIX ");
			}
			for(int i =0;i<dem7;i++) {
				System.out.print("SVN ");
			}
			for(int i =0;i<dem8;i++) {
				System.out.print("EGT ");
			}
			for(int i =0;i<dem9;i++) {
				System.out.print("NIN ");
			}
			System.out.println();
		}
		
	}

}
