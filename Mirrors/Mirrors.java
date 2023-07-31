import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mirrors {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        int toadoX =0;
        int toadoY =1;
        int direction = 3;
        boolean kiemTra = (toadoX==0 && direction==0) || (toadoY==0 && direction==1) || (toadoX>=n-1 && direction==2) || (toadoY>=n-1 && direction==3);
        while (kiemTra==false) {
            if(arr[toadoX][toadoY]==0) {
                if(direction==1) {
                    toadoY--;

                } else {
                    if(direction==2) {
                        toadoX++;

                    } else {
                        if(direction==3) {
                            toadoY++;

                        } else {
                            if(direction==0) {
                                toadoX--;
                                if(toadoX==0) {
                                    break;
                                }
                            }
                        }
                    }
                }

            } else {
                if(arr[toadoX][toadoY]==1) {
                    count++;
                    if(direction==0) {
                        toadoY++;
                        direction = 3;

                    } else {
                        if(direction==1) {
                            toadoX++;
                            direction=2;

                        } else {
                            if(direction==2) {
                                toadoY--;
                                direction=1;

                            } else {
                                if(direction==3) {
                                    toadoX--;
                                    direction = 0;

                                }
                            }
                        }
                    }
            } else {
                    count++;
                    if(direction==1) {
                        toadoX--;
                        direction= 0;


                    } else if (direction==2) {
                        toadoY++;
                        direction=3;

                    } else if (direction==3) {
                        toadoX++;
                        direction=2;


                    } else if (direction==0) {
                        toadoY--;
                        direction= 1;

                    }
                }
            }

        }
        System.out.println(count);

    }
}