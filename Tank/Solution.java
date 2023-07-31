package Tank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/Tank/input.txt"));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int count1 = 0;
        // Tìm xe tăng loại 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    // Hướng lên
                    boolean check11 = j >= 1 && i < n - 2 && j < n - 1 && arr[i + 1][j - 1] == 1 && arr[i + 1][j + 1] == 1 && arr[i + 2][j - 1] == 1 && arr[i + 2][j + 1] == 1 && arr[i + 1][j] == 1 && arr[i + 2][j] == 1;
                    int countZeroAround1 = 0;
                    for(int k =i;k<=i+3;k++) {
                        for(int l =j-2;l<=j+2;l++) {
                            if(l<0 || k<0 || k>n-1 || l>n-1) {break;}
                            if(arr[k][l] == 0) {
                                countZeroAround1++;
                            }
                        }
                    }
                    if (check11 && countZeroAround1==13) {
                        count1++;
                    }
                    // Hướng phải
                    boolean check12 = j >= 2 && i >= 1 && i < n - 1 && arr[i][j - 1] == 1 && arr[i][j - 2] == 1 && arr[i - 1][j - 1] == 1 && arr[i + 1][j - 1] == 1 && arr[i - 1][j - 2] == 1 && arr[i + 1][j - 2] == 1;
                    int countZeroAround2 = 0;
                    for(int k =i-1;k<=i+1;k++) {
                        for(int l =j-2;l<=j;l++) {
                            if(l<0 || k<0 || k>n-1 || l>n-1) {break;}
                            if(arr[k][l] == 0) {
                                countZeroAround2++;
                            }
                        }
                    }
                    if (check12 && countZeroAround2 == 2) {
                        count1++;
                    }
                    // Hướng xuống
                    boolean check13 = j >= 1 && j < n - 1 && i >= 2 && arr[i - 1][j] == 1 && arr[i - 2][j] == 1 && arr[i - 1][j - 1] == 1 && arr[i - 1][j + 1] == 1 && arr[i - 2][j - 1] == 1 && arr[i - 1][j + 1] == 1;
                    int countZeroAround3 = 0;
                    for(int k =i-2;k<=i;k++) {
                        for(int l =j-1;l<=j+1;l++) {
                            if(l<0 || k<0 || k>n-1 || l>n-1) {break;}
                            if(arr[k][l] == 0) {
                                countZeroAround3++;
                            }
                        }
                    }
                    if (check13 && countZeroAround3==2) {
                        count1++;
                    }
                    // Hướng trái
                    boolean check14 = j < n - 1 && i >= 1 && i < n - 1 && arr[i][j + 1] == 1 && arr[i][j + 2] == 1 && arr[i - 1][j + 1] == 1 && arr[i + 1][j + 2] == 1 && arr[i + 1][j + 1] == 1 && arr[i + 1][j + 2] == 1;
                    int countZeroAround4 = 0;
                    for(int k =i-1;k<=i+1;k++) {
                        for(int l =j;l<=j+2;l++) {
                            if(l<0 || k<0 || k>n-1 || l>n-1) {break;}
                            if(arr[k][l] == 0) {
                                countZeroAround4++;
                            }
                        }
                    }
                    if (check14 && countZeroAround4==0) {
                        count1++;
                    }
                }
            }
        }
        int count2 =0;
        // Tìm xe tăng loại 2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    // Hướng lên
                    boolean check11 = j >= 1 && i < n - 2 && j < n - 1 && arr[i + 1][j] == 1 && arr[i + 1][j - 1] == 1 && arr[i + 2][j - 1] == 1 && arr[i + 1][j + 1] == 1 && arr[i + 2][j+1] == 1 && arr[i+2][j]==0;
                    if (check11) {
                        count2++;
                    }
                    // Hướng phải
                    boolean check12 = j >= 2 && i >= 1 && i < n - 1 && arr[i][j - 1] == 1 && arr[i-1][j - 1] == 1 && arr[i + 1][j - 1] == 1 && arr[i - 1][j - 2] == 1 && arr[i + 1][j - 2] == 1 && arr[i][j - 2] == 0 ;
                    if (check12) {
                        count2++;
                    }
                    // Hướng xuống
                    boolean check13 = j >= 1 && j < n - 1 && i >= 2 && arr[i - 1][j] == 1 && arr[i - 1][j-1] == 1 && arr[i - 1][j + 1] == 1 && arr[i - 2][j - 1] == 1 && arr[i - 2][j + 1] == 1 && arr[i - 2][j] == 0;
                    if (check13) {
                        count2++;
                    }
                    // Hướng trái
                    boolean check14 = j < n - 2 && i >= 1 && i < n - 1 && arr[i][j + 1] == 1 && arr[i - 1][j + 1] == 1 && arr[i + 1][j + 1] == 1 && arr[i - 1][j + 2] == 1 && arr[i + 1][j + 2] == 1 && arr[i][j + 2] == 0 ;
                    if (check14) {
                        count2++;
                    }
                }
            }
        }

        int count3 =0;
        // Tìm xe tăng loại 3
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    // Hướng lên
                    boolean check11 = j >= 1 && i < n - 2 && j < n - 1 && arr[i + 2][j] == 1 && arr[i + 1][j - 1] == 1 && arr[i + 2][j - 1] == 1 && arr[i + 1][j + 1] == 1 && arr[i + 2][j+1] == 1 && arr[i + 1][j] == 0;
                    if (check11) {
                        count3++;
                    }
                    // Hướng phải
                    boolean check12 = j >= 2 && i >= 1 && i < n - 1 && arr[i][j - 2] == 1 && arr[i-1][j - 1] == 1 && arr[i - 1][j - 2] == 1 && arr[i + 1][j - 1] == 1 && arr[i + 1][j - 2] == 1 && arr[i][j - 1]==0 ;
                    if (check12) {
                        count3++;
                    }
                    // Hướng xuống
                    boolean check13 = j >= 1 && j < n - 1 && i >= 2 && arr[i - 2][j] == 1 && arr[i - 1][j-1] == 1 && arr[i - 2][j - 1] == 1 && arr[i - 1][j + 1] == 1 && arr[i - 2][j + 1] == 1 && arr[i - 1][j] == 0;
                    if (check13) {
                        count3++;
                    }
                    // Hướng trái
                    boolean check14 = j < n - 2 && i >= 1 && i < n - 1 && arr[i][j + 2] == 1 && arr[i-1][j + 1] == 1 && arr[i - 1][j + 2] == 1 && arr[i + 1][j + 1] == 1 && arr[i + 1][j + 2] == 1 && arr[i][j + 1] == 0;
                    if (check14) {
                        count3++;
                    }
                }
            }
        }
        System.out.println(count1 + " " + count2 + " " + count3);
    }
}

