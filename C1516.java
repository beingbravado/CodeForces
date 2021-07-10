import java.util.Scanner;

public class C1516 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            sum += a[i];
        }
        // System.out.println(sum);
        if (sum % 2 == 1) {
            System.out.println(0);
        } else {
            if (partition(a, n, sum / 2)) {
                int trailingZeros = 32;
                for (int x : a)
                    trailingZeros = Math.min(trailingZeros, Integer.numberOfTrailingZeros(x));
                System.out.println(1);
                for (int i = 0; i < n; i++) {
                    if (a[i] % (1 << (trailingZeros + 1)) != 0) {
                        System.out.println(i + 1);
                        break;
                    }
                }
            } else {
                System.out.println(0);
            }
        }
        scan.close();
    }

    public static boolean partition(int[] a, int n, int sum) {
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++)
            dp[i][0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = a[i - 1]; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j - a[i - 1]] | dp[i - 1][j];
            }
        }
        return dp[n][sum];
    }
}
