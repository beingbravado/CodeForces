import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0){
            long x= Long.parseLong(br.readLine());
            long n=0, sum=1;
            for (long i=1;i<x;){
                long num= i*(i+1)/2;
                if (sum+num>x)
                    break;
                else {
                    n++;
                    sum+=num;
                }
                i=i*2+1;
            }
            System.out.println(n);
        }
    }
}
