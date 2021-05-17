import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class B1397 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        boolean stop= false;
        long ans = Integer.MAX_VALUE;
//        for (int j = 1; j < a[n - 1]; j++) {
//            long sum = 0;
//            for (int i = 0; i < n; i++) {
////            sum1+= (long)Math.abs(a[i]-(int)Math.pow(x,i));
//                long e = (long) Math.pow((long) j, i);
//                long d = Math.abs(a[i] - e);
//                sum += d;
//            }
////            long test= Math.min(sum1,sum2);
//            ans = Math.min(ans, sum);
//
//        }
        int c=1;
        while(Math.pow(c,n-1)>Integer.MAX_VALUE){
            int p=0,y=1;
            for (int i=0;i<n;i++){
                p+=Math.abs(a[i]-y);
                y*=c;
            }
            ans = Math.min(ans, p);
            c++;
        }

        System.out.println(ans);
    }
}

//    static double nthRoot(int A, int N)
//    {
//
//        double xPre = Math.random() % 10;
//        double eps = 0.001;
//        double delX = 2147483647;
//        double xK = 0.0;
//        while (delX > eps)
//        {
//            xK = ((N - 1.0) * xPre +
//                    (double)A / Math.pow(xPre, N - 1)) / (double)N;
//            delX = Math.abs(xK - xPre);
//            xPre = xK;
//        }
//        return xK;
//    }

