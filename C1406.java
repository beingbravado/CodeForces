import java.io.IOException;
import java.util.Scanner;

public class C1406 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int[] a= new int[n];
            for (int i=0;i<n;i++){
                a[i]= scan.nextInt();
            }
            for (int i=n-1;i>=0;i--){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
