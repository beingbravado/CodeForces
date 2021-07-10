import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] c = new int[n];
            int[] a = new int[n];
            int[] b = new int[n];
            String[] s1 = br.readLine().split(" ");
            String[] s2 = br.readLine().split(" ");
            String[] s3 = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                c[i] = Integer.parseInt(s1[i]);
                a[i] = Integer.parseInt(s2[i]);
                b[i] = Integer.parseInt(s3[i]);
            }

            // solution starts here :-

            long[] dp = new long[n];
            dp[1] = c[1] + Math.abs(a[1] - b[1]) + 1;
            long ans = dp[1];
            for (int i = 2; i < n; i++) {
                if (a[i] == b[i])
                    dp[i] = 1;
                else
                    dp[i] = Math.max(dp[i - 1] - Math.abs(a[i] - b[i]) + 1, Math.abs(a[i] - b[i]) + 1);
                dp[i] += c[i];
                ans = Math.max(ans, dp[i]);
            }

            System.out.println(ans);
        }
    }
}
