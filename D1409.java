import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class D1409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] st = br.readLine().split(" ");
            int length= st[0].length();
            long n= Long.parseLong(st[0]);
            long s= Long.parseLong(st[1]);

            long[] a= new long[length];
            long[] b= new long[length+1];

            int l=length;
            long num=n;
            for (int i=0;i<length;i++){
                l--;
                a[i]= num%(long)Math.pow(10,l);
            }
            for (int i=0;i<length+1;i++){
                b[i]=-1;
            }

            long sum= 0;
            boolean cond=false;
            for (int i=0;i<length;i++){
                sum+=a[i];
                if (cond){
                    b[i]=0;
                } else if (sum>s){
                    if (i==0){
                        b[i]=s;
                        b[length]=0;
                    } else {
                        b[i-1]+=sum-s;
                    }
                    cond=true;
                } else {
                    b[i]=a[i];
                }
            }

            long x=0;
            for (int i=0;i<length+1;i++){
                if (b[i]>=0){
                    x = x*10 + b[i];
                }
            }
            long ans = x-n;
            System.out.println(ans);
        }
        br.close();
    }
}
