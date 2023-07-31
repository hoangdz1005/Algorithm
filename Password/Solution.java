package Password;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	static int len;
	static String str;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/Password/input.txt"));
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; ++tc) {
			len = sc.nextInt();
			String string = sc.nextLine();
			
			for(int i =0;i<string.length()-1;i++) {
				if(string.charAt(i)==string.charAt(i+1)) {
					string = string.substring(0, i) + string.substring(i+2);
					i=0;
				}
			}
			
			
			
			System.out.println("#" + tc + " " + string);
		}
	}

}
