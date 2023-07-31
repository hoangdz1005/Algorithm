import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int k = 1;k<=testCase;k++) {
            int m = sc.nextInt();
            int[][] arr = new int[m][5];
            for (int i =0;i<m;i++) {
                for(int j = 0;j<5;j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int tempRow = 0;
            int tempColumn = 2;
            boolean kiemTra = true;
            int  mark = 0;
            int resultAfterGo;
            String road = sc.next();

            for(int i =1;i<road.length();i++) {
                switch (road.charAt(i)) {
                    case 'C':
                        tempRow++;
                        resultAfterGo = arr[tempRow][tempColumn];
                        if(resultAfterGo!=2) {
                            if(resultAfterGo == 1) {
                                mark++;
                            }
                        } else {
                            kiemTra = false;
                        }
                        break;
                    case 'L':
                        tempRow++;
                        tempColumn --;
                        resultAfterGo = arr[tempRow][tempColumn];
                        if(resultAfterGo!=2) {
                            if(resultAfterGo == 1) {
                                mark++;
                            }
                        } else {
                            kiemTra = false;
                        }
                        break;
                    case 'R':
                        tempRow++;
                        tempColumn++;
                        resultAfterGo = arr[tempRow][tempColumn];
                        if(resultAfterGo!=2) {
                            if(resultAfterGo == 1) {
                                mark++;
                            }
                        } else {
                            kiemTra = false;
                        }
                        break;
                }

                if(kiemTra== false) {
                    break;
                }
            }

            if(kiemTra == true) {
                System.out.println("#"+ k +" YES " + mark);
            } else {
                System.out.println("#"+ k + " NO");
            }
        }

    }
}
