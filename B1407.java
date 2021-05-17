import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class B1407 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int[] a= new int[n];
            for (int i=0;i<n;i++){
                a[i]= scan.nextInt();
            }
            Arrays.sort(a);
            int num= a[n-1];
            for (int i=n-1;i>=0;i--){
                int index= i;
                if (a[i]>0){
                    int z= Integer.MIN_VALUE;
                    for (int j=i;j>=0;j--){
                        if (a[j]>0){
                            int x= gcd(num,a[j]);
                            if (x>z){
                                z=x;
                                index=j;
                            }
                        }
                    }
                    num=z;
                    System.out.print(a[index]+" ");
                    a[index]=-1;
                    if (index!=i)
                        i++;
                }
            }
            System.out.println();
        }
    }
    static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
}
