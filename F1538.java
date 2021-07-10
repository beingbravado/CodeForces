import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F1538 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().split(" ");
            int l = Integer.parseInt(s[0]);
            int r = Integer.parseInt(s[1]);
            long ans = 0, digit = 1;
            while (r / digit >= 1) {
                ans += r / digit - l / digit;
                digit *= 10;
            }
            sb.append(ans + "\n");
        }
        System.out.println(sb);
    }
}
