import java.io.IOException;
import java.util.Scanner;

public class B1405 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            long[] a= new long[n];
            for (int i=0;i<n;i++){
                a[i]= scan.nextInt();
            }
            long neg=0,pos=0,ans=0;
            for (int i=0;i<n;i++){
                if (a[i]>=0)
                    pos+=a[i];
                else
                {
                    neg-=a[i];
                    if (neg>pos){
                        long num= neg-pos;
                        ans+=Math.abs(num);
                        neg=0;
                        pos=0;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
