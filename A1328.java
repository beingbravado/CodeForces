import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1328 {
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int ans = 0;
            if (a%b>0){
                ans = b-(a%b);
            }
            System.out.println(ans);
        }
        br.close();
    }
}
