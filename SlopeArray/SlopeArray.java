import java.util.Scanner;

public class DoRocCuaMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }
        int k1=0, k2=0;


        for(int i= 0;i<n;i++) {
            k1 = i;
            k2 = i;
            int demL=0, demR=0;
            while( (k1-1)>=0 && arr[k1-1]<arr[k1] ) {
                demL--;
                k1--;
            }
            while((k2+1)<=(n-1)&& arr[k2+1]<arr[k2] ) {
                demR++;
                k2++;
            }
            System.out.print((demR-demL+1)+" ");
        }
    }
}
