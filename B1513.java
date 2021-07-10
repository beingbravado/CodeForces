import java.util.Scanner;

public class B1513 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] a = new long[n];
            long ans = 0, MOD = (long) Math.pow(10, 9) + 7;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            long totalAND = a[0];
            for (int i = 0; i < n; i++)
                totalAND &= a[i];
            long count = 0;
            for (int i = 0; i < n; i++)
                if (a[i] == totalAND)
                    count++;
            if (count >= 2) {
                ans = count * (count - 1);
                ans %= MOD;
                long x = n - 2;
                while (x > 0) {
                    ans *= x;
                    ans %= MOD;
                    x--;
                }
            }
            sb.append(ans + "\n");
        }
        System.out.println(sb);
        scan.close();
    }
}
