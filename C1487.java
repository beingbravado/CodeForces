import java.util.Scanner;

public class C1487 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[][] dp = new int[n][n];
            for (int g = 1; g < (n + 1) / 2; g++) {
                for (int i = 1, j = g; i < n && j < n; i++, j++) {
                    dp[i][j] = 1;
                }
                for (int i = 1, j = n - g; i < n && j < n; i++, j++) {
                    dp[i][j] = -1;
                }
            }
            for (int i = 1; i < n; i++) {
                for (int j = i; j < n; j++)
                    sb.append(dp[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        scan.close();
    }
}
