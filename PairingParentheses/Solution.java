package PairingParentheses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/PairingParentheses/input"));
		Scanner scanner = new Scanner(System.in);
		for(int tc =1;tc<=10;tc++) {
			int legth = scanner.nextInt();
			String chuoi = scanner.next();
			int dem1 = 0;
			int dem2 = 0;
			int dem3 = 0;
			int dem4 = 0;
			for(int i =0;i<chuoi.length();i++) {
				switch (chuoi.charAt(i)) {
				case '(':
					dem1++;
					break;
				case ')':
					dem1--;
					break;
				case '<':
					dem2++;
					break;
				case '>':
					dem2--;
					break;
				case '{':
					dem3++;
					break;
				case '}':
					dem3--;
					break;
				case '[':
					dem4++;
					break;
				case ']':
					dem4--;
					break;
				}
			}
			if(dem1==0 && dem2==0 && dem3==0 && dem4 ==0) {
				System.out.println("#"+ tc+ " " + 1);
			} else {
				System.out.println("#"+ tc+ " " + 0);
			}
		}
	}

}
