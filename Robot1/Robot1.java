import java.util.Scanner;

public class Robot1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        // Cho toa do vao mang
        for(int k =0;k<testCase;k++) {
            int soLan = sc.nextInt();
            int[][] mangToaDo =new int[soLan][2];
            for(int i = 0;i<soLan;i++) {
                for(int j =0;j<2;j++) {
                    mangToaDo[i][j] = sc.nextInt();
                }
            }
            // Tang x = 1, giam x = -1, tang y =2, giam y = -2

            int huongTruc = 1;
            int demRePhai = 0;
            for(int i=1;i<soLan;i++) {
                switch (huongTruc) {
                    case 1:
                        // toa do x khac nhau
                        if(mangToaDo[i][0]!= mangToaDo[i-1][0]) {
                            if(mangToaDo[i][0]<mangToaDo[i-1][0]) {
                                huongTruc = -1;
                            }
                        } else {
                            if(mangToaDo[i][1]>mangToaDo[i-1][1]) {
                                huongTruc = 2;
                            } else {
                                demRePhai++;
                                huongTruc = -2;
                            }
                        }
                        break;
                    case -1:
                        if(mangToaDo[i][0]!= mangToaDo[i-1][0]) {
                            if(mangToaDo[i][0]>mangToaDo[i-1][0]) {
                                huongTruc = 1;
                            }
                        } else {
                            if(mangToaDo[i][1]>mangToaDo[i-1][1]) {
                                demRePhai++;
                                huongTruc = -2;
                            } else {
                                huongTruc = 2;
                            }
                        }
                        break;
                    case 2:
                        if(mangToaDo[i][0]!= mangToaDo[i-1][0]) {
                            if(mangToaDo[i][0]>mangToaDo[i-1][0]) {
                                demRePhai++;
                                huongTruc = 1;
                            } else {
                                huongTruc = -1;
                            }
                        } else {
                            if(mangToaDo[i][1]<mangToaDo[i-1][1]) {
                                huongTruc = -2;
                            }
                        }
                        break;
                    case -2:
                        if(mangToaDo[i][0]!= mangToaDo[i-1][0]) {
                            if(mangToaDo[i][0]>mangToaDo[i-1][0]) {
                                huongTruc = 1;
                            } else {
                                demRePhai++;
                                huongTruc = -1;
                            }
                        } else {
                            if(mangToaDo[i][1]>mangToaDo[i-1][1]) {
                                huongTruc = 2;
                            }
                        }
                        break;
                }
            }

            System.out.println("#"+ (k+1)+ " "+ demRePhai);
            System.out.println();

        }

    }
}
