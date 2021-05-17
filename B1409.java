import java.io.IOException;
import java.util.Scanner;

public class B1409 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            long a= scan.nextInt();
            long b= scan.nextInt();
            long x= scan.nextInt();
            long y= scan.nextInt();
            long n= scan.nextInt();
            long ans= Long.MAX_VALUE;
            {
                if (b-y>=n){
                    ans=Math.min(ans,a* (b-n));
                } else {
                    long num=(a-(n-b+y));
                    if (num>=x)
                        ans=Math.min(ans, num*y);
                    else
                        ans=Math.min(ans,x*y);
                }
            }
            {
                if (a-x>=n){
                    ans= Math.min(ans,b* (a-n));
                } else {
                    long num= (b-(n-a+x));
                    if (num>=y)
                        ans= Math.min(ans,num*x);
                    else
                        ans=Math.min(ans,x*y);
                }

            }
            System.out.println(ans);
        }
    }
}
