import java.util.Scanner;

public class ToAndFro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int soCot = sc.nextInt();
            if(soCot==0) {break;}
            sc.nextLine();
            String pattern = sc.next();
            int soHang = (pattern.length()) /soCot;
            char[][] charArray = new char[soHang][soCot];
            for(int i =0;i<soHang;i++) {
                for(int j=0;j<soCot;j++) {
                    charArray[i][j] = pattern.charAt(soCot*i + j);
                }
            }

            char temp;
            for(int i=1;i<soHang;i++) {
                if (i%2!=0) {
                    if(i>soHang) {break;}
                    for(int j=0; j<soCot-j;j++) {
                        temp =charArray[i][j];
                        charArray[i][j] = charArray[i][soCot-j-1];
                        charArray[i][soCot-j-1] = temp;
                    }
                }
            }
            for(int i =0;i<soCot;i++) {
                for(int j=0;j<soHang;j++) {
                    System.out.print(charArray[j][i]);
                }
            }
            System.out.println();

        }
    }
}
