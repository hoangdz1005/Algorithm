import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Robot {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int beginX = scanner.nextInt();
        int beginY = scanner.nextInt();
        int direction = scanner.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int numberOfCommand = scanner.nextInt();
        int arrCommand[] = new int[numberOfCommand];
        for(int i=0;i<numberOfCommand;i++) {
            arrCommand[i] = scanner.nextInt();
        }

        for(int i=0;i<arrCommand.length;i++) {
            // đi sang trái
            if(arrCommand[i]==0 && direction==1) {
                if(beginX>=1 && arr[beginX-1][beginY]!=-1) {
                    beginX--;
                    if(arr[beginX][beginY]>=1) {
                        arr[beginX][beginY]--;
                    }
                }

            }
            // đi sang phai
            if(arrCommand[i]==0 && direction==3) {
                if(beginX<n-1 && arr[beginX+1][beginY]!=-1) {
                    beginX++;
                    if(arr[beginX][beginY]>=1) {
                        arr[beginX][beginY]--;
                    }
                }

            }
            // đi len tren
            if(arrCommand[i]==0 && direction==0) {
                if(beginY>=1 && arr[beginX][beginY-1]!=-1) {
                    beginY--;
                    if(arr[beginX][beginY]>=1) {
                        arr[beginX][beginY]--;
                    }
                }

            }
            // đi xuong duoi
            if(arrCommand[i]==0 && direction==2) {
                if(beginY<n-1 && arr[beginX][beginY+1]!=-1) {
                    beginY++;
                    if(arr[beginX][beginY]>=1) {
                        arr[beginX][beginY]--;
                    }
                }
            }
            // chuyen huong sang trai
            if(arrCommand[i]==1) {
                direction++;
                if(direction>3) {
                    direction=0;
                }
            }
            if(arrCommand[i]==2) {
                if(direction==2) {
                    direction = 0;
                } else if (direction==0) {
                    direction = 2;
                } else if (direction==1) {
                    direction = 3;
                } else if(direction==3) {
                    direction = 1;
                }
            }
            if(arrCommand[i]==3) {
                direction--;
                if (direction<0) {
                    direction=3;
                }
            }

        }
        int count = 0;
        for(int i=0; i<n; i++) {
           for(int j=0; j<n; j++) {
               if(arr[i][j]==0) {
                   count++;
               }
           }
        }
        System.out.println(count);

    }
}