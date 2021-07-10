import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] c = new int[n];
            int[] cost = new int[n];
            String[] s = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                c[i] = Integer.parseInt(s[i]);
                cost[i] = c[i] + (i >= 2 ? cost[i - 2] : 0);
            }

            long[] dp = new long[n];
            for (int i = 0; i < n; i++)
                dp[i] = (n - i / 2) * c[i] + (i >= 2 ? cost[i - 2] : 0);

            long ans = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++)
                ans = Math.min(ans, dp[i - 1] + dp[i]);
            sb.append(ans + "\n");
        }
        System.out.println(sb);
    }
}
