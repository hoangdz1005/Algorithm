import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[10][10];
        for(int i =0;i<10;i++) {
            for(int j =0;j<10;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int count =0;
        for(int i =0;i<10;i++) {
            int red=0, blue=0;
            for(int j =0;j<10;j++) {
                if(arr[i][j]==1) {
                    blue++;
                } else {
                    if(arr[i][j]==2) {
                        if(blue>0) {
                            blue--;
                        } else {
                            red++;
                        }
                    }
                }
            }
            count+= red + blue;
        }
        System.out.println(count);
    }
}