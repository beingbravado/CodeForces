import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1363 {
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            String s = br.readLine();
            int n= s.length();
            int n0=0, n1=0;
            for (int i=0;i<n;i++){
                if (s.charAt(i)=='1')
                    n1++;
                else
                    n0++;
            }
            int ans= Math.min(n0,n1);
            int count=0;
            char x1= s.charAt(0);
            boolean con= true;
            for (int i=0;i<n;i++){
                if (s.charAt(i)!=x1 && con)
                    con= false;
                else if (s.charAt(i)==x1 && !con){
                    count++;
                }
            }
            ans= Math.min(ans,count);
            count=0;
            char x2= s.charAt(n-1);
            boolean don= true;
            for (int i=n-1;i>=0;i--){
                if (s.charAt(i)!=x2 && don)
                    don= false;
                else if (s.charAt(i)==x2 && !don){
                    count++;
                }
            }
            ans= Math.min(ans,count);
            System.out.println(ans);
        }
        br.close();
    }
}
