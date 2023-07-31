import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HCN {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int arr[][]= new int[m][n];
        for(int i = 0; i <m;i++) {
            for(int j = 0; j < n;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        for(int i = 0; i <m; i++) {
            for(int j = 0; j < n;j++) {
                if(arr[i][j]==1) {
                    int Ox = 0;
                    int Oy =0;
                    for(int k =j;k<n;k++) {
                        if(arr[i][k]==1) {
                            Ox++;
                        }else {
                            break;
                        }
                    }
                    for (int k =i;k<m;k++) {
                        if(arr[k][j]==1) {
                            Oy++;
                        }else {
                            break;
                        }
                    }
                    System.out.println(Ox + ", " + Oy);
                    boolean condition = false;
                    if(Ox>=3 && Oy>=3) {
                        condition = true;
                    }
                    int Ox2 = 0;
                    int Oy2 = 0;
                    for(int k =i;k<m;k++) {
                        if(arr[k][j+Ox-1]==1) {
                            Oy2++;
                        } else {
                            break;
                        }
                    }
                    for(int k =j;k<n;k++) {
                        if(arr[i+Oy-1][k]==1) {
                            Ox2++;
                        } else {
                            break;
                        }
                    }
                    if(condition && Ox==Ox2 && Oy==Oy2) {
                        count++;
                    }

                }
            }
        }
        System.out.println(count);
    }
}