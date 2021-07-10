import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Integer[] x = new Integer[n];
            Integer[] y = new Integer[n];
            for (int i = 0; i < n; i++) {
                String[] s = br.readLine().trim().split(" ");
                x[i] = Integer.parseInt(s[0]);
                y[i] = Integer.parseInt(s[1]);
            }

            Arrays.sort(x);
            Arrays.sort(y);
            sb.append(equalDist(x) * equalDist(y) + "\n");
        }
        System.out.println(sb);
    }

    public static long equalDist(Integer[] a) {
        long count = 1;
        int n = a.length;
        if (n % 2 == 0)
            count += a[(n + 1) / 2] - a[(n - 1) / 2];
        // System.out.println(a[(n + 2) / 2] + " " + a[n / 2]);
        return count;
    }
}
