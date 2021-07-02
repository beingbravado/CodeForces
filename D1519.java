import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1519 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Long[] a = new Long[n];
        Long[] b = new Long[n];
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(s1[i]);
            b[i] = Long.parseLong(s2[i]);
        }
        long sum = 0L;
        for (int i = 0; i < n; i++)
            sum += a[i] * b[i];
        long ans = sum;

        for (int i = 0; i < n; i++) {
            int l = i - 1, r = i + 1;
            long total = sum;
            while (l >= 0 && r < n) {
                total -= a[l] * b[l] + a[r] * b[r];
                total += a[l] * b[r] + a[r] * b[l];
                ans = Math.max(ans, total);
                // System.out.println(l + " " + r + " : " + ans);
                l--;
                r++;
            }
        }
        for (int i = 0; i < n; i++) {
            int l = i, r = i + 1;
            long total = sum;
            while (l >= 0 && r < n) {
                total -= a[l] * b[l] + a[r] * b[r];
                total += a[l] * b[r] + a[r] * b[l];
                ans = Math.max(ans, total);
                // System.out.println(l + " " + r + " : " + ans);
                l--;
                r++;
            }
        }
        System.out.println(ans);
    }
}
