import java.io.IOException;
import java.util.Scanner;

public class A1407 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int[] a= new int[n];
            int n0=0,n1=0;
            for (int i=0;i<n;i++){
                a[i]= scan.nextInt();
                if (a[i]==0)
                    n0++;
                else
                    n1++;
            }
            if (n0>=n1 || n1==1){
                System.out.println(n0);
                for (int i=0;i<n0;i++)
                    System.out.print(0+" ");
            } else {
                if (n1%2==1)
                    n1--;
                System.out.println(n1);
                for (int i=0;i<n1;i++)
                    System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}
